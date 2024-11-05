package com.example.latianuts;

import android.os.Bundle;

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

public class MainActivity2 extends AppCompatActivity {
    private List<Product> products = new ArrayList<>();
    private ProductAdapter adapter;
    private RecyclerView rvProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rvProduct = findViewById(R.id.rvv_product);
        rvProduct.setLayoutManager(new GridLayoutManager(this, 2));

        products.add(new Product("Gunting", "sushi.webp", 5000, "kuat dan tahan lama"));
        products.add(new Product("Gunting", "sushi.webp", 5000, "kuat dan tahan lama"));
        products.add(new Product("Gunting", "sushi.webp", 5000, "kuat dan tahan lama"));
        products.add(new Product("Gunting", "sushi.webp", 5000, "kuat dan tahan lama"));
        products.add(new Product("Gunting", "sushi.webp", 5000, "kuat dan tahan lama"));
        products.add(new Product("Gunting", "sushi.webp", 5000, "kuat dan tahan lama"));
        products.add(new Product("Gunting", "sushi.webp", 5000, "kuat dan tahan lama"));
        products.add(new Product("Gunting", "sushi.webp", 5000, "kuat dan tahan lama"));

        products.add(new Product("Gunting", "sushi.webp", 5000, "kuat dan tahan lama"));
        products.add(new Product("Gunting", "sushi.webp", 5000, "kuat dan tahan lama"));
        products.add(new Product("Gunting", "sushi.webp", 5000, "kuat dan tahan lama"));
        products.add(new Product("Gunting", "sushi.webp", 5000, "kuat dan tahan lama"));


        adapter = new ProductAdapter(this, products);
        rvProduct.setAdapter(adapter);
    }
}