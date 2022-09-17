package com.tradennn1.recyclerview3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CompanyViewHolder extends RecyclerView.ViewHolder {
    private TextView company;

    public CompanyViewHolder(@NonNull View itemView) {
        super(itemView);
        company = itemView.findViewById(R.id.textview);
    }

    public void bind(String textview) {
        company.setText(textview);
    }
}
