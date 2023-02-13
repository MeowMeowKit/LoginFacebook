package com.example.loginfacebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

import product.Product;
import product.ProductAdapter;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ProductAdapter adapter;
    private ArrayList<Product> productList;
    int[] productImages = {R.drawable.gift, R.drawable.cart, R.drawable.baby, R.drawable.cookie, R.drawable.home, R.drawable.phone, R.drawable.bike, R.drawable.medical, R.drawable.shopping};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        productList = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));

        adapter = new ProductAdapter(productList);
        recyclerView.setAdapter(adapter);

        ProductData();
    }

    private void ProductData() {

        String[] productName = getResources().getStringArray(R.array.text_view);

        for (int i = 0; i < productName.length; i++) {
            productList.add(new Product(productName[i], productImages[i]));
        }

        adapter.notifyDataSetChanged();
    }

}
