package com.boylab.mvpdemo.view;

import com.boylab.mvpdemo.bean.Goods;

import java.util.List;

/**
 * UI逻辑
 */
public interface IGoodsView extends IBaseView {

    //显示图片、文字
    //加载进度条
    //加载动画等

    void showGoodsView(List<Goods> goodsList);
}
