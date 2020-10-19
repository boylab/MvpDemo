package com.boylab.mvpdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.widget.LinearLayout;

import com.boylab.mvpdemo.adapter.GoodsAdapter;
import com.boylab.mvpdemo.bean.Goods;
import com.boylab.mvpdemo.presenter.GoodsPresenter;
import com.boylab.mvpdemo.view.IGoodsView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements IGoodsView {

    private List<Goods> goodsList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        GoodsPresenter goodsPresenter = new GoodsPresenter(this);
        goodsPresenter.fetch();

    }

    @Override
    public void showGoodsView(List<Goods> goodsList) {
        GoodsAdapter goodsAdapter = new GoodsAdapter(this, goodsList);
        recyclerView.setAdapter(goodsAdapter);
    }

    @Override
    public void showErrorMessage(String msg) {


    }

    /*private void initData() {
        goodsList.add(new Goods(R.drawable.image1, "meinv1", 4));
        goodsList.add(new Goods(R.drawable.image2, "meinv2", 4));
        goodsList.add(new Goods(R.drawable.image3, "meinv3", 4));
        goodsList.add(new Goods(R.drawable.image4, "meinv4", 4));
        goodsList.add(new Goods(R.drawable.image5, "meinv5", 4));
        goodsList.add(new Goods(R.drawable.image6, "meinv6", 4));
        goodsList.add(new Goods(R.drawable.image7, "meinv7", 4));
        goodsList.add(new Goods(R.drawable.image8, "meinv8", 4));
        goodsList.add(new Goods(R.drawable.image9, "meinv9", 4));
    }*/
}