package com.example.gitpractice.demo.adapter;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class DemoAdapter extends ArrayAdapter<String> {
    public DemoAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }
}
