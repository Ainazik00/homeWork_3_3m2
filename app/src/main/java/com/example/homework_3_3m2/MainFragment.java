package com.example.homework_3_3m2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private RecyclerView rvDorama;
    private ArrayList<DoramaModel> doramaList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        loadData();
        initAdapter();
    }

    private void initAdapter() {
        DoramaAdapter adapter = new DoramaAdapter(doramaList);
        rvDorama.setAdapter(adapter);
    }

    private void loadData() {
        doramaList.add(new DoramaModel("https://media.myshows.me/shows/normal/2/f9/2f94b8b08894c5879e9eb4dca4db6c1d.jpg"));
        doramaList.add(new DoramaModel("https://mf-static-ssl.more.tv/jackal/2385665/a6f3d253-edd3-4e98-8efe-7b7ff0439d58_W1920_H890.webp"));
        doramaList.add(new DoramaModel("https://inteatr.ru/wp-content/uploads/2022/08/orig-4-870x400-optimized.jpeg"));
        doramaList.add(new DoramaModel("https://koreahello.ru/wp-content/uploads/2022/02/1644050500-img-20220205-163929.jpg"));
        doramaList.add(new DoramaModel("https://talkimg.imbc.com/TVianUpload/tvian/TViews/image/2023/03/02/09f7d299-99e8-4305-be8c-cf47230e31e2.jpg"));
        doramaList.add(new DoramaModel("https://cdn.yesasia.ru/wp-content/uploads/2023/06/squid-game-thumbnail-061623-780x470-1-700x422.webp"));
        doramaList.add(new DoramaModel("https://resizer.mail.ru/p/a1d601e4-4397-5605-91bd-dd0ccefea7cf/AAACfCFZIn9Qol2AdVk86cru4MMrVV0uwd_CYd3eJQgwRUGYWN02AByAzRIdXR8gWoXNQe3oBYFk9ZpQkxgLLX04ojU.jpg"));
        doramaList.add(new DoramaModel("https://www.asiandrama.ru/wp-content/uploads/2015/06/i-remember-you.jpg"));
        doramaList.add(new DoramaModel("https://zetfix.online/uploads/posts/2023-05/1685441366_flower-of-evil.png"));
        doramaList.add(new DoramaModel("https://s3.stc.all.kpcdn.net/putevoditel/serialy/wp-content/uploads/2023/04/109828.jpg"));

    }

    private void initView() {
        rvDorama = requireActivity().findViewById(R.id.rv_dorama);
    }
}