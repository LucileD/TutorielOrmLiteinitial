package com.example.duthoitl.tutorielormlite.bdd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Created by duthoitl on 05/10/17.
 */

//cette classe permet d'accéder aux tables de la base de données
public class DatabaseHelper  extends OrmLiteSqliteOpenHelper {

    //nom du fichier de base de données
    public static final String DATABASE_NAME = "base.db";

    //Dao de toutes les tables de la base de données
    //à chaque fois qu'on ajoute une tables dans la base de données, ne pas oublier de l'ajouter  ici
//    private Dao<Film, Integer> filmDao;
//    private Dao<Categorie, Integer> categorieDao;
//    private Dao<LienCatFilm, Integer> liencatfilmDao;
    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION );
    }


    @Override
    public void onCreate(SQLiteDatabase db, ConnectionSource connectionSource) {
//        try {
//            //appelé à chaque création de la base de données
//            TableUtils.createTable(connectionSource, Film.class);
//            TableUtils.createTable(connectionSource, Categorie.class);
//            TableUtils.createTable(connectionSource, LienCatFilm.class);
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, ConnectionSource connectionSource,
                          int oldVersion, int newVersion) {
//        try {
//            //appelé à chaque mise à jour de la base de données, ( changement de la version ),
//            // supprime les tables pour les recréer
//            TableUtils.dropTable(connectionSource, LienCatFilm.class, true);
//            TableUtils.dropTable(connectionSource, Film.class, true);
//            TableUtils.dropTable(connectionSource, Categorie.class, true);
//            onCreate(db,connectionSource);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }


//    //récupère le dao de la table liencatfilm
//    public Dao<LienCatFilm, Integer> getLiencatfilmDao() throws SQLException {
//        if (liencatfilmDao == null ){
//            liencatfilmDao = getDao(LienCatFilm.class);
//        }
//        return liencatfilmDao;
//    }
//
//    //récupère le dao de la table films
//    public Dao<Film, Integer> getFilmDao() throws SQLException {
//        if (filmDao == null ){
//            filmDao = getDao(Film.class);
//        }
//        return filmDao;
//    }
//
//    //récupère le dao de la table categories
//    public Dao<Categorie, Integer> getCategorieDao() throws SQLException {
//        if (categorieDao == null ){
//            categorieDao = getDao(Categorie.class);
//        }
//        return categorieDao;
//    }
}
