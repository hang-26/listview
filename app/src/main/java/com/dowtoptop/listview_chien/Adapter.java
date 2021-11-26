package com.dowtoptop.listview_chien;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class ModelListViewAdapter extends BaseAdapter {
    final ArrayList<Model> listModel;

    ModelListViewAdapter(ArrayList<Model> listModel) {
        this.listModel = listModel;
    }

    @Override
    public int getCount() {
        return listModel.size();
    }

    @Override
    public Object getItem(int i) {
        return listModel.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        View viewModel;
        if (view == null) {
            viewModel = View.inflate(parent.getContext(), R.layout.item_listview, null);
        } else viewModel = view;

        Model modle = (Model) getItem(i);
        ImageView img = viewModel.findViewById(R.id.imv_avt);
        if (modle.avatar.equals("1")) {
            img.setImageResource(R.drawable.image_1);
        } else {
            img.setImageResource(R.drawable.im_2);
        }
        TextView tv_name = viewModel.findViewById(R.id.tv_name);
        tv_name.setText(modle.name);
        TextView tv_content = viewModel.findViewById(R.id.tv_content);
        tv_content.setText(modle.content);
        TextView tv_time = viewModel.findViewById(R.id.tv_time);
        tv_time.setText(modle.time);
        return viewModel;
    }
}
