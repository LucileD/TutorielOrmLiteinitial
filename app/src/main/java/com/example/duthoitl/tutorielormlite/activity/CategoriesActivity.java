package com.example.duthoitl.tutorielormlite.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.duthoitl.tutorielormlite.R;
import com.example.duthoitl.tutorielormlite.bdd.Categorie;
import com.example.duthoitl.tutorielormlite.bdd.DatabaseHelper;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by duthoitl on 11/10/17.
 */

public class CategoriesActivity  extends AppCompatActivity {

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
        setContentView(R.layout.activity_liste_cat);

    }

    @Override
    protected void onResume() {
        super.onResume();
        //on va mettre les résultats dans une liste view
        ListView listView = (ListView) findViewById(R.id.liste_cat);
//
//        try {
//            //récupère le dao pour intérargir avec la table categorie
//            Dao<Categorie, Integer> categorieDao = getHelper().getCategorieDao();
//            ArrayList<HashMap<String, String>> mylist = new ArrayList<HashMap<String, String>>();
//
//            //on récupère la liste de tout ce qui se trouve dans la table
//            final List<Categorie> categories = categorieDao.queryForAll();
//
//            for ( Categorie categorie : categories) {
//                HashMap<String,String> map = new HashMap<String,String>();
//                map.put("nom",categorie.getNom());
//                mylist.add(map);
//            }
//            final SimpleAdapter adapter = new SimpleAdapter (this.getBaseContext(), mylist, R.layout.listview_categorie,
//                    new String[] {"nom"}, new int[] {R.id.v_nom});
//
//            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//                @Override
//                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                    Intent intent = new Intent(CategoriesActivity.this, CategorieActivity.class);
//                    //ne pas oublier de passer l'id de la catégorie à l'autre activité
//                    intent.putExtra("categorie",categories.get(position).getCategorieId()+"");
//                    startActivity(intent);
//                }
//            });
//            listView.setAdapter(adapter);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }



    }

    public void test (){

    }
    public void ajouterCategorie(View v){
        if (v.getId() == R.id.b_add_cat ) {
//            try {
//                EditText editText = (EditText) findViewById(R.id.edit_nouv_cat);
//                if ( !"".equals(editText.getText().toString())){
//                    Dao<Categorie, Integer> categorieDao = getHelper().getCategorieDao();
//                    Categorie cat = new Categorie(editText.getText().toString());
//                    categorieDao.create(cat);
//                    Intent intent = new Intent(getApplicationContext(),CategoriesActivity.class);
//                    finish();
//                    startActivity(intent);
//                }
//
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
        }
    }




}
