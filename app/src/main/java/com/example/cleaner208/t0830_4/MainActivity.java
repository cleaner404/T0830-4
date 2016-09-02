package com.example.cleaner208.t0830_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private final static String Name="Name";
    private final static String Class="Class";
    private final static String Number="Number";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] Names={"孙俊杰","温智博","王胜"};
        String[] Classes={"软工1402","计类1410","无业人员"};
        String[] Numbers={"2014011404","2014011409","2014011406"};

        List<Map<String,Object>> items= new ArrayList<Map<String,Object>>();

        for(int i=0;i<Names.length;i++){
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(Name,Names[i]);
            item.put(Class,Classes[i]);
            item.put(Number,Numbers[i]);
            items.add(item);
        }

        SimpleAdapter adapter=new SimpleAdapter(this,
                items,
                R.layout.item,
                new String[]{Name,Class,Number},
                new int[]{R.id.txtName,R.id.txtClass,R.id.txtNum});

        ListView list=(ListView)findViewById(R.id.listView);
        list.setAdapter(adapter);
    }
}
