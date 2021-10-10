package com.example.listviewexample;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

public class AnimalAdapter extends BaseAdapter {

    private List<Animal> animals;
    private LayoutInflater inflator;

    public AnimalAdapter(List<Animal> animals, Activity activity) {
        this.animals = animals;
        inflator = getLayoutInflater();
    }

    @Override
    public int getCount() {
        return animals.size();
    }

    @Override
    public Object getItem(int position) {
        return animals.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView;

        rowView = inflator.inflate(R.layout.listview_row, null);
        TextView textView = rowView.findViewById(R.id.label);
        textView.setText(animals.get(position).getType());

        ImageView imageView = rowView.findViewById(R.id.imageView);
        ImageView.setImageResource(animals.get(position).getPicId());

        return rowView;
    }
}
