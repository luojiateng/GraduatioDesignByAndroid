package com.jiateng.order.fragment;

import static com.jiateng.order.utils.Const.ORDRE_STATUS_CANCEL;
import static com.jiateng.order.utils.Const.ORDRE_STATUS_FINISH;

import android.view.View;
import android.widget.ListView;

import com.jiateng.R;
import com.jiateng.common.fragment.BaseFragment;
import com.jiateng.order.adapter.OrderAdapter;
import com.jiateng.order.bean.HistoryOrder;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @Description:
 * @Title: OrderFragment
 * @ProjectName: orderFood
 * @date: 2023/1/10 17:44
 * @author: 骆家腾
 */
public class OrderFragment extends BaseFragment {
    @ViewInject(R.id.list_item_order_history)
    private ListView orderListView;

    @Override
    protected View initView() {
        View view = View.inflate(context, R.layout.fragment_order, null);
        ViewUtils.inject(this, view);
        return view;
    }

    @Override
    protected void initData() {
        super.initData();
        ArrayList<HistoryOrder> orders = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            HistoryOrder historyOrder = new HistoryOrder();
            historyOrder.setShopName("户县软面" + (i + 1) + "店");
            historyOrder.setPaid(10.0);
            historyOrder.setStatus(i % 2 == 0 ? ORDRE_STATUS_FINISH : ORDRE_STATUS_CANCEL);
            historyOrder.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            orders.add(historyOrder);
        }
        orderListView.setAdapter(new OrderAdapter(orders));

    }
}
