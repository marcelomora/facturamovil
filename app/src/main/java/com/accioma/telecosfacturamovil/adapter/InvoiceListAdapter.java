package com.accioma.telecosfacturamovil.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.accioma.telecosfacturamovil.R;
import com.accioma.telecosfacturamovil.model.Customer;
import com.accioma.telecosfacturamovil.model.Invoice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by marcelomora on 9/26/15.
 */
public class InvoiceListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private List<Invoice> invoices;

    public InvoiceListAdapter(){
        prepareInvoices();
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.invoice_card, parent, false);
        InvoiceViewHolder ivh = new InvoiceViewHolder(v);
        return ivh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        InvoiceViewHolder ivh = (InvoiceViewHolder) holder;
        ivh.customerName.setText(invoices.get(position).getCustomer().getLastname());
        ivh.amountTotal.setText(invoices.get(position).getAmountTotal().toString());
        ivh.invoiceNumber.setText(invoices.get(position).getInvoiceNumber());
    }

    @Override
    public int getItemCount() {

        return invoices.size();
    }

    public static class InvoiceViewHolder extends RecyclerView.ViewHolder{

        public TextView invoiceNumber;
        public TextView customerName;
        public TextView amountTotal;
        public TextView dateInvoiced;

        public InvoiceViewHolder(View itemView) {
            super(itemView);
            invoiceNumber = (TextView) itemView.findViewById(R.id.invoce_number);
            customerName = (TextView) itemView.findViewById(R.id.customer_name);
            amountTotal = (TextView) itemView.findViewById(R.id.date_invoiced);
        }
    }

    private void prepareInvoices(){
        invoices = new ArrayList<Invoice>();
        List customers = new ArrayList<Customer>();
        customers.add(new Customer("1234567653001", "Gray", "Sacha"));
        customers.add(new Customer("1767635624001", "Black", "Tori"));
        customers.add(new Customer("0989777654001", "Malkova", "Mia"));
        customers.add(new Customer("0738985789001", "Leone", "Sunni"));

        invoices.add(new Invoice(new Float(23.45), (Customer)customers.get(2), new Date(),
                "001", "001", "000000034"));
        invoices.add(new Invoice(new Float(12.25), (Customer)customers.get(0), new Date(),
                "001", "001", "000000035"));
        invoices.add(new Invoice(new Float(9.15), (Customer)customers.get(1), new Date(),
                "001", "001", "000000034"));
        invoices.add(new Invoice(new Float(13.01), (Customer)customers.get(2), new Date(),
                "001", "001", "000000034"));
        invoices.add(new Invoice(new Float(8.04), (Customer)customers.get(3), new Date(),
                "001", "001", "000000034"));
        invoices.add(new Invoice(new Float(7.09), (Customer)customers.get(1), new Date(),
                "001", "001", "000000034"));
        invoices.add(new Invoice(new Float(5.45), (Customer)customers.get(0), new Date(),
                "001", "001", "000000034"));
        invoices.add(new Invoice(new Float(21.12), (Customer)customers.get(3), new Date(),
                "001", "001", "000000034"));
        invoices.add(new Invoice(new Float(9.16), (Customer)customers.get(2), new Date(),
                "001", "001", "000000034"));

    }
}
