package com.daivers.dummyapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListPraktikumAdapter extends RecyclerView.Adapter<ListPraktikumAdapter.ListViewHolder> {
    private ArrayList<Praktikum> listPraktikum;

    public ListPraktikumAdapter(ArrayList<Praktikum> list) {
        this.listPraktikum = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_example, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Praktikum praktikum = listPraktikum.get(position);
        holder.tvTitle.setText(praktikum.getTitle());
        holder.tvSubtitle.setText(praktikum.getSubtitle());
    }

    @Override
    public int getItemCount() {
        return listPraktikum.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvSubtitle;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvSubtitle = itemView.findViewById(R.id.tvSubtitle);
        }
    }
}
