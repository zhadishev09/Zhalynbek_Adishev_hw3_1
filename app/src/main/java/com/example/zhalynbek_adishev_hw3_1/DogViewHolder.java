package com.example.zhalynbek_adishev_hw3_1;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class DogViewHolder extends RecyclerView.ViewHolder {

    private TextView dogTest;
    public DogViewHolder(View itemView) {
        super(itemView);

        dogTest = itemView.findViewById(R.id.tv_dog);
    }


    public void bind(String dog) {
        dogTest.setText(dog);
    }
}
