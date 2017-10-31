package com.example.duthoitl.tutorielormlite;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.duthoitl.tutorielormlite.activity.CategorieActivity;
import com.example.duthoitl.tutorielormlite.activity.CategoriesActivity;
import com.example.duthoitl.tutorielormlite.activity.RechercheActivity;
import com.example.duthoitl.tutorielormlite.bdd.Categorie;
import com.example.duthoitl.tutorielormlite.bdd.Film;
import com.example.duthoitl.tutorielormlite.bdd.LienCatFilm;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Accueil extends AppCompatActivity {

    //pour appeler les tables de la base de données
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
        setContentView(R.layout.activity_accueil);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //on va mettre les résultats dans une liste view
        ListView listView = (ListView) findViewById(R.id.liste_film_a);
//        try {
//            //récupère le dao pour intérargir avec la table film
//            final Dao<Film,Integer> filmDao = getHelper().getFilmDao();
            ArrayList<HashMap<String, String>> mylist = new ArrayList<HashMap<String, String>>();

            //on récupère la liste de tout ce qui se trouve dans la table
//            final List<Film> films = filmDao.queryForAll();
            List<Film> films = new ArrayList<>() ;
//            //trie
//            //on initialise une requête
//            QueryBuilder<Film, Integer> queryBuilder = filmDao.queryBuilder();
//            //on fait juste un orderBy avec la colonne de référence et un booléen, true pour ordre croissant, false pour décroissant
//            queryBuilder.orderBy(Film.FILMS_TITRE,true);
//            //on dit que l'on a fini
//            PreparedQuery<Film> preparedQuery = queryBuilder.prepare();
//            for ( Film film : filmDao.query(preparedQuery) ) {

            for ( Film film : films ) {
                HashMap<String,String> map = new HashMap<String,String>();
                map.put("titre",film.getTitre());
                map.put("auteur",film.getAuteur());
                mylist.add(map);
            }
            SimpleAdapter adapter = new SimpleAdapter (this.getBaseContext(), mylist, R.layout.listview_film,
                    new String[] {"titre", "auteur"}, new int[] {R.id.v_titre, R.id.v_auteur});
//            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//                @Override
//                public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
//                    final Film film = films.get(position);
//                    AlertDialog.Builder builder = new AlertDialog.Builder(Accueil.this);
//                    builder.setMessage("Vous allez supprimer le film, êtes vous sur de vouloir continuer ?");
//                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
//
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//                            // faire suppression*/
//                            try {
//                                filmDao.delete(film);
//                                Intent intent = new Intent(getApplicationContext(),Accueil.class);
//                                finish();
//                                startActivity(intent);
//                            } catch (SQLException ee) {
//                                ee.printStackTrace();
//                            }
//                        }
//                    });
//                    builder.create().show();
//                }
//            });
            listView.setAdapter(adapter);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }

    public void genererBDD(View v) throws SQLException {
        if (v.getId() == R.id.b_gene_bdd ){
//            //on récupère les Dao des tables
//            Dao<Film,Integer> filmDao = getHelper().getFilmDao();
//            Dao<Categorie,Integer> categorieDao = getHelper().getCategorieDao();
//            Dao<LienCatFilm,Integer> lienCatfilmsDao = getHelper().getLiencatfilmDao();

//            //on crée les catégories
//            Categorie cat1 = new Categorie("vu");
//            Categorie cat2 = new Categorie("à voir");
//
//            //on crée un film
//            String titre = "Blade runner 2049";
//            String auteur = "Denis Villeneuve";
//            int annee = 2017;
//            String description = "En 2049, la société est fragilisée par les nombreuses tensions entre les humains et leurs esclaves créés par bioingénierie. L’officier K est un Blade Runner : il fait partie d’une force d’intervention d’élite chargée de trouver et d’éliminer ceux qui n’obéissent pas aux ordres des humains.";
//            Film film = new Film(titre,auteur,annee,description);
//
//            //on crée un lien entre un film et une catégorie
//            LienCatFilm lien = new LienCatFilm(film,cat2);

//            //on ajoute les catégories dans la BDD
//            categorieDao.create(cat1);
//            categorieDao.create(cat2);
//
//            //on ajoute le film dans la BDD
//            filmDao.create(film);
//
//            //on ajoute le lien dans la BDD
//            lienCatfilmsDao.create(lien);

//            description = "A la suite de circonstances indépendantes de sa volonté, une jeune étudiante voit ses capacités intellectuelles se développer à l’infini. ";
//            film = new Film("Lucy", "Luc Besson", 2014,description);
//            filmDao.create(film);
//            lien = new LienCatFilm(film,cat1);
//            lienCatfilmsDao.create(lien);
//
//
//            description = "L’élite du renseignement britannique en costumes trois pièces, est à la recherche de sang neuf. ";
//            film = new Film("Kingsman : Services secrets", "Matthew Vaughn", 2015,description);
//            filmDao.create(film);
//            lien = new LienCatFilm(film,cat1);
//            lienCatfilmsDao.create(lien);
//
//            description = "La rencontre improbable, touchante et drôle entre un riche aristocrate, tétraplégique depuis un accident de parapente, et un jeune de banlieue engagé par hasard pour être son aide à domicile";
//            film = new Film("Intouchables", "Eric Toledano, Olivier Nakache", 2011,description);
//            filmDao.create(film);
//            lien = new LienCatFilm(film,cat1);
//            lienCatfilmsDao.create(lien);
//
//            description = "Au lieu de subtiliser un rêve, un voleur expérimenté et son équipe doivent faire l'inverse : implanter une idée dans l'esprit d'un individu. ";
//            film = new Film("Inception", "Christopher Nolan", 2010,description);
//            filmDao.create(film);
//            lien = new LienCatFilm(film,cat2);
//            lienCatfilmsDao.create(lien);
//
//            description = "Zootopia est une ville qui ne ressemble à aucune autre : seuls les animaux y habitent";
//            film = new Film("Zootopie", "Byron Howard, Rich Moore", 2016,description);
//            filmDao.create(film);
//            lien = new LienCatFilm(film,cat1);
//            lienCatfilmsDao.create(lien);
//
//            description = "En l'an 2026, deux ans après avoir été libérés de S.A.O, Kazuto et ses amis survivants profitent enfin de jours paisibles. Récemment, la réalité augmentée est devenue possible grâce à l'Augma, et avec cette mode vient son lot de modifications du quotidien.";
//            film = new Film("Sword Art Online Movies", "Tomohiko Itō", 2017,description);
//            filmDao.create(film);
//            lien = new LienCatFilm(film,cat1);
//            lienCatfilmsDao.create(lien);
//
//            description = "Programmeur anonyme, Thomas Anderson est aussi l'un des pirates les plus recherchés du cyber-space. Il est contacté par un certain Morpheus. Ensemble, ils se lancent dans une lutte sans retour contre la Matrice et ses terribles agents";
//            film = new Film("Matrix", "Lana Wachowski, Lilly Wachowski", 1994,description);
//            filmDao.create(film);
//            lien = new LienCatFilm(film,cat1);
//            lienCatfilmsDao.create(lien);
//
//            description = "Sur la lointaine planète de Pandora, Jake Sully, un héros malgré lui, se lance dans une quête de rédemption, de découverte, d'amour inattendu, dont l'issue sera un combat héroïque pour sauver toute une civilisation.";
//            film = new Film("Avatar", "James Cameron", 2009,description);
//            filmDao.create(film);
//            lien = new LienCatFilm(film,cat1);
//            lienCatfilmsDao.create(lien);
//
//            description = "Les péripéties du rat Rémy dans les coulisses d'un grand restaurant parisien.";
//            film = new Film("Ratatouille", "Brad Bird", 2007,description);
//            filmDao.create(film);
//            lien = new LienCatFilm(film,cat1);
//            lienCatfilmsDao.create(lien);
//
//            description = "1940 : Alan Turing, mathématicien, cryptologue, est chargé par le gouvernement Britannique de percer le secret de la célèbre machine de cryptage allemande Enigma, réputée inviolable.";
//            film = new Film("Imitation Game", "Morten Tyldum", 2015,description);
//            filmDao.create(film);
//            lien = new LienCatFilm(film,cat2);
//            lienCatfilmsDao.create(lien);
//
//            description = "En 1945, dans une immense demeure victorienne isolée sur l'île de Jersey située au large de la Normandie, vit Grace, une jeune femme pieuse, et ses deux enfants, Anne et Nicholas. Un jour d'épais brouillard, trois domestiques frappent à la porte de la maison isolée.";
//            film = new Film("Les Autres", "Alejandro Amenábar", 2001,description);
//            filmDao.create(film);
//            lien = new LienCatFilm(film,cat2);
//            lienCatfilmsDao.create(lien);
//
//            description = "Un cascadeur tranquille et anonyme se métamorphose dès que la nuit tombe : il devient pilote de voitures pour le compte de la mafia. La combine est bien rodée jusqu’au jour où l'un des casses tourne mal et l’entraîne dans une course-poursuite infernale.";
//            film = new Film("Drive", "Nicolas Winding Refn", 2011,description);
//            filmDao.create(film);
//            lien = new LienCatFilm(film,cat1);
//            lienCatfilmsDao.create(lien);
//
//            description = "";
//            film = new Film("Intouchables", "Eric Toledano, Olivier Nakache", 2011,description);
//            filmDao.create(film);
//            lien = new LienCatFilm(film,cat1);
//            lienCatfilmsDao.create(lien);
//
//            description = "KINGSMAN, l’élite du renseignement britannique en costume trois pièces, fait face à une menace sans précédent. Alors qu’une bombe s’abat et détruit leur quartier général, les agents font la découverte d’une puissante organisation alliée nommée Statesman, fondée il y a bien longtemps aux Etats-Unis.";
//            film = new Film("Kingsman : Le Cercle d'or", "Matthew Vaughn", 2017,description);
//            filmDao.create(film);
//            lien = new LienCatFilm(film,cat2);
//            lienCatfilmsDao.create(lien);
//
//            description = "2073. La Terre est surpeuplée. Le gouvernement décide d’instaurer une politique d’enfant unique, appliquée de main de fer par le Bureau d’Allocation des Naissances, sous l’égide de Nicolette Cayman.";
//            film = new Film("Seven Sisters ", "Tommy Wirkola", 2017,description);
//            filmDao.create(film);
//            lien = new LienCatFilm(film,cat1);
//            lienCatfilmsDao.create(lien);


            Intent intent = new Intent(getApplicationContext(),Accueil.class);
            finish();
            startActivity(intent);

        }
    }

    public void voirCategories(View v) {
        Intent intent = new Intent(getApplicationContext(),CategoriesActivity.class);
        startActivity(intent);
    }

    public void allerRechercher(View v){
        Intent intent = new Intent(getApplicationContext(),RechercheActivity.class);
        startActivity(intent);
    }

}
