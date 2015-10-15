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
import android.widget.Toast;

import com.accioma.telecosfacturamovil.R;
import com.accioma.telecosfacturamovil.activity.InvoiceFormActivity;
import com.accioma.telecosfacturamovil.model.Customer;
import com.accioma.telecosfacturamovil.model.CustomerDAO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcelomora on 10/13/15.
 */
public class CustomerListAdapter  extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    public final static String TAG = CustomerListAdapter.class.getSimpleName();
    private List<Customer> customers;
    private Context mContext;
    private Activity mActivity;

    public CustomerListAdapter(Context context, Activity activity){
        mContext = context;
        mActivity = activity;
        prepareCustomers();
        Log.e(TAG, "customers " + customers.size());
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
        Log.e(TAG, "Bind " + customers.size());
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
                Intent intent = new Intent();
                //intent.putExtra("CUSTOMER", customers.get(position).getFiscalId());
                intent.putExtra("CUSTOMER", customers.get(position));
                CustomerListAdapter.this.mActivity.setResult(InvoiceFormActivity.REQUEST_CUSTOMER,
                        intent);
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
            Log.i(TAG, String.valueOf(getAdapterPosition()));
            //Toast.makeText(view.getContext(), "The item clicked is " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
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
