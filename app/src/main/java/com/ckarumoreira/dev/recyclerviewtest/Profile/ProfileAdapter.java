package com.ckarumoreira.dev.recyclerviewtest.Profile;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ckarumoreira.dev.recyclerviewtest.R;

import java.util.List;

/**
 * Created by carlos.moreira on 20/07/2016.
 */
public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ProfileHolder> {
    private List<Profile> profiles;

    public ProfileAdapter(List<Profile> profiles) {
        this.profiles = profiles;
    }

    @Override
    public ProfileHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_item_card_profile, parent, false);
        ProfileHolder pvh = new ProfileHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(ProfileHolder holder, int position) {
        holder.firstName.setText(profiles.get(position).getFirstName());
        holder.lastName.setText(profiles.get(position).getLastName());
        holder.nickname.setText(profiles.get(position).getNickname());
    }

    @Override
    public int getItemCount() {
        return profiles.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class ProfileHolder extends RecyclerView.ViewHolder {
        CardView card;
        TextView firstName;
        TextView lastName;
        TextView nickname;

        ProfileHolder(View itemView) {
            super(itemView);
            card = (CardView)itemView.findViewById(R.id.card_view);
            firstName = (TextView)itemView.findViewById(R.id.first_name_label);
            lastName = (TextView)itemView.findViewById(R.id.last_name_label);
            nickname = (TextView)itemView.findViewById(R.id.nick_name_label);
        }
    }
}
