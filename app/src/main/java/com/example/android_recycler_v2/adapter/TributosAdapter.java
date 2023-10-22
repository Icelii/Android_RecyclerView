package com.example.android_recycler_v2.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_recycler_v2.R;
import com.example.android_recycler_v2.models.Tributos;

import java.util.List;
public class TributosAdapter extends RecyclerView.Adapter<TributosAdapter.Viewholder> {

        private List<Tributos> tributos;

        public TributosAdapter(List<Tributos> tributos) {
            this.tributos = tributos;
        }

        @NonNull
        @Override
        public TributosAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View v = layoutInflater.inflate(R.layout.tributoitem, parent, false);
            return new Viewholder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull TributosAdapter.Viewholder holder, int position) {
            Tributos t = tributos.get(position);
            holder.setData(t);
        }

        @Override
        public int getItemCount() {
            return tributos.size();
        }

        public class Viewholder extends RecyclerView.ViewHolder {
            Tributos tributosHolder;
            TextView txtnombre, txtedad, txtdistrito, txtalias, txtgenero;

            public Viewholder(@NonNull View itemView) {
                super(itemView);
                txtnombre = itemView.findViewById(R.id.Nombre);
                txtgenero = itemView.findViewById(R.id.Genero);
                txtalias = itemView.findViewById(R.id.Alias);
                txtedad = itemView.findViewById(R.id.Edad);
                txtdistrito = itemView.findViewById(R.id.Distrito);
            }

            public void setData(Tributos t) {
                this.tributosHolder = t;
                txtnombre.setText(t.getNombre());
                txtgenero.setText("Genero: " + t.getGenero());
                txtalias.setText("Alias: " + t.getAlias());
                txtedad.setText("Edad: " + String.valueOf(t.getEdad()));
                txtdistrito.setText("Distrito: " + t.getDistrito().getNumDistrito());
            }
        }
}

