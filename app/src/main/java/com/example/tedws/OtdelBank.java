package com.example.tedws;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class OtdelBank extends AppCompatActivity {
    ListView listView;
    Context context;
    LayoutInflater layoutInflater;
    List<Spisokbankov>spisokbankovs=new ArrayList<>();
    BankListAdapter bankListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otdel_bank);

        AddOtd();
        Vstavka();
    }

    private void AddOtd() {
        spisokbankovs.add(new Spisokbankov("sdsd","123","Rabotaet","12"));
        spisokbankovs.add(new Spisokbankov("sdsd","1","Rabotaet","09"));
        spisokbankovs.add(new Spisokbankov("sdsd","12","Rabotaet","14"));
    }

    private void Vstavka() {
        listView=findViewById(R.id.otdban);
        context=this;
        layoutInflater=layoutInflater.from(context);
        BankListAdapter bankListAdapter=new BankListAdapter();
        listView.setAdapter(bankListAdapter);

    }


    public class BankListAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return spisokbankovs.size();
        }

        @Override
        public Object getItem(int position) {
            return spisokbankovs.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Spisokbankov spis= (Spisokbankov) getItem(position);
            convertView=layoutInflater.inflate(R.layout.spisok_bank, parent, false);
            TextView yt=convertView.findViewById(R.id.adr);
            TextView nv=convertView.findViewById(R.id.otd);
            TextView c=convertView.findViewById(R.id.stat);
            TextView cq=convertView.findViewById(R.id.time);

            yt.setText(spis.getAdress());
            nv.setText(spis.getOtdelenie());
            c.setText(spis.getStatus());
            cq.setText(spis.getVremrab());
            return convertView;
        }
    }
}