package com.example.hub2switch;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class liste_contact extends AppCompatActivity {

private ImageButton btnEdit;
private ImageButton btnDelete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_liste_contact);

        btnEdit = (ImageButton) findViewById(R.id.bouton_edit);
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        //renvoie sur le formulaire ajout_contact avec les informations éditables
            }
        });

        btnDelete = (ImageButton) findViewById(R.id.bouton_delete);
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        // supprime le contact
            }
        });
    }
}
