package com.accioma.telecosfacturamovil.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.accioma.telecosfacturamovil.R;
import com.accioma.telecosfacturamovil.model.Customer;
import com.accioma.telecosfacturamovil.model.CustomerDAO;

import java.util.List;

public class InvoiceFormActivity extends AppCompatActivity {

    private Customer customer;


    public static final int REQUEST_CUSTOMER = 1;
    private Toolbar toolbar;
    private TextView customerText;
    private int customerId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice_form);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        customerText = (TextView) findViewById(R.id.customer_name);
        customerText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InvoiceFormActivity.this, CustomerListActivity.class );
                startActivityForResult(intent, REQUEST_CUSTOMER);
                //startActivity(intent);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode == REQUEST_CUSTOMER){
            customer = (Customer) data.getSerializableExtra("CUSTOMER");
            customerText.setText(customer.getFirstname() + " " + customer.getLastname());
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_invoice, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
