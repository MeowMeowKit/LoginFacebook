package com.example.loginfacebook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import product.Product;

public class DetailActivity extends AppCompatActivity {

    private TextView textViewName;
    private ImageView imageView;
    private ImageView phoneDetail;
    private Product product;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textViewName = findViewById(R.id.text_view_name);
        imageView = findViewById(R.id.image_view);

        Product product = (Product) getIntent().getSerializableExtra("product");

        imageView.setImageResource(product.getImage());
        textViewName.setText(product.getName());

        phoneDetail = findViewById(R.id.imageViewPhone);

        phoneDetail.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity.this, ProductDetail.class);
                startActivity(intent);
            }
        });
    }
}
