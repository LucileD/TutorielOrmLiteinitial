package com.example.duthoitl.tutorielormlite.bdd;



import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;


/**
 * Created by duthoitl on 05/10/17.
 */

@DatabaseTable(tableName = "liencatfilm")
public class LienCatFilm implements Serializable {
    public static final String LIENCATFILM_ID = "id";
    public static final String LIENCATFILM_FILM = "film";
    public static final String LIENCATFILM_CAT = "cat";

    //l'attribut mid, correspond à la colonne id dans la table, et il est généré automatiquement
    @DatabaseField(columnName = LIENCATFILM_ID,generatedId =  true)
    private Integer mid;
    //l'attribut film, correspond à la colonne film dans la table
    //foreign : par défaut à false,
    // quand on le passe à true, cela veut dire qu'il faut faire un lien entre l'objet ici et celui de la table associé
    // foreignAutoRefresh sert à film ici quand celui de la base film est changé
    //@DatabaseField(columnName = LIENCATFILM_FILM, foreign=true,foreignAutoRefresh = true)
    private Film film;
    @DatabaseField(columnName = LIENCATFILM_CAT,foreign=true,foreignAutoRefresh = true)
    private Categorie cat;

    //TODO !!!!!!!!!! obligatoire !!!!!!!!!!
    public LienCatFilm() {}

    public LienCatFilm(Film film, Categorie cat) {
        this.film = film;
        this.cat = cat;
    }
    public Film getFilm() {
        return film;
    }

}
