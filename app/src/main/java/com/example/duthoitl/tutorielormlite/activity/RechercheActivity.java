package com.example.duthoitl.tutorielormlite.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.duthoitl.tutorielormlite.R;
import com.example.duthoitl.tutorielormlite.bdd.Categorie;
import com.example.duthoitl.tutorielormlite.bdd.Film;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by duthoitl on 13/10/17.
 */

public class RechercheActivity extends AppCompatActivity {

//    //pour appeler les tables de la base de données
//    private DatabaseHelper databaseHelper = null;
//
//    //récupère l'objet pour appeler les tables
//    private DatabaseHelper getHelper () {
//        if ( databaseHelper == null) {
//            databaseHelper = OpenHelperManager.getHelper(this,DatabaseHelper.class);
//        }
//        return databaseHelper;
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recherche);
    }

    public void rechercher(View v) throws SQLException {
        EditText titre = (EditText) findViewById(R.id.p_titre_r);
        EditText auteur = (EditText) findViewById(R.id.p_auteur_r);
        EditText annee = (EditText) findViewById(R.id.p_annee_r);
        EditText description = (EditText) findViewById(R.id.p_desc_r);

//        //récupère le dao pour intérargir avec la table film
//        Dao<Film,Integer> filmDao = getHelper().getFilmDao();
        ArrayList<HashMap<String, String>> mylist = new ArrayList<HashMap<String, String>>();

//        //initialise la requête voulu sur la table film
//        QueryBuilder<Film, Integer> queryBuilder = filmDao.queryBuilder();
//
//        //écrit la requête, ici équivalent à : select * from films where titre like "%"+titre.getText()+"%" and auteur like "%"+auteur.getText()+"%"
//        queryBuilder.where().like(Film.FILMS_TITRE,"%"+titre.getText()+"%").and().like(Film.FILMS_AUTEUR,"%"+auteur.getText()+"%");
//        //on vérifie qu'une date a bien été renseignée
//        if (!annee.getText().toString().equals("") ){
//            //si on date a été renseignée, on rajoute à la fin de la requête précédente "and annee = annee"
//            // ce qui donne au final :
//            //select * from films where titre like "%"+titre.getText()+"%" and auteur like "%"+auteur.getText()+"%" and annee = Integer.parseInt(annee.getText().toString())
//            queryBuilder.where().eq(Film.FILMS_ANNEE,Integer.parseInt(annee.getText().toString()));
//        }
//
//        //on a fini d'écrire la requête donc on le précise en lui disant qu'il peut lancer la recherche des résultats
//        PreparedQuery<Film> preparedQuery = queryBuilder.prepare();
        ListView listView = (ListView) findViewById(R.id.liste_film_c);
//
//        //on parcour les résultats, "filmDao.query(preparedQuery)" renvoi un iterable sur les résultats
//        for ( Film film : filmDao.query(preparedQuery)) {
//
//            HashMap<String,String> map = new HashMap<String,String>();
//            map.put("titre",film.getTitre());
//            map.put("auteur",film.getAuteur());
//            mylist.add(map);
//
//
//        }
        SimpleAdapter adapter = new SimpleAdapter (this.getBaseContext(), mylist, R.layout.listview_film,
                new String[] {"titre", "auteur"}, new int[] {R.id.v_titre, R.id.v_auteur});
        listView.setAdapter(adapter);
    }
}
