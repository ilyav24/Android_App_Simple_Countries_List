package com.example.simplecountrieslist;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    String[] countries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        countries=getResources().getStringArray(R.array.favoriteCountries);
        setContentView(R.layout.activity_main);
        ListView list=getListView();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,countries);
        setListAdapter(adapter);

        onListItemClick(list,getCurrentFocus(),getSelectedItemPosition(),getSelectedItemId());
    }
    @Override
   public void 	onListItemClick(ListView l, View v, int position, long id){
        Toast.makeText(MainActivity.this,countries[position]+" is great!",Toast.LENGTH_SHORT).show();
    }
}
