package com.example.zhalynbek_adishev_hw3_1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    private ArrayList<String> dog;
    private RecyclerView bigDog;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bigDog = view.findViewById(R.id.rv_view);
        loadData();
        DogAdapter dogAdapter = new DogAdapter(dog);
        bigDog.setAdapter(dogAdapter);
    }

    private void loadData() {
        dog = new ArrayList<>();
        dog.add("rex");
        dog.add("rex2");
        dog.add("rex3");
        dog.add("rex4");
        dog.add("rex5");
        dog.add("rex6");
        dog.add("rex7");
        dog.add("rex8");
        dog.add("rex9");
        dog.add("rex9");
        dog.add("rex9");
        dog.add("rex9");
        dog.add("rex9");
        dog.add("rex9");
        dog.add("rex9");
        dog.add("rex9");
        dog.add("rex9");
        dog.add("rex9");
        dog.add("rex9");
        dog.add("rex9");
        dog.add("rex9");
        dog.add("rex9");
        dog.add("rex9");
        dog.add("rex9");
        dog.add("rex9");
        dog.add("rex9");
        dog.add("rex9");
        dog.add("rex9");
        dog.add("rex9");
        dog.add("rex9");

    }
}