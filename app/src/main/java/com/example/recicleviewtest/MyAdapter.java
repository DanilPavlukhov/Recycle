package com.example.recicleviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
    Context context;
    List<Food> list;

    public MyAdapter(Context context, List<Food> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        final Food food = list.get(position);
        holder.codeName.setText(list.get(position).getCodeName());
        holder.codeVersion.setText(list.get(position).getCodeVersion());
        //holder.imageView.setImageResource(list.get(position).getInt_Image());
        int i = position;
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Position: " + i + " ID: " + holder.itemView.getId() ,Toast.LENGTH_LONG).show();
            }
        });
        /*switch (i){
            case 0:
                ((ImageView) holder.itemView.findViewById(R.id.image)).setImageResource(R.drawable.picture);
                break;
            case 1:
                ((ImageView) holder.itemView.findViewById(R.id.image)).setImageResource(R.drawable.picture2);
                break;

        }*/


    }



    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder{
        TextView codeName, codeVersion;
        ImageView imageView;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            codeName = itemView.findViewById(R.id.code_name);
            codeVersion = itemView.findViewById(R.id.codeVersion);
            imageView = itemView.findViewById(R.id.image);

        }

    }
}
