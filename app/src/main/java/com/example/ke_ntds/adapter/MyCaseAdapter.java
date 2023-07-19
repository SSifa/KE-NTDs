package com.example.ke_ntds.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ke_ntds.R;
import com.example.ke_ntds.model.Case;

import java.util.List;

public class MyCaseAdapter extends RecyclerView.Adapter<MyCaseAdapter.MyCaseHolder> {

    Context context;
    List<Case> cases;

    public MyCaseAdapter(Context context, List<Case> cases) {
        this.context = context;
        this.cases = cases;
    }

    /**
     * Create new views (invoked by the layout manager)
     */
    @NonNull
    @Override
    public MyCaseHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyCaseHolder(LayoutInflater.from(context)
                .inflate(R.layout.case_view, parent, false));
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    @Override
    public void onBindViewHolder(@NonNull MyCaseHolder holder, int position) {
        holder.imgView.setImageResource(cases.get(position).getImg());
        holder.caseType.setText(cases.get(position).getCaseType());
        if (cases.get(position).getMobility().toString().equals("Severe")){
            holder.mobility.setTextColor(Color.RED);
        }
        holder.mobility.setText(cases.get(position).getMobility());
        holder.location.setText(cases.get(position).getLocation());
    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    @Override
    public int getItemCount() {
        return cases.size();
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just an Affirmation object.
    public static class MyCaseHolder extends RecyclerView.ViewHolder{
        ImageView imgView;
        TextView caseType, mobility, location;

        public MyCaseHolder(@NonNull View itemView) {
            super(itemView);

            imgView = itemView.findViewById(R.id.imageView);
            caseType = itemView.findViewById(R.id.case_type_text_view);
            mobility = itemView.findViewById(R.id.mobility_text_view);
            location = itemView.findViewById(R.id.location_text_view);
        }
    }
}
