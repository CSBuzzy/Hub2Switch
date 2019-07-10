package com.example.hub2switch;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String Denomination[];
    String ArrayNumSerie[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] Denomination, String[] ArrayNumSerie) {
        this.context = context;
        this.Denomination = Denomination;
        this.ArrayNumSerie = ArrayNumSerie;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return Denomination.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.layout_liste_materiel, null);
        TextView denomination = (TextView) view.findViewById(R.id.denomination);
        TextView numSerie = (TextView) view.findViewById(R.id.numSerie);
        denomination.setText(Denomination[i]);
        numSerie.setText(ArrayNumSerie[i]);

        return view;
    }}