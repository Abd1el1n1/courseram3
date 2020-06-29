package com.example.mascotas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class Adaptador extends  RecyclerView.Adapter<Adaptador.ViewHolder>{

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nombre;
        ImageView peyi;

        public ViewHolder(View itemView) {
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.titulo);
            peyi = (ImageView) itemView.findViewById(R.id.imgpeyito);

        }
    }

    public List<MascotasModelo> mascotasLista;

    public Adaptador(List<MascotasModelo> mascotasLista){
        this.mascotasLista = mascotasLista;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mascotas,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
   }
    @Override
    public void  onBindViewHolder(ViewHolder holder, int position){
        holder.nombre.setText(mascotasLista.get(position).getMascota());
        holder.peyi.setImageResource(mascotasLista.get(position).getImgMascota());

  }

    @Override
    public int getItemCount() {
        return mascotasLista.size();
    }
}
