package com.example.asus.listviewpahlawan;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /*private String[] dataName = {"Cut Nyak Dien",
            "Ki Hajar Dewantara", "R. A. Kartini"};
    */
    private String[] dataName;
    private String[] dataDescription;
    private TypedArray dataPhoto;
    private ArrayList<Hero> heroes;

    private HeroAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        ListView listView = findViewById(R.id.lv_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_2,
                android.R.id.text1,
                dataName);
        listView.setAdapter(adapter);
        */

        adapter = new HeroAdapter(this);
        prepare();
        addItem();

        adapter.setHeroes(heroes);

        ListView listView = findViewById(R.id.lv_list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    Intent MyIntent = new Intent (view.getContext(),Main2Activity.class);
                    startActivityForResult(MyIntent, 0);
                }
                if(i==1)
                {
                    Intent MyIntent = new Intent (view.getContext(),Main3Activity.class);
                    startActivityForResult(MyIntent, 1);
                }
                if(i==2)
                {
                    Intent MyIntent = new Intent (view.getContext(),Main4Activity.class);
                    startActivityForResult(MyIntent, 2);
                }
                if(i==3)
                {
                    Intent MyIntent = new Intent (view.getContext(),Main5Activity.class);
                    startActivityForResult(MyIntent, 3);
                }
                if(i==4)
                {
                    Intent MyIntent = new Intent (view.getContext(),Main2Activity.class);
                    startActivityForResult(MyIntent, 4);
                }
                if(i==5)
                {
                    Intent MyIntent = new Intent (view.getContext(),Main2Activity.class);
                    startActivityForResult(MyIntent, 5);
                }
                if(i==6)
                {
                    Intent MyIntent = new Intent (view.getContext(),Main2Activity.class);
                    startActivityForResult(MyIntent, 6);
                }
                if(i==7)
                {
                    Intent MyIntent = new Intent (view.getContext(),Main2Activity.class);
                    startActivityForResult(MyIntent, 7);
                }
                if(i==8)
                {
                    Intent MyIntent = new Intent (view.getContext(),Main2Activity.class);
                    startActivityForResult(MyIntent, 8);
                }
                if(i==9)
                {
                    Intent MyIntent = new Intent (view.getContext(),Main2Activity.class);
                    startActivityForResult(MyIntent, 9);
                }


                Toast.makeText(MainActivity.this, heroes.get(i).getName(),
                        Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void addItem(){
        heroes = new ArrayList<>();
        for(int i = 0; i < dataName.length; i++){
            Hero hero = new Hero();
            hero.setName(dataName[i]);
            hero.setDescription(dataDescription[i]);
            hero.setPhoto(dataPhoto.getResourceId(i,-1));
            heroes.add(hero);
        }

    }

    private void prepare(){
        dataName = getResources().getStringArray(R.array.data_name);
        dataDescription = getResources().getStringArray(R.array.data_description);
        dataPhoto = getResources().obtainTypedArray(R.array.data_photo);
    }

}
