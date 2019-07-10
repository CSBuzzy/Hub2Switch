package com.example.hub2switch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class fiche_client extends AppCompatActivity {

    private Button btnClientContact;
    private Button btnClientMateriel;
    private ImageButton btnNewClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_fiche_client);

        btnClientContact = (Button) findViewById(R.id.buttonContact);
        btnClientContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goTo_Liste_contact = new Intent(fiche_client.this, liste_contact.class);
                startActivity(goTo_Liste_contact);
            }

        });

        btnClientMateriel = (Button) findViewById(R.id.buttonMateriel);
        btnClientMateriel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goTo_Liste_materiel = new Intent(fiche_client.this, liste_materiel.class);
                startActivity(goTo_Liste_materiel);
            }
        });

        btnNewClient = (ImageButton) findViewById(R.id.bouton_new);
        btnNewClient.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Intent goTo_new_client = new Intent(fiche_client.this, ajout_client.class);
                    startActivity(goTo_new_client);
                }
        });
    }
}
