package com.example.loginfacebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

import product.Product;
import product.ProductAdapter;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ProductAdapter adapter;
    private ArrayList<Product> productList;
    int[] productImages = {R.drawable.gift, R.drawable.cart, R.drawable.baby, R.drawable.cookie, R.drawable.home, R.drawable.phone, R.drawable.bike, R.drawable.medical, R.drawable.shopping};

    String[] phoneNumber = {"19000001","19000002","19000003","19000004","19000001","19000002","19000003","19000004"};

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

        setUpProductData();
    }

    private void setUpProductData() {

        String[] productName = getResources().getStringArray(R.array.text_view);

        for (int i = 0; i < productName.length; i++) {
            productList.add(new Product(productName[i], productImages[i]));
        }

        adapter.notifyDataSetChanged();
    }


//    public void onItemClick(int position) {
//        Intent intent = new Intent(HomeActivity.this, DetailActivity.class);
//
//        intent.putExtra("NAME",productList.get(position).getName());
//        intent.putExtra("IMAGE",productList.get(position).getImage());
//        intent.putExtra("PHONE",productList.get(position).getPhoneNumber());
//
//        startActivity(intent);
//    }
}
