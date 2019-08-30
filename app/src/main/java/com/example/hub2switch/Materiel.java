package com.example.hub2switch;

public class Materiel {

    int id;
    String libelle;
    int idClient;
    int idttype;


    public Materiel(int id, String libelle, int idClient, int idttype) {

        this.id = id;
        this.libelle = libelle;
        this.idClient = idClient;
        this.idttype = idttype;

    }

    //Retourne ID du materiel
    public int getIdMateriel() {
        return id;
    }

    //Retourne libelle materiel
    public String getLibelle() {
        return libelle;
    }


    // Retourne id du client du materiel
    public int getIdClientMateriel() {
        return idClient;
    }

    //Retourne idType
    public int getIdType() {
        return idttype;
    }

}
