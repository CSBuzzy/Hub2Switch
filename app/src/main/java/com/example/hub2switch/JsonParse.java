package com.example.hub2switch;

import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonParse {

   private static final String URL = "http://192.168.100.106:8080/hubtoswitch/api/";

    public void jsonParse(final String nomFichierJSON, final RequestQueue jsonQueue, final ListView listviewjson){
        // Instantiate the RequestQueue.


        String urlFinal = URL + nomFichierJSON;
        Log.i("tag","L'url final est " + urlFinal);
        // Request a string response from the provided URL.

        if ("materiel".equals(nomFichierJSON)) {


            JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, urlFinal, null,
                    new Response.Listener<JSONArray>() {



                        @Override
                        public void onResponse(JSONArray response) {

                            JSONArray jsonArray = response;


                            ArrayList<String> ArrayListMateriel = new ArrayList<>();

                            try {
                                for (int n = 0; n < jsonArray.length(); n++) {

                                    JSONObject listeObject = jsonArray.getJSONObject(n);
                                    int id = listeObject.getInt("id");
                                    String libelle = listeObject.getString("libelle");
                                    int numserie = listeObject.getInt("numserie");
                                    String client = listeObject.getString("client");

                                    Materiel materiel = new Materiel(id,libelle,numserie,client);

                                    ArrayListMateriel.add(materiel.getLibelle());


                                    MyAdapter myAdapter=new MyAdapter(listviewjson.getContext(),R.layout.layout_liste_materiel,
                                            ArrayListMateriel, R.id.textViewTest, R.id.ListViewMateriel);

                                    listviewjson.setAdapter(myAdapter);

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


        }else if ("client.json".equals(nomFichierJSON)){

            JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, urlFinal, null,
                    new Response.Listener<JSONArray>() {



                        @Override
                        public void onResponse(JSONArray response) {

                            JSONArray jsonArray = response;


                            ArrayList<String> ArrayListClients = new ArrayList<>();

                            try {
                                for (int n = 0; n < jsonArray.length(); n++) {

                                    JSONObject listeObject = jsonArray.getJSONObject(n);
                                    int id = listeObject.getInt("id");
                                    String nom = listeObject.getString("nom");
                                    String adresse1= listeObject.getString("adresse1");
                                    String adresse2 = listeObject.getString("adresse2");
                                    String idcpville = listeObject.getString("idcpville");


                                    Clients clients = new Clients(id,nom,adresse1,adresse2,idcpville);
                                    String nomClient = clients.getNomClient();
                                    String adresse1Client = clients.getadresse1Client();
                                    String adresse2Client = clients.getadresse2Client();


                                    String All = "Nom du client : " + nomClient + "\n" + "Adresse du client : " + adresse1Client + "\n" + adresse2Client;
                                    ArrayListClients.add(All);



                                    MyAdapter myAdapter=new MyAdapter(listviewjson.getContext(),R.layout.layout_liste_client,
                                            ArrayListClients, R.id.textViewTest, R.id.ListViewClient);

                                    listviewjson.setAdapter(myAdapter);


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

        }else {

        }

    }

}
