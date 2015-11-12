package com.example.vesprada.viewact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TitularAdapter extends ArrayAdapter<Titular> {
    private Titular[] data;

    public TitularAdapter(Context context, Titular[] data) {
        super(context, R.layout.list_item_titular, data);
        this.data = data;
    }

    public View getView(int position, View convertView, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.list_item_titular, null);

        TextView tvTitle = (TextView)item.findViewById(R.id.titleLbl);
        TextView tvsubTitle = (TextView)item.findViewById(R.id.subtitleLbl);
        ImageView img = (ImageView)item.findViewById(R.id.photoView);

        tvTitle.setText(this.data[position].getTitle());
        tvsubTitle.setText(this.data[position].getSubtitle());

        img.setImageResource(this.data[position].getImageResource());

        return item;
    }
}
