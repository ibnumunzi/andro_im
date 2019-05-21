package com.example.ibnumunzi.akb_im.View;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ibnumunzi.akb_im.Presenter.AdapterRecyclerView;
import com.example.ibnumunzi.akb_im.R;

import java.util.ArrayList;

public class FriendsFragment extends Fragment {
    private RecyclerView recyclerView;
    private AdapterRecyclerView adapter;
    private ArrayList<friends> mahasiswaArrayList;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_friends, container,false);

        addData();

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        adapter = new AdapterRecyclerView(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
        return view;
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new friends("Ibnu Munzi", "10116128", "085692924182"));
        mahasiswaArrayList.add(new friends("Fadly Yonk", "1214234560", "987654321"));
        mahasiswaArrayList.add(new friends("Ariyandi Nugraha", "1214230345", "987648765"));
        mahasiswaArrayList.add(new friends("Aham Siswana", "1214378098", "098758124"));
        mahasiswaArrayList.add(new friends("Dimas Maulana", "1414370309", "123456789"));
        mahasiswaArrayList.add(new friends("Fadly Yonk", "1214234560", "987654321"));
        mahasiswaArrayList.add(new friends("Ariyandi Nugraha", "1214230345", "987648765"));
        mahasiswaArrayList.add(new friends("Aham Siswana", "1214378098", "098758124"));
        mahasiswaArrayList.add(new friends("Dimas Maulana", "1414370309", "123456789"));
        mahasiswaArrayList.add(new friends("Fadly Yonk", "1214234560", "987654321"));
        mahasiswaArrayList.add(new friends("Ariyandi Nugraha", "1214230345", "987648765"));
        mahasiswaArrayList.add(new friends("Aham Siswana", "1214378098", "098758124"));
    }
    }

