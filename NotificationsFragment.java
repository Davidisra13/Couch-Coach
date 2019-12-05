package com.example.myapplication.ui.notifications;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplication.R;
import com.example.myapplication.ui.MovieList.MovieLinkedList;
import com.example.myapplication.ui.MovieList.MovieObj;

import java.sql.Driver;
import java.util.LinkedList;
import java.util.*;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;
    public LinkedList drama = new LinkedList();



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //drama.add(new MovieObj("Action.movie", "Venom", 2018, "A failed reporter is bonded to an alien entity, one of many symbiotes who have invaded Earth. But the being takes a liking to Earth and"
        //        + " decides to protect it.", "Action", "Ruben Fleischer"));
        //drama.add(new MovieObj("Action.movie", "John Wick Chapter 2", 2017, "After returning to the criminal underworld to repay a debt, John Wick discovers that a large bounty has been put on his life.", "Action", "John Stahelski"));

        MovieObj a1 = new MovieObj("Action.movie", "Venom", 2018, "A failed reporter is bonded to an alien entity, one of many symbiotes who have invaded Earth. But the being takes a liking to Earth and"
                + " decides to protect it.", 0, "Ruben Fleischer");

        MovieObj a2 = new MovieObj("Action.movie", "John Wick Chapter 2", 2017, "After returning to the criminal underworld to repay a debt, John Wick discovers that a large bounty has been put on his life.", 1, "John Stahelski");

        MovieObj a3 = new MovieObj("Action.movie", "Kingsman: The Golden Circle", 2017, "When their headquarters are destroyed and the world is held hostage, the Kingsman's journey leads them to the discovery of an allied spy organization in the United States. "
                + "These two elite secret organizations must band together to defeat a common enemy.", 3,"Mattew Vaughn" );

        MovieObj a4 = new MovieObj("Action.movie", "Deadpool 2", 2018, " Foul-mouthed mutant mercenary Wade Wilson (a.k.a. Deadpool), brings together a team of fellow mutant rogues to protect a young boy with supernatural abilities "
                + "from the brutal, time-traveling cyborg Cable.", 4, "David Leitch");

        MovieObj a5 = new MovieObj("Action.movie", "12 Strong", 2018, " 12 Strong tells the story of the first Special Forces team deployed to Afghanistan after 9/11; under the leadership of a new captain, "
                + "the team must work with an Afghan warlord to take down the Taliban.", 5, "Nicolai Fuglsig");

        MovieObj a6 = new MovieObj("Action.movie", "Aquaman", 2018, "Arthur Curry, the human-born heir to the underwater kingdom of Atlantis, goes on a quest to prevent"
                + " a war between the worlds of ocean and land. ", 6, "James Wan");

        MovieObj a7 = new MovieObj("Action.movie", "Spiderman: Into the Spiderverse", 2018, "Teen Miles Morales becomes Spider-Man of his reality, crossing his path with five counterparts from other"
                + " dimensions to stop a threat for all realities.", 7, "Rodney Rotham");

        //Drama Movies
        MovieObj b1 = new MovieObj("Drama.movie", "Bohemian Rhapsody", 2018, "The story of the legendary British rock band Queen and lead singer Freddie Mercury, "
                + "leading up to their famous performance at Live Aid (1985).", 8, "Bryan Singer");

        MovieObj b2 = new MovieObj("Drama.movie", "Dunkirk", 2017, "Allied soldiers from Belgium, the British Empire, and France are surrounded by the German Army, "
                + "and evacuated during a fierce battle in World War II.", 9, "Christopher Nolan");

        MovieObj b3 = new MovieObj("Drama.movie", "Hacksaw Ridge", 2016, "World War II American Army Medic Desmond T. Doss, who served during the Battle of Okinawa, refuses to kill people, "
                + "and becomes the first man in American history to receive the Medal of Honor without firing a shot.", 10, "Mel Gibson");

        MovieObj b5 = new MovieObj("Drama.movie", "A Star is Born", 2019, "A musician helps a young singer find fame as age "
                + "and alcoholism send his own career into a downward spiral.", 11, "Bradley Cooper");

        MovieObj b6 = new MovieObj("Drama.movie", "The Accountant", 2016, "As a math savant uncooks the books for a new client, the Treasury Department closes in "
                + "on his activities, and the body count starts to rise.", 12, "Gavin O'Connor");

        MovieObj b7 = new MovieObj("Drama.movie", "The Martian", 2015, "An astronaut becomes stranded on Mars after his team assume him dead, "
                + "and must rely on his ingenuity to find a way to signal to Earth that he is alive.", 13, "Ridley Scott");

        MovieObj b8 = new MovieObj("Drama.movie", "Joker", 2019, "In Gotham City, mentally-troubled comedian Arthur Fleck is disregarded and mistreated by society. He then embarks on a downward spiral of revolution and bloody crime."
                + " This path brings him face-to-face with his alter-ego: \"The Joker\".", 14, "Todd Philips");

        //Animated Movies
        MovieObj c1 = new MovieObj("Animated.movie", "Moana", 2016, "In Ancient Polynesia, when a terrible curse incurred by the Demigod Maui reaches Moana's island, "
                + "she answers the Ocean's call to seek out the Demigod to set things right.", 15, "Ron Clements");

        MovieObj c2 = new MovieObj("Animated.movie", "Incredibles 2", 2018, "The Incredibles hero family takes on a new mission, which involves a change in family roles: "
                + "Bob Parr (Mr Incredible) must manage the house while his wife Helen (Elastigirl) goes out to save the world.", 16, "Brad Bird");

        MovieObj c3 = new MovieObj("Animated.movie", "Toy Story 4", 2019, "When a new toy called \"Forky\" joins Woody and the gang, "
                + "a road trip alongside old and new friends reveals how big the world can be for a toy.", 17, "Tom Cooley");

        MovieObj c4 = new MovieObj("Animated.movie", "Ralph Breaks the Internet", 2018, "Six years after the events of \"Wreck-It Ralph,\" Ralph and Vanellope, now friends, discover a wi-fi router in their arcade,"
                + " leading them into a new adventure.", 18, "Rich Moore");

        MovieObj c6 = new MovieObj("Animated.movie", "Kung Fu Panda 3", 2017, "Continuing his \"legendary adventures of awesomeness\", Po must face two hugely epic, "
                + "but different threats: one supernatural and the other a little closer to home.", 19, "Jennifer Yu Nelson");

        MovieObj c7 = new MovieObj("Animated.movie", "Hotel Transylvania 3: Summer Vaction", 2018, "Count Dracula and company participate in a cruise for sea-loving monsters, "
                + "unaware that their boat is being commandeered by the monster-hating Van Helsing family.", 20, "Genndy Tartakovsky");

        MovieObj c8 = new MovieObj("Animated.movie", "The Lego Batman Movie", 2017, "A cooler-than-ever Bruce Wayne must deal with the usual suspects as they plan to rule Gotham City, "
                + "while discovering that he has accidentally adopted a teenage orphan who wishes to become his sidekick.", 21, "Chris McKay");

        //Horror films
        MovieObj d1 = new MovieObj("Horror.movie", "Split", 2017, "Three girls are kidnapped by a man with a diagnosed 23 distinct personalities. "
                + "They must try to escape before the apparent emergence of a frightful new 24th.", 22, "M. Night Shyamalan");

        MovieObj d3 = new MovieObj("Horror.movie", "The Conjuring 2", 2016, "Ed and Lorraine Warren travel to North London to help a single mother raising "
                + "4 children alone in a house plagued by a supernatural spirit.", 23, "James Wan");

        MovieObj d4 = new MovieObj("Horror.movie", "Bird Box", 2018, "Five years after an ominous unseen presence drives most of society to suicide, "
                + "a mother and her two children make a desperate bid to reach safety.", 24, "Susanne Bier");

        MovieObj d5 = new MovieObj("Horror.movie", "A Cure for Wellness", 2017, "An ambitious young executive is sent to retrieve his company's CEO from an idyllic but mysterious \"wellness center\" at a remote location in the Swiss Alps,"
                + " but soon suspects that the spa's treatments are not what they seem.", 25, "Gore Verbinski");

        MovieObj d6 = new MovieObj("Horror.movie", "Raw", 2016, "An innocent teenager, studying to be a vet,"
                + " develops a craving for human flesh.", 26, "Julia Ducournau");

        MovieObj d7 = new MovieObj("Horror.movie", "Hereditary", 2018, "A grieving family is haunted by tragic and disturbing occurrences.", 27, "Ari Aster");

        MovieObj d8 = new MovieObj("Horror.movie", "Halloween", 2018, "Laurie Strode confronts her long-time foe Michael Myers, the masked figure who has haunted her since "
                + "she narrowly escaped his killing spree on Halloween night four decades ago.", 28, "David Gordon Green");

        //Science-Fiction movies
        MovieObj e1 = new MovieObj("Sci-Fi.movie", "Solo: A Star Wars Story", 2018, "During an adventure into the criminal underworld, Han Solo meets his future co-pilot Chewbacca "
                + "and encounters Lando Calrissian years before joining the Rebellion.", 29, "Ron Howard");

        MovieObj e2 = new MovieObj("Sci-Fi.movie", "Rogue One: A Star Wars Story", 2016, "The daughter of an Imperial scientist joins the Rebel Alliance "
                + "in a risky move to steal the Death Star plans.", 30, "Gareth Edwards");

        MovieObj e3 = new MovieObj("Sci-Fi.movie", "Passengers", 2016, "A spacecraft traveling to a distant colony planet and transporting thousands of people has a malfunction in its sleep chambers."
                + " As a result, two passengers are awakened 90 years early.", 31, "Morten Tyldum");

        MovieObj e4 = new MovieObj("Sci-Fi.movie", "Ready Player One", 2018, "When the creator of a virtual reality called the OASIS dies, he makes a posthumous challenge to all OASIS users to find his Easter Egg, "
                + "which will give the finder his fortune and control of his world.", 32, "Steven Spielberg");

        MovieObj e5 = new MovieObj("Sci-Fi.movie", "Alien Covenant", 2017, "The crew of a colony ship, bound for a remote planet, discover an uncharted paradise with a threat "
                + "beyond their imagination, and must attempt a harrowing escape.", 33, "Ridley Scott");

        MovieObj e6 = new MovieObj("Sci-Fi.movie", "Blade Runner 2049", 2017, "A young blade runner's discovery of a long-buried secret leads him to track down former blade runner Rick Deckard, "
                + "who's been missing for thirty years.", 34, "Denis Villeneuve");

        MovieObj e7 = new MovieObj("Sci-Fi.movie", "Jurassic World: Fallen Kingdom", 2018, "When the island's dormant volcano begins roaring to life, "
                + "Owen and Claire mount a campaign to rescue the remaining dinosaurs from this extinction-level event.", 35, "J.A. Bayona");


        //Action
        drama.add(a1);
        drama.add(a2);
        drama.add(a3);
        drama.add(a4);
        drama.add(a5);
        drama.add(a6);
        drama.add(a7);

        //Drama
        drama.add(b1);
        drama.add(b2);
        drama.add(b3);
        drama.add(b5);
        drama.add(b6);
        drama.add(b7);
        drama.add(b8);

        //Animated
        drama.add(c1);
        drama.add(c2);
        drama.add(c3);
        drama.add(c4);
        drama.add(c6);
        drama.add(c7);
        drama.add(c8);

        //Horror
        drama.add(d1);
        drama.add(d3);
        drama.add(d4);
        drama.add(d5);
        drama.add(d6);
        drama.add(d7);
        drama.add(d8);

        //Science-Fiction
        drama.add(e1);
        drama.add(e2);
        drama.add(e3);
        drama.add(e4);
        drama.add(e5);
        drama.add(e6);
        drama.add(e7);

        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View rootView = inflater.inflate(R.layout.fragment_notifications, container, false);
        ListView lv= (ListView) rootView.findViewById(R.id.dramaListView);
        ArrayAdapter adapter=new ArrayAdapter(this.getActivity(),android.R.layout.simple_expandable_list_item_1,drama);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), drama.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}