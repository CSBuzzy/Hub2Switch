package com.example.hub2switch;

import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonParse extends liste_materiel {

   private static final String URL = "http://formation.devatom.net/UDEV2/ProjetFilRouge/JSON/exploded/netgest_";

    public void jsonParse(String nomFichierJSON, final TextView textviewjson, final RequestQueue jsonQueue){
        // Instantiate the RequestQueue.
        String urlFinal = URL + nomFichierJSON;

        // Request a string response from the provided URL.
        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, urlFinal, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {

                        JSONArray jsonArray = response;
                        textviewjson.setText(null);

                        try {
                            for (int n = 0; n < jsonArray.length(); n++) {

                                JSONObject listeObject = jsonArray.getJSONObject(n);

                                String id = listeObject.getString("id");
                                Log.i("tag",id);
                                String nom = listeObject.getString("nom");
                                Log.i("tag",nom);
                                String adresse1 = listeObject.getString("adresse1");
                                Log.i("tag",adresse1);
                                String adresse2 = listeObject.getString("adresse2");
                                Log.i("tag", adresse2);
                                String idcpville = listeObject.getString("idcpville");
                                Log.i("tag",idcpville);

                                textviewjson.append(id + " " + nom + " " + adresse1 +" "+ adresse2 +" "+idcpville + "\n\n");

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });

        jsonQueue.add(request);
    }

}
