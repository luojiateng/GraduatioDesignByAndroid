package com.jiateng.home.fragment;

import android.view.View;
import android.widget.ListView;

import com.jiateng.R;
import com.jiateng.common.fragment.BaseFragment;
import com.jiateng.home.adapter.ShopAdapter;
import com.jiateng.home.bean.ShopInfo;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Description:
 * @Title: HomeFragment
 * @ProjectName: orderFood
 * @date: 2023/1/10 17:44
 * @author: 骆家腾
 */
public class HomeFragment extends BaseFragment {

    @ViewInject(R.id.list_item_shop)
    private ListView listViewShop;

    @Override
    protected View initView() {
        View view = View.inflate(context, R.layout.fragment_home, null);
        ViewUtils.inject(this, view);
        return view;
    }

    @Override
    protected void initData() {
        super.initData();
        ArrayList<ShopInfo> shopInfos = new ArrayList<ShopInfo>();
        for (int i = 0; i < 20; i++) {
            ShopInfo s = new ShopInfo();
            s.setMonthlySales(123+"");
            s.setShopName("人人乐" + (i + 1) + "店");
            s.setSpace(i + 5 + "km");
            s.setTime("7:00-12:00 14:00-22:00");
            shopInfos.add(s);
        }
        listViewShop.setAdapter(new ShopAdapter(shopInfos));
    }
}
