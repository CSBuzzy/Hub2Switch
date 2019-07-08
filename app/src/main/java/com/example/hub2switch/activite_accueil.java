package com.example.hub2switch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activite_accueil extends AppCompatActivity {


private Button bt_accueil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_accueil);

        bt_accueil = (Button) findViewById(R.id.bouton_accueil);

        bt_accueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goTo_liste_client = new Intent(activite_accueil.this, liste_client.class);
                startActivity(goTo_liste_client);
            }

        });

    }
}
