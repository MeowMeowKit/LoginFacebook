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
        Product product1 = new Product("Gift", R.drawable.gift );
        productList.add(product1);

        Product product2 = new Product("Card",R.drawable.cart);
        productList.add(product2);

        Product product3 = new Product("Baby",R.drawable.baby);
        productList.add(product3);

        Product product4 = new Product("Cookie",R.drawable.cookie);
        productList.add(product4);

        Product product5 = new Product("Home",R.drawable.home);
        productList.add(product5);

        Product product6 = new Product("Phone",R.drawable.phone);
        productList.add(product6);

        Product product7 = new Product("Bike",R.drawable.bike );
        productList.add(product7);

        Product product8 = new Product("Shoes",R.drawable.shoes);
        productList.add(product8);

        Product product9 = new Product("Medical",R.drawable.medical );
        productList.add(product9);

        adapter.notifyDataSetChanged();
    }

}
