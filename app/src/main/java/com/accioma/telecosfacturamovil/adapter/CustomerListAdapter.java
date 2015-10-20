package com.accioma.telecosfacturamovil.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.accioma.telecosfacturamovil.R;
import com.accioma.telecosfacturamovil.activity.CustomerFormActivity;
import com.accioma.telecosfacturamovil.activity.InvoiceFormActivity;
import com.accioma.telecosfacturamovil.model.Consts;
import com.accioma.telecosfacturamovil.model.Customer;
import com.accioma.telecosfacturamovil.model.CustomerDAO;

import java.util.List;

/**
 * Created by marcelomora on 10/13/15.
 */
public class CustomerListAdapter  extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    public final static String TAG = CustomerListAdapter.class.getSimpleName();
    public final static int SELECT_INVOICE = 1;
    public final static int EDIT_CUSTOMER = 2;

    private List<Customer> customers;
    private Context mContext;
    private Activity mActivity;

    public CustomerListAdapter(Context context, Activity activity){
        mContext = context;
        mActivity = activity;
        prepareCustomers();
    }

    public CustomerListAdapter(Activity activity){
        mActivity = activity;
        prepareCustomers();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.customer_card, parent, false);
        CustomerViewHolder cvh = new CustomerViewHolder(v);
        return cvh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        CustomerViewHolder cvh = (CustomerViewHolder)holder;
        cvh.fin.setText(customers.get(position).getFiscalId());
        cvh.name.setText(customers.get(position).getLastname() + " " +
            customers.get(position).getFirstname());

        cvh.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                //Toast.makeText(mContext, "#" + position + "-"
                //        + customers.get(position).getFirstname() + " "
                //        + customers.get(position).getLastname(), Toast.LENGTH_SHORT).show();
                //intent.putExtra("CUSTOMER", customers.get(position).getFiscalId());
                int mode = mActivity.getIntent().getIntExtra(Consts.PARENT_ACTIVITY_MODE, -1);
                switch (mode) {
                    case SELECT_INVOICE:
                        Intent intent = new Intent();
                        intent.putExtra("CUSTOMER", customers.get(position));
                        CustomerListAdapter.this.mActivity.setResult(InvoiceFormActivity.REQUEST_CUSTOMER,
                                intent);
                        break;
                    case EDIT_CUSTOMER:
                        Intent intent1 = new Intent(CustomerListAdapter.this.mActivity,
                                CustomerFormActivity.class);
                        Log.e(TAG, "Edit customer");
                        CustomerListAdapter.this.mActivity.startActivity(intent1);
                        break;
                }

                CustomerListAdapter.this.mActivity.finish();
            }
        });
    }

    @Override
    public int getItemCount() {
        return customers.size();
    }

    private static class CustomerViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener, View.OnLongClickListener{

        public TextView fin;
        public TextView name;
        private ItemClickListener itemClickListener;

        public CustomerViewHolder(View itemView) {
            super(itemView);
            fin = (TextView) itemView.findViewById(R.id.fin);
            name = (TextView) itemView.findViewById(R.id.name);
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
        }

        public void setItemClickListener(ItemClickListener itemClickListener){
            this.itemClickListener = itemClickListener;
        }

        @Override
        public void onClick(View view) {
            itemClickListener.onClick(view, getAdapterPosition(), false);
        }

        @Override
        public boolean onLongClick(View view) {
            itemClickListener.onClick(view, getAdapterPosition(), true);
            return true;
        }
    }

    private void prepareCustomers() {
        customers = CustomerDAO.readAll();
    }
}
