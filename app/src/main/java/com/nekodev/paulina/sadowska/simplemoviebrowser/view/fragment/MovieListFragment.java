package com.nekodev.paulina.sadowska.simplemoviebrowser.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nekodev.paulina.sadowska.simplemoviebrowser.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by palka on 25.03.2017.
 */

public class MovieListFragment extends Fragment {
    private static final String SAVED_USERS_KEY = "UsersKey";

    @BindView(R.id.recycler_movies)
    RecyclerView mMovieList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie_list, container, false);
        ButterKnife.bind(this, view);
        setupRecyclerView();
        return view;
    }

    private void setupRecyclerView() {
        mMovieList.setLayoutManager(new LinearLayoutManager(getActivity()));
        mMovieList.setHasFixedSize(true);
    }
}
