package com.example.hub2switch;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MyAdapter extends ArrayAdapter<String> {

   ArrayList<String> ArrayListMateriel = new ArrayList<>();
   private int ttView, lstView;

   public MyAdapter(Context context, int textViewResourceId, ArrayList<String> objects, int ttView, int lstView) {
      super(context, textViewResourceId, objects);
      ArrayListMateriel = objects;
      this.ttView = ttView;
      this.lstView = lstView;
   }

   @Override
   public int getCount() {
      return super.getCount();
   }

   @Override
   public View getView(int position, View convertView, ViewGroup parent) {

      View v = convertView;
      LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
      v = inflater.inflate(R.layout.layout_test, null);
//      TextView textView = (TextView) v.findViewById(R.id.textViewTest);
//      ListView listView = (ListView) v.findViewById(R.id.ListViewMateriel);
      TextView textView = (TextView) v.findViewById(this.ttView);
      ListView listView = (ListView) v.findViewById(this.lstView);
      textView.setText(ArrayListMateriel.get(position));

      return v;
   }

}