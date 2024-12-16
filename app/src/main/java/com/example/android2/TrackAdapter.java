package com.example.android2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class TrackAdapter extends RecyclerView.Adapter<TrackAdapter.TrackViewHolder> {

    private final List<Track> trackList;

    public TrackAdapter(List<Track> trackList) {
        this.trackList = trackList;
    }

@NonNull
@Override
public TrackViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_track, parent, false);
        return new TrackViewHolder(view);
        }

@Override
public void onBindViewHolder(@NonNull TrackViewHolder holder, int position) {
        Track track = trackList.get(position);
        holder.titleTextView.setText(track.getTitle());
        holder.artistTextView.setText(track.getArtist());
        }

@Override
public int getItemCount() {
        return trackList.size();
        }

static class TrackViewHolder extends RecyclerView.ViewHolder {
    TextView titleTextView;
    TextView artistTextView;
    ImageView iconImageView;

    public TrackViewHolder(@NonNull View itemView) {
        super(itemView);
        titleTextView = itemView.findViewById(R.id.trackTitle);
        artistTextView = itemView.findViewById(R.id.trackArtist);
        iconImageView = itemView.findViewById(R.id.trackIcon);
    }
}
}