package com.accioma.telecosfacturamovil.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.accioma.telecosfacturamovil.R;
import com.accioma.telecosfacturamovil.adapter.CustomerListAdapter;

public class CustomerListActivity extends AppCompatActivity {


    Toolbar toolbar;
    RecyclerView mCustomerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list);
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        //Invoice List
        mCustomerList = (RecyclerView) findViewById(R.id.customer_list);
        mCustomerList.setHasFixedSize(true);
        mCustomerList.setLayoutManager(new LinearLayoutManager(this));
        mCustomerList.setAdapter(new CustomerListAdapter(getApplicationContext(), this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_customer_list, menu);
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
