package com.boylab.mvpdemo.model;

import com.boylab.mvpdemo.bean.Goods;

import java.util.List;

public interface IGoodsModel {

    void loadGoodsData(OnLoadListener onLoadListener);

    interface OnLoadListener{
        void onComplete(List<Goods> goodsList);

        void onError(String msg);
    }

}
