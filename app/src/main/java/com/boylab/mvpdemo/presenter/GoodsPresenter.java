package com.boylab.mvpdemo.presenter;

import com.boylab.mvpdemo.bean.Goods;
import com.boylab.mvpdemo.model.GoodsModel;
import com.boylab.mvpdemo.model.IGoodsModel;
import com.boylab.mvpdemo.view.IBaseView;
import com.boylab.mvpdemo.view.IGoodsView;

import java.lang.ref.WeakReference;
import java.util.List;

public class GoodsPresenter<T extends IBaseView>{

    //1、持有view接口
    //2、持有model接口
    //IGoodsView iGoodsView;
    WeakReference<T> iGoodsView;


    IGoodsModel iGoodsModel = new GoodsModel();

    public GoodsPresenter(T baseView) {
        //this.iGoodsView = (IGoodsView) baseView;
        this.iGoodsView = new WeakReference<>(baseView);
    }

    public void fetch(){
        if (iGoodsView.get() != null && iGoodsModel != null){
            iGoodsModel.loadGoodsData(new IGoodsModel.OnLoadListener() {
                @Override
                public void onComplete(List<Goods> goodsList) {
                    ((IGoodsView)iGoodsView.get()).showGoodsView(goodsList);
                }

                @Override
                public void onError(String msg) {

                }
            });
        }
    }

}
