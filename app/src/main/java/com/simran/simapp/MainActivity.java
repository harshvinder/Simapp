package com.simran.simapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            String[] Names = {"harsh","simran","sanya","manya"};
            Integer[] drawim = {R.drawable.food,R.drawable.flower,R.drawable.build,R.drawable.bg};

            CustomAdapter mylistadapt = new CustomAdapter(this,Names,drawim);
            ListView smarty = (ListView)findViewById(R.id.harshlist);
            smarty.setAdapter(mylistadapt);

            smarty.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String Names = String.valueOf(parent.getItemAtPosition(position));
                    Toast.makeText(MainActivity.this, Names, Toast.LENGTH_SHORT).show();
                }
            });

        }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
