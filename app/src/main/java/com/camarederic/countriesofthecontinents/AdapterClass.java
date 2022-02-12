package com.camarederic.countriesofthecontinents;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.camarederic.countriesofthecontinents.activities.AfricaActivity;
import com.camarederic.countriesofthecontinents.activities.AntarcticaActivity;
import com.camarederic.countriesofthecontinents.activities.AsiaActivity;
import com.camarederic.countriesofthecontinents.activities.AustraliaOceaniaActivity;
import com.camarederic.countriesofthecontinents.activities.EuropeActivity;
import com.camarederic.countriesofthecontinents.activities.NorthAmericaActivity;
import com.camarederic.countriesofthecontinents.activities.SouthAmericaActivity;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.CardViewHolder> {

    private ArrayList<ModelClass> modelList;
    private Context context;

    public AdapterClass(ArrayList<ModelClass> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design,parent,false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterClass.CardViewHolder holder, int position) {

        ModelClass model = modelList.get(position);

        holder.textViewSplash.setText(model.getCategoryName());
        holder.imageViewSplash.setImageResource(context.getResources().getIdentifier(model.getImageName(),
                "drawable", context.getPackageName()));

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position == 0){
                    Intent intent = new Intent(context, EuropeActivity.class);
                    context.startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(context, AfricaActivity.class);
                    context.startActivity(intent);
                }
                if (position == 2){
                    Intent intent = new Intent(context, NorthAmericaActivity.class);
                    context.startActivity(intent);
                }
                if (position == 3){
                    Intent intent = new Intent(context, SouthAmericaActivity.class);
                    context.startActivity(intent);
                }
                if (position == 4){
                    Intent intent = new Intent(context, AsiaActivity.class);
                    context.startActivity(intent);
                }
                if (position == 5){
                    Intent intent = new Intent(context, AustraliaOceaniaActivity.class);
                    context.startActivity(intent);
                }
                if (position == 6){
                    Intent intent = new Intent(context, AntarcticaActivity.class);
                    context.startActivity(intent);
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewSplash;
        private TextView textViewSplash;
        private CardView cardView;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewSplash = itemView.findViewById(R.id.imageViewSplash);
            textViewSplash = itemView.findViewById(R.id.textViewSplash);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
