package com.parkho.listview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PhCountryItemViewHolder {

    public ImageView ivIcon;

    public TextView tvCountry;

    public PhCountryItemViewHolder(View a_view) {
        ivIcon = a_view.findViewById(R.id.iv_icon);
        tvCountry = a_view.findViewById(R.id.tv_country);
    }
}