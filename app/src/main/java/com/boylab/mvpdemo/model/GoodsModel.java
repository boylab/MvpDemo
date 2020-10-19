package com.boylab.mvpdemo.model;

import android.widget.ArrayAdapter;

import com.boylab.mvpdemo.R;
import com.boylab.mvpdemo.bean.Goods;

import java.util.ArrayList;
import java.util.List;

public class GoodsModel implements IGoodsModel {

    @Override
    public void loadGoodsData(OnLoadListener onLoadListener) {
        onLoadListener.onComplete(getDataFromNet());
    }

    private List<Goods> getDataFromNet(){
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods(R.drawable.image1, "meinv1", 4));
        goodsList.add(new Goods(R.drawable.image2, "meinv2", 4));
        goodsList.add(new Goods(R.drawable.image3, "meinv3", 4));
        goodsList.add(new Goods(R.drawable.image4, "meinv4", 4));
        goodsList.add(new Goods(R.drawable.image5, "meinv5", 4));
        goodsList.add(new Goods(R.drawable.image6, "meinv6", 4));
        goodsList.add(new Goods(R.drawable.image7, "meinv7", 4));
        goodsList.add(new Goods(R.drawable.image8, "meinv8", 4));
        goodsList.add(new Goods(R.drawable.image9, "meinv9", 4));
        return goodsList;
    }

}
