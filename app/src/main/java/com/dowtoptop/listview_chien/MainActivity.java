package com.dowtoptop.listview_chien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv_list;
    ArrayList<Model> arr;
    ModelListViewAdapter modelListViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        set_adapter();
    }
    private  void init(){
        lv_list = findViewById(R.id.lv_list);
    }
    private void set_adapter(){
        arr = new ArrayList<>();
        arr.add(new Model("1","Cake","[Cake] Hướng dẫn chứng nhận mail...","15:30"));
        arr.add(new Model("2","You Tube","Cập nhật điều khiển....","24th11"));
        arr.add(new Model("2","You Tube","Cập nhật điều khiển....","24th11"));
        arr.add(new Model("2","You Tube","Cập nhật điều khiển....","24th11"));
        arr.add(new Model("2","You Tube","Cập nhật điều khiển....","24th11"));
        arr.add(new Model("2","You Tube","Cập nhật điều khiển....","24th11"));
        arr.add(new Model("2","You Tube","Cập nhật điều khiển....","24th11"));
        modelListViewAdapter = new ModelListViewAdapter(arr);
        lv_list = findViewById(R.id.lv_list);
        lv_list.setAdapter(modelListViewAdapter);
//        lv_list.setAdapter();

    }
}