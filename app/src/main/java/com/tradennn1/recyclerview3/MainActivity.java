package com.tradennn1.recyclerview3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> companyList = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycle_view);

        companyList.add("Apple");
        companyList.add("Amazon");
        companyList.add("Microsoft");
        companyList.add("Facebook");
        companyList.add("Tesla");
        companyList.add("Puma");
        companyList.add("Nike");
        companyList.add("Adidas");
        companyList.add("Toyota");
        companyList.add("Lexus");
        companyList.add("Mercedes-Benz");
        companyList.add("BMW");
        companyList.add("Ford");
        companyList.add("Porsche");
        companyList.add("BBC");
        companyList.add("Google");
        companyList.add("Coca-Cola");
        companyList.add("Mc-Donald's");
        companyList.add("KFC");
        companyList.add("BurgerKing");
        companyList.add("Walt Disney");
        companyList.add("Visa");
        companyList.add("Samsung");
        companyList.add("Sony");
        companyList.add("Lego");
        companyList.add("Rolex");
        companyList.add("LG");
        companyList.add("Shell");

        CompanyAdapter adapter = new CompanyAdapter(companyList);
        recyclerView.setAdapter(adapter);
    }
}