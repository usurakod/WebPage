package com.example.umasurakod.listoflist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class List2 extends AppCompatActivity {

    ListView listView;
    private String flower;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listoflist);

        listView = (ListView)findViewById(R.id.list2);



        Bundle bundle = getIntent().getExtras();
        String data = bundle.getString("Flower");
        if(bundle != null){
            switch (data){
                case "Rose":
                    ArrayAdapter<String> myAdapter1 = new ArrayAdapter<String>(List2.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.Rose));
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Intent myIntent = new Intent(List2.this,NewWebView.class);
                            myIntent.putExtra("Types",listView.getItemAtPosition(position).toString());
                            startActivity(myIntent);
                        }
                    });
                    listView.setAdapter(myAdapter1);
                    break;
                case "Lotus":

                    ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(List2.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.Lotus));
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Intent myIntent = new Intent(List2.this,NewWebView.class);
                            myIntent.putExtra("Types",listView.getItemAtPosition(position).toString());
                            startActivity(myIntent);
                        }
                    });
                    listView.setAdapter(myAdapter2);
                    break;
                case "Lily":

                    ArrayAdapter<String> myAdapter3 = new ArrayAdapter<String>(List2.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.Lily));
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Intent myIntent = new Intent(List2.this,NewWebView.class);
                            myIntent.putExtra("Types",listView.getItemAtPosition(position).toString());
                            startActivity(myIntent);
                        }
                    });
                    listView.setAdapter(myAdapter3);
                    break;
            }
        }

    }
}
