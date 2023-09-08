package com.example.zhalynbek_adishev_hw3_1;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DogAdapter extends RecyclerView.Adapter<DogViewHolder> {

    private ArrayList<String> dog;
    public DogAdapter (ArrayList<String> dog){
        this.dog = dog;
    }

    @NonNull
    @Override
    public DogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DogViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dog,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DogViewHolder holder, int position) {
        holder.bind(dog.get(position));

    }

    @Override
    public int getItemCount() {
        return dog.size();
    }
}
