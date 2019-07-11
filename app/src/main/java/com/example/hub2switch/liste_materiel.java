package com.example.hub2switch;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class liste_materiel extends Activity {

    ListView simpleList;
    TextView textviewjson;

    private RequestQueue jsonQueue;
    //String Denomination[] =


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        String resultatRequeteString;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_liste_materiel);

        //simpleList = (ListView) findViewById(R.id.simpleListView);

        textviewjson = (TextView) findViewById(R.id.textviewjson2);


        jsonQueue = Volley.newRequestQueue(this);

        JsonParse jsonparse = new JsonParse();
        jsonparse.jsonParse("client.json",textviewjson,jsonQueue);


       //CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), resultatRequete, resultatRequete);

        //simpleList.setAdapter(customAdapter);




}

}