package com.example.luggerz_jovon.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.luggerz_jovon.Lugs;
import com.example.luggerz_jovon.R;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class DriverLugHistoryAdapter extends FirestoreRecyclerAdapter<Lugs, DriverLugHistoryAdapter.DriverLugHistoryHolder> {

    public DriverLugHistoryAdapter(@NonNull FirestoreRecyclerOptions<Lugs> options){
        super(options);
    }

    @NonNull
    @Override
    public DriverLugHistoryAdapter.DriverLugHistoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_mylugs, parent,false);
        return new DriverLugHistoryAdapter.DriverLugHistoryHolder(v);
    }

    @Override
    protected void onBindViewHolder(@NonNull DriverLugHistoryAdapter.DriverLugHistoryHolder holder, int position, @NonNull Lugs lugs) {
        holder.itemDescription.setText(lugs.getItemDescription());
        holder.date.setText(lugs.getDate());
        holder.time.setText(lugs.getTime());
        holder.pickupLocation.setText(lugs.getPickupLocation());
        holder.destination.setText(lugs.getDestination());
        holder.status.setText(lugs.getStatus());


    }



    public class DriverLugHistoryHolder extends RecyclerView.ViewHolder {
        private static final String TAG = "DriverLugAdapter" ;
        TextView itemDescription, date, time, pickupLocation, destination, status;
        FirebaseFirestore lugFirestore = FirebaseFirestore.getInstance();
        String driverId = FirebaseAuth.getInstance().getCurrentUser().getUid();








        public DriverLugHistoryHolder(@NonNull View itemView) {
            super(itemView);
            itemDescription = itemView.findViewById(R.id.list_itemDescription);
            date = itemView.findViewById(R.id.list_date);
            time = itemView.findViewById(R.id.list_time);
            pickupLocation = itemView.findViewById(R.id.list_pickupLocation);
            destination = itemView.findViewById(R.id.list_destination);
            status = itemView.findViewById(R.id.list_status);
        }

    }
}
