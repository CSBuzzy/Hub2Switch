package com.example.hub2switch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class liste_client extends AppCompatActivity {

    private ImageButton btnClientAccess;
    private ImageButton btnNewClient;
    private TextView txtClientAccess;
    private TextView txtClients;
    private TextView txtMateriel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_liste_client);

        btnClientAccess = (ImageButton) findViewById(R.id.bouton_client_access);
        btnClientAccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goTo_fiche_client = new Intent(liste_client.this, fiche_client.class);
                startActivity(goTo_fiche_client);
            }

        });

        txtClientAccess = (TextView) findViewById(R.id.client_name);
        txtClientAccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goTo_fiche_client = new Intent(liste_client.this, fiche_client.class);
                startActivity(goTo_fiche_client);
            }

        });

        btnNewClient = (ImageButton) findViewById(R.id.bouton_new);
        btnNewClient.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent goTo_new_client = new Intent(liste_client.this, ajout_client.class);
                startActivity(goTo_new_client);
            }
        });

        txtClients = (TextView) findViewById(R.id.total_client);
        txtClients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goTo_liste_contact = new Intent(liste_client.this, liste_contact.class);
                startActivity(goTo_liste_contact);
            }

        });
        txtMateriel = (TextView) findViewById(R.id.total_materiel);
        txtMateriel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goTo_liste_materiel = new Intent(liste_client.this, liste_materiel.class);
                startActivity(goTo_liste_materiel);
            }

        });

    }
}
