package com.example.duthoitl.tutorielormlite.bdd;



import java.io.Serializable;

/**
 * Created by duthoitl on 05/10/17.
 */
//@DatabaseTable(tableName = "films")
public class Film implements Serializable {
    public static final String FILMS_TITRE = "titre";
    public static final String FILMS_AUTEUR = "auteur";
    public static final String FILMS_ID = "id";
    public static final String FILMS_ANNEE =  "annee";
    public static final String FILMS_DESCRIPTION =  "description";


    //l'attribut mid, correspond à la colonne id dans la table, et il est généré automatiquement
//    @DatabaseField(columnName = FILMS_ID,generatedId =  true)
    private Integer mid;
    //l'attribut titre, correspond à la colonne titre dans la table
//    @DatabaseField(columnName = FILMS_TITRE)
    private String titre;
    //l'attribut auteur, correspond à la colonne auteur dans la table
//    @DatabaseField(columnName = FILMS_AUTEUR)
    private String auteur;
    //l'attribut annee, correspond à la colonne anne dans la table
//    @DatabaseField(columnName = FILMS_ANNEE)
    private int annee;
    //l'attribut description, correspond à la colonne description dans la table
//    @DatabaseField(columnName = FILMS_DESCRIPTION)
    private String description;

//    public Film () {
//        //TODO !!!!!!!!!! obligatoire !!!!!!!!!!
//    }

    public Film (String titre,String auteur, int annee, String description){
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
        this.description = description;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Film film = (Film) o;

        if (titre != null ? !titre.equals(film.titre) : film.titre != null) return false;
        return auteur != null ? auteur.equals(film.auteur) : film.auteur == null;

    }

}
