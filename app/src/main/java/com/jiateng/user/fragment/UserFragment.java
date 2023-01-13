package com.jiateng.user.fragment;


import android.content.Intent;
import android.view.View;

import com.jiateng.R;
import com.jiateng.common.fragment.BaseFragment;
import com.jiateng.user.activity.AddressActivity;
import com.jiateng.user.activity.FeedbackActivity;
import com.jiateng.user.activity.LoginActivity;
import com.jiateng.user.activity.MoreActivity;
import com.jiateng.user.activity.SettingActivity;
import com.jiateng.user.activity.StarActivity;
import com.jiateng.user.widget.UserItemView;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;

/**
 * @Description:
 * @Title: UserFragment
 * @ProjectName: orderFood
 * @date: 2023/1/10 17:44
 * @author: 骆家腾
 */
public class UserFragment extends BaseFragment {
    @ViewInject(R.id.user_item_address)
    private UserItemView address;
    @ViewInject(R.id.user_item_star)
    private UserItemView start;
    @ViewInject(R.id.user_item_more)
    private UserItemView more;
    @ViewInject(R.id.user_item_feedback)
    private UserItemView report;
    @ViewInject(R.id.user_item_setting)
    private UserItemView setting;

    @Override
    protected View initView() {
        View view = View.inflate(context, R.layout.fragment_user, null);
        ViewUtils.inject(this, view);
        return view;
    }

    @OnClick({R.id.user_item_setting,
            R.id.user_item_address,
            R.id.user_item_star,
            R.id.user_item_more,
            R.id.user_item_feedback,
            R.id.user_item_login})
    private void changeActivity(View view) {
        switch (view.getId()) {
            case R.id.user_item_setting:
                startActivity(new Intent(context, SettingActivity.class));
                break;
            case R.id.user_item_address:
                startActivity(new Intent(context, AddressActivity.class));
                break;
            case R.id.user_item_star:
                startActivity(new Intent(context, StarActivity.class));
                break;
            case R.id.user_item_more:
                startActivity(new Intent(context, MoreActivity.class));
                break;
            case R.id.user_item_feedback:
                startActivity(new Intent(context, FeedbackActivity.class));
                break;
            case R.id.user_item_login:
                startActivity(new Intent(context, LoginActivity.class));
            default:
                break;
        }
    }
}
