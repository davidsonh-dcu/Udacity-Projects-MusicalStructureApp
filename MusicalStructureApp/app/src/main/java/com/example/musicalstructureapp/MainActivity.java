package com.example.musicalstructureapp;
// Reference for list of musical artists: https://en.wikipedia.org/wiki/List_of_UK_Singles_Chart_number_ones_of_the_2000s#Number-one_singles
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create a list of words
        ArrayList<Artist> artists = new ArrayList<Artist>();

        // populate the artists list
        // inline construction of new word object using 'new'
        artists.add (new Artist ("Westlife" , "I Have a Dream / Seasons in the Sun",
                R.drawable.westlife));
        artists.add (new Artist ("Manic Street Preacher" , "The Masses Against the Classes",
                R.drawable.manic_street_preachers));
        artists.add (new Artist ("Britney Spears" , "Born to Make You Happy",
                R.drawable.britney));
        artists.add (new Artist ("Gabrielle" , "Rise",
                R.drawable.gabrielle));
        artists.add (new Artist ("Oasis" , "Go Let It Out",
                R.drawable.oasis));
        artists.add (new Artist ("All Saints" , "Pure Shores",
                R.drawable.all_saints));
        artists.add (new Artist ("Chicane featuring Bryan Adams" , "Don't Give Up",
                R.drawable.chicane));
        artists.add (new Artist ("Geri Halliwell" , "Bag It Up",
                R.drawable.geri_halliwell));
        artists.add (new Artist ("Melanie C featuring Lisa \"Left Eye\" Lopes" , "Never Be the Same Again",
                R.drawable.mel_c));
        artists.add (new Artist ("Craig David" , "Fill Me In",
                R.drawable.craig_david));

        ArtistAdapter adapter = new ArtistAdapter(this, artists);

        ListView listView = (ListView) findViewById(R.id.list);

        assert listView != null;
        listView.setAdapter(adapter);

        // Set onClick listeners on the imageViews for each artist
        // Ref: https://stackoverflow.com/questions/41535903/adding-onclicklistener-to-specific-items-in-listview
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    // create a new intent to open the {@link Westlife Activity}
                    Intent westlifeIntent = new Intent (MainActivity.this, WestlifeActivity.class);
                    // set the new Westlife activity
                    startActivity(westlifeIntent);
                }

                else if(position == 1){
                    // create a new intent to open the {@link Manic Street Preachers Activity}
                    Intent manicStreetPreachersIntent = new Intent (MainActivity.this, ManicStreetPreachersActivity.class);
                    // set the new Manic Street Preachers activity
                    startActivity(manicStreetPreachersIntent);
                }

                else if(position == 2){
                    // create a new intent to open the {@link Britney Activity}
                    Intent britneyIntent = new Intent (MainActivity.this, BritneyActivity.class);
                    // set the new Westlife activity
                    startActivity(britneyIntent);
                }
                // TODO Add additional Intents for the other items on the listView
                else{
                    Toast.makeText(MainActivity.this, "Under Construction", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }

}