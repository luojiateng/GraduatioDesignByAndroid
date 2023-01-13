package com.jiateng.order.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jiateng.R;
import com.jiateng.order.bean.HistoryOrder;

import java.util.List;

/**
 * @Description:
 * @Title: OrderAdapter
 * @ProjectName: orderFood
 * @date: 2023/1/11 12:59
 * @author: 骆家腾
 */
public class OrderAdapter extends BaseAdapter {
    private List<HistoryOrder> orderList;

    public OrderAdapter() {
    }

    public OrderAdapter(List<HistoryOrder> orderList) {
        this.orderList = orderList;
    }


    @Override
    public int getCount() {
        return orderList.size();
    }

    @Override
    public Object getItem(int position) {
        return orderList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_order_order, null);
        TextView tv_name = itemView.findViewById(R.id.order_item_shopInfo);
        tv_name.setText(orderList.get(position).getShopName());

        TextView tv_paid = itemView.findViewById(R.id.order_item_pay);
        tv_paid.setText(orderList.get(position).getPaid() + "");

        TextView tv_status = itemView.findViewById(R.id.order_item_status);
        tv_status.setText(orderList.get(position).getStatus());

        TextView tv_time = itemView.findViewById(R.id.order_item_time);
        tv_time.setText(orderList.get(position).getTime());
        return itemView;
    }
}
