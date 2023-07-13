package com.example.ke_ntds.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ke_ntds.R;
import com.example.ke_ntds.model.Expert;

import java.util.List;

public class MyExpertAdapter extends RecyclerView.Adapter<MyExpertAdapter.MyExpertHolder> {

    Context context;
    List<Expert> experts;

    public MyExpertAdapter(Context context, List<Expert> experts) {
        this.context = context;
        this.experts = experts;
    }

    /**
     * Create new views (invoked by the layout manager)
     */
    @NonNull
    @Override
    public MyExpertHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyExpertHolder(LayoutInflater.from(context)
                .inflate(R.layout.expert_view, parent, false));
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    @Override
    public void onBindViewHolder(@NonNull MyExpertHolder holder, int position) {
        holder.imgView.setImageResource(experts.get(position).getImage());
        holder.nameView.setText(experts.get(position).getName());
        holder.emailView.setText(experts.get(position).getEmail());
        holder.specialization.setText(experts.get(position).getSpeciality());
        holder.phoneView.setText(String.valueOf(experts.get(position).getPhone()));
        holder.locationView.setText(experts.get(position).getLocation());
    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    @Override
    public int getItemCount() {
        return experts.size();
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just an Affirmation object.
    static class MyExpertHolder extends RecyclerView.ViewHolder{

        ImageView imgView;
        TextView nameView, emailView, specialization, phoneView, locationView;

        public MyExpertHolder(@NonNull View itemView) {
            super(itemView);

            imgView  = itemView.findViewById(R.id.imageView);
            nameView = itemView.findViewById(R.id.nameTxtView);
            emailView = itemView.findViewById(R.id.emailTxtView);
            specialization = itemView.findViewById(R.id.specialityTxtView);
            phoneView = itemView.findViewById(R.id.phoneTxtView);
            locationView = itemView.findViewById(R.id.locationTxtView);
        }
    }
}
