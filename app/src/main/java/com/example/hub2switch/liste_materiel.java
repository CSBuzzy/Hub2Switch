package com.example.hub2switch;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class liste_materiel extends Activity {

    private RecyclerView recyclerview;
    protected RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    ListView simpleList;
    TextView textviewjson;
    TextView addTextView;
    RecyclerView recyclerMateriel;
    RelativeLayout layoutParent;
    private RequestQueue jsonQueue;
    int chiffre = 0;
    //String Denomination[] =


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_liste_materiel);

        textviewjson = (TextView) findViewById(R.id.textViewDemo);
        Log.i("tag", "le message " + textviewjson);
        jsonQueue = Volley.newRequestQueue(this);


       // setContentView(R.layout.layout_liste_materiel);
        JsonParse jsonparse = new JsonParse();
        jsonparse.jsonParse("materiel.json",jsonQueue,textviewjson);

     //  recyclerview = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
      // recyclerview.setHasFixedSize(true);

        // use a linear layout manager
      // layoutManager = new LinearLayoutManager(this);
      //  recyclerview.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
      //  mAdapter = new MyAdapter(chiffre);
      //  recyclerview.setAdapter(mAdapter);



}

}