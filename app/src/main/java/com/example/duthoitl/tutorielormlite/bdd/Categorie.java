package com.example.duthoitl.tutorielormlite.bdd;



import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * Created by duthoitl on 05/10/17.
 */

//on précise que la classe correspond à la table catégories dans notre base de donnée
@DatabaseTable(tableName = "categories")
public class Categorie  implements Serializable {
    public static final String CATEGORIES_NOM = "nom";
    public static final String CATEGORIES_ID = "id";

    //l'attribut nom, correspond à la colonne nom dans la table
    @DatabaseField(columnName = CATEGORIES_NOM )
    private String nom;

    //l'attribut mid, correspond à la colonne id dans la table, et il est généré automatiquement
    @DatabaseField(columnName = CATEGORIES_ID, generatedId = true)
    private Integer mid;

    //TODO !!!!!!!!!! obligatoire !!!!!!!!!!
    public  Categorie () {}

    public Categorie (String nom){
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public Integer getCategorieId() {
        return mid;
    }

}
