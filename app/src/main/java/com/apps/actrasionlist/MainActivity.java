package com.apps.actrasionlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String [] datawisata;
    private String [] datadeskripsi;
    private TypedArray dataphoto;
    private wisata_adapter adapter;
    private ArrayList<attraksi> places;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new wisata_adapter(this);
        ListView listView = findViewById(R.id.lv_list);
        listView.setAdapter(adapter);

        prepare();
        addItem();
    }
    public void addItem() {
        places = new ArrayList<>();
        for (int i = 0; i < datawisata.length; i++) {
            attraksi place = new attraksi();
            place.setImage(dataphoto.getResourceId(i, -1 ));
            place.setPlacename(datawisata[i]);
            place.setArtikel(datadeskripsi[i]);
            places.add(place);
        }
        adapter.setattraksi(places);
    }
    public void prepare() {
        datawisata = getResources().getStringArray(R.array.data_wisata);
        datadeskripsi = getResources().getStringArray(R.array.artikel);
        dataphoto = getResources().obtainTypedArray(R.array.img_photo);
    }
}
