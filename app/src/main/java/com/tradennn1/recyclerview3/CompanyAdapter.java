package com.tradennn1.recyclerview3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CompanyAdapter  extends RecyclerView.Adapter<CompanyViewHolder> {
    private ArrayList<String> companyList;

    public CompanyAdapter(ArrayList<String> companyList) {
        this.companyList = companyList;
    }

    @NonNull
    @Override
    public CompanyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CompanyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_company, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CompanyViewHolder holder, int position) {
        holder.bind(companyList.get(position));
    }

    @Override
    public int getItemCount() {
        return companyList.size();
    }
}
