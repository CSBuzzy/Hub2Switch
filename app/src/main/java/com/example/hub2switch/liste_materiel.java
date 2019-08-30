package com.example.hub2switch;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class liste_materiel extends Activity {

    private RecyclerView recyclerview;
    protected RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    ListView simpleList;
    ListView ListViewJson;
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

        ListViewJson = (ListView) findViewById(R.id.ListViewMateriel);
        jsonQueue = Volley.newRequestQueue(this);


        JsonParse jsonparse = new JsonParse();
        jsonparse.jsonParse("materiel.json",jsonQueue,ListViewJson);


/*
        try
        {
            String jsonInput = "[\"one\",\"two\",\"three\",\"four\",\"five\",\"six\",\"seven\",\"eight\",\"nine\",\"ten\"]";
            JSONArray jsonArray = new JSONArray(jsonInput);
            int length = jsonArray.length();
            List<String> listContents = new ArrayList<String>(length);
            for (int i = 0; i < length; i++)
            {
                listContents.add(jsonArray.getString(i));
            }

            ListView myListView = (ListView) findViewById(R.id.ListViewMateriel);
            myListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listContents));
        }
        catch (Exception e)
        {
            // this is just an example
        }


*/
}

}