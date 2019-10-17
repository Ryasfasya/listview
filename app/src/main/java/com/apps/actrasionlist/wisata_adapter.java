package com.apps.actrasionlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class wisata_adapter extends BaseAdapter {
    private Context context;
    private ArrayList<attraksi> places = new ArrayList<>();

    public void setattraksi(ArrayList<attraksi> places) {
        this.places = places;
    }

    public wisata_adapter(Context context)  {
        this.context = context;
        //this.places = places;
    }

    @Override
    public int getCount() { //mengembalikan isi relisnya
        return places.size();
    }

    @Override
    public Object getItem(int i) { //mengembalikan sesuai dengan posisinya
        return places.get(i);
    }

    @Override
    public long getItemId(int i) { //
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) { //memberitahu isian item place unruk mengisikannya
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.clasitem, viewGroup, false);
        }

        ViewHolder viewHolder = new ViewHolder(view);
        attraksi places = (attraksi) getItem(i);
        viewHolder.bind(places);
        return view;
    }

    private class ViewHolder {
        private TextView txt_name;
        private TextView artikel;
        private ImageView img_photo;

        ViewHolder (View view) {
            txt_name = view.findViewById(R.id.txt_nama);
            artikel = view.findViewById(R.id.txt_artikel);
            img_photo = view.findViewById(R.id.praw);
        }
    void bind (attraksi places) {
            txt_name.setText(places.getPlacename());
            artikel.setText(places.getArtikel());
            img_photo.setImageResource(places.getImage());
        }
    }
}
