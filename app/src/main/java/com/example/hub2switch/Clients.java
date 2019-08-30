package com.example.hub2switch;


public class Clients {

    int id;
    String nom;
    String adresse1;
    String adresse2;
    String idCpVille;



    public Clients(int id, String nom, String adresse1, String adresse2,String idCpVille) {

        this.id = id;
        this.nom = nom;
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
        this.idCpVille = idCpVille;

    }

    //Retourne ID du materiel
    public int getIdClient() {
        return id;
    }

    //Retourne nom client
    public String getNomClient() {
        return nom;
    }


    // Retourne adresse1
    public String getadresse1Client() {
        return adresse1;
    }

    //Retourne adresse2
    public String getadresse2Client() {
        return adresse2;
    }

    //Retourne ID cp ville client
    public String getIdCpVilleClient() {
        return idCpVille;
    }

}
