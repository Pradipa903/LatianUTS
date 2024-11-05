package com.example.latianuts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.ProductAdapter;
import model.Product;

public class MainActivity extends AppCompatActivity {
    private List<Product> products = new ArrayList<>();
    private ProductAdapter adapter;
    private RecyclerView rvProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        Button button = findViewById(R.id.buttonNavigate);
        button.setOnClickListener((v) -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        });
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;


        });

        rvProduct = findViewById(R.id.rv_product);
        rvProduct.setLayoutManager(new GridLayoutManager(this, 2));

        products.add(new Product("Gunting", "sushi.webp", 5000, "kuat dan tahan lama"));

        adapter = new ProductAdapter(this, products);
        rvProduct.setAdapter(adapter);
    }
}