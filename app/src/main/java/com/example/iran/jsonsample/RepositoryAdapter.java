package com.example.iran.jsonsample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class RepositoryAdapter extends ArrayAdapter<Repository> {

    public RepositoryAdapter(@NonNull Context context, @NonNull List<Repository> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Repository Repositorycurrent = getItem(position);

        TextView Repositoryname = convertView.findViewById(R.id.name);
        Repositoryname.setText(Repositorycurrent.getName());

        TextView r = convertView.findViewById(R.id.R_name);
        r.setText(Repositorycurrent.getR());



        return convertView;
    }
}
