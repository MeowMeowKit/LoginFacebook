package com.example.loginfacebook;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import product.Product;

public class ProductDetail extends AppCompatActivity {
    private TextView textViewName;
    private ImageView imageView;
    private Product product;
    private LinearLayout button;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_detail);

//        String phone = getIntent().getStringExtra("PHONE");
        String phone = "1900199";
        TextView phoneNumber = findViewById(R.id.phoneNumber);


        textViewName = findViewById(R.id.textViewPhone);
        imageView = findViewById(R.id.imageViewPhone);
        button = findViewById(R.id.phone);

        Product product = (Product) getIntent().getSerializableExtra("product");

        imageView.setImageResource(R.drawable.phone_android);
        textViewName.setText("Android");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+ phone));
                startActivity(intent);
            }
        });

        phoneNumber.setText(phone);
    }
}
