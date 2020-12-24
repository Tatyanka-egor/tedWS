package com.example.tedws;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class OtdelBank extends AppCompatActivity {
    ListView listView;
    Context context;
    LayoutInflater layoutInflater;
    List<Spisokbankov>spisokbankovs=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otdel_bank);

        Vstavka();
    }

    private void Vstavka() {
        listView=findViewById(R.id.otdban);
        context=this;
        layoutInflater=layoutInflater.from(context);
        //BankListAdapter bankListAdapter=new BankListAdapter;

    }


    //class BankListAdapter extends BaseAdapter {
       // @Override
        //public int getCount() {
         //   return 0;
       // }

       // @Override
      //  public Object getItem(int position) {
         //   return null;
      //  }

       // @Override
        //public long getItemId(int position) {
       //     return 0;
        //}

        //@Override
       // public View getView(int position, View convertView, ViewGroup parent) {
       //     return null;
       // }
    //}
}