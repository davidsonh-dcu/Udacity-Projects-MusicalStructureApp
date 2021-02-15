package com.example.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<Artist> {
    /**
     * custom constructor to inflate the layout file and to populate the required data into the list
     * @param context The current context. Used to inflate the layout file
     * @param artists The list of artists to display in the list
     */
    public ArtistAdapter(Activity context, ArrayList<Artist> artists){
        // Here the ArrayAdapter internal storage for the context and list is initialised
        // This is a customer adapter for two TextViews and an ImageView so the second argument for this
        // method is not used so is set to 0
        super(context, 0, artists);
    }
    /**
     * View for AdapterView
     * @param position The position in the list of data that should be displayed in the list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //check if current view is being used otherwise inflate the view
        View listViewItem = convertView;
        if(listViewItem == null){
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.row_item, parent, false);
        }

        // Get the {@link Artist} object located at this position in the list artists
        Artist currentArtist = getItem(position);

        // Find the TextView in the list row_list.xml layout with the artist name
        TextView artistNameTextView = (TextView) listViewItem.findViewById(R.id.textViewNameOfArtist);
        // Get the artist name from the current Artist object and set this text on artist name TextView
        artistNameTextView.setText(currentArtist.getmMusicalArtist());

        // Find the TextView in the list row_list.xml layout with the song title
        TextView songTitleTextView = (TextView) listViewItem.findViewById(R.id.textViewSongTitle);
        // Get the song title from the current Artist object and set this text as the song TextView
        songTitleTextView.setText(currentArtist.getmSongTitle());

        // Find the ImageView in the list row_list.xml layout with the id imageViewArtist
        ImageView artistImageView = (ImageView) listViewItem.findViewById(R.id.imageViewArtist);
        // Get the image resource ID from the current Artist object and set the image to iView
        artistImageView.setImageResource(currentArtist.getmArtistImageId());

        // Return the whole list item layout with two TextView  and an imageView to display in the ListView
        return listViewItem;
    }
}
