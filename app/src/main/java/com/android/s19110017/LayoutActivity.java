package com.android.s19110017;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.s19110017.databinding.MainActivityBinding;

public class LayoutActivity extends AppCompatActivity {

    MainActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MainActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        final String[] name = {"Vagabond Sack", "Stella Sunglasses", "Whitney Belt", "Garden Strand", "Awsome Thing", "Gucci Socks"};
        int[] image = {R.drawable.bag, R.drawable.sunglass, R.drawable.belt, R.drawable.ring, R.drawable.thing, R.drawable.socks};
        String[] price = {"$99", "$120", "$35", "$98", "$160", "$22"};

        GridAdapter gridAdapter = new GridAdapter(LayoutActivity.this, name, image, price);
        binding.gridView.setAdapter(gridAdapter);


        binding.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(LayoutActivity.this, "Bạn nhấp vào " + name[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}