package com.example.duthoitl.tutorielormlite.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.duthoitl.tutorielormlite.R;
import com.example.duthoitl.tutorielormlite.bdd.DatabaseHelper;
import com.example.duthoitl.tutorielormlite.bdd.LienCatFilm;
import com.example.duthoitl.tutorielormlite.bdd.Film;
import com.j256.ormlite.android.apptools.OpenHelperManager;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by duthoitl on 13/10/17.
 */

public class CategorieActivity extends AppCompatActivity {

    //pour appeler les tables de la base de données
    private DatabaseHelper databaseHelper = null;

    //récupère l'objet pour appeler les tables
    private DatabaseHelper getHelper () {
        if ( databaseHelper == null) {
            databaseHelper = OpenHelperManager.getHelper(this,DatabaseHelper.class);
        }
        return databaseHelper;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorie);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //recupère l'id de la catégorie dont on veut afficher les films
        Intent i = getIntent();
        String sidd = i.getStringExtra("categorie");
        Integer idd = Integer.parseInt(sidd);

//        try {
            //récupère le dao pour intérargir avec la table liencatfilm
//            Dao<LienCatFilm, Integer> liencatfilmDao = getHelper().getLiencatfilmDao();
            //initialise la requête voulu sur la table liencatfilm
//            QueryBuilder<LienCatFilm, Integer> queryBuilder = liencatfilmDao.queryBuilder();

            //écrit la requête, ici équivalent à : select * from liencatfilm where cat = idd, donc tous les livre appartenir à la catégorie voulu
//            queryBuilder.where().eq(LienCatFilm.LIENCATFILM_CAT, idd);

            //on a fini d'écrire la requête donc on le précise en lui disant qu'il peut lancer la recherche des résultats
//            PreparedQuery<LienCatFilm> preparedQuery = queryBuilder.prepare();

            //on va mettre les résultats dans une liste view
            ListView listView = (ListView) findViewById(R.id.liste_film_c);
            ArrayList<HashMap<String, String>> mylist = new ArrayList<HashMap<String, String>>();

//            //on parcour les résultats, "liencatfilmDao.query(preparedQuery)" renvoi un iterable sur les résultats
//            for ( LienCatFilm lien : liencatfilmDao.query(preparedQuery)) {
//                //avec les clés étrangères des ORMs, on a pu directement stocker l'objet Film dans la table liencatfilm, l'ORM fait lui même l'affiliation dans les tables
//                Film film = lien.getFilm();
//                if (film == null) {
//                    liencatfilmDao.delete(lien);
//                }else {
//                    HashMap<String, String> map = new HashMap<String, String>();
//                    map.put("titre", film.getTitre());
//                    map.put("auteur", film.getAuteur());
//                    mylist.add(map);
//                }
//
//
//            }
            SimpleAdapter adapter = new SimpleAdapter (this.getBaseContext(), mylist, R.layout.listview_film,
                    new String[] {"titre", "auteur"}, new int[] {R.id.v_titre, R.id.v_auteur});
            listView.setAdapter(adapter);




//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void ajouterFilm(View v ){

    }


}
