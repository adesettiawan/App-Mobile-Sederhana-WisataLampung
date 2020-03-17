package com.example.listwisatalampung;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    public ArrayList<String> fotoWisata = new ArrayList<>();
    public ArrayList<String> namaWisata = new ArrayList<>();
    public ArrayList<String> detailWisata = new ArrayList<>();
    public Context context;

    public RecyclerViewAdapter(ArrayList<String> fotoWisata, ArrayList<String> namaWisata, ArrayList<String> detailWisata, Context context) {
        this.fotoWisata = fotoWisata;
        this.namaWisata = namaWisata;
        this.detailWisata = detailWisata;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_tour, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        Glide.with(context).asBitmap().load(fotoWisata.get(position)).into(holder.imageViewFoto);
        holder.textNamaWisata.setText(namaWisata.get(position));
        holder.detail.setText(detailWisata.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(context, namaWisata.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("foto",fotoWisata.get(position));
                intent.putExtra("nama", namaWisata.get(position));
                intent.putExtra("detail", detailWisata.get(position));

                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return namaWisata.size();

    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        CircleImageView imageViewFoto;
        TextView textNamaWisata, detail;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewFoto = itemView.findViewById(R.id.imageViewFoto);
            textNamaWisata = itemView.findViewById(R.id.textNamaWisata);
            detail = itemView.findViewById(R.id.detail);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
