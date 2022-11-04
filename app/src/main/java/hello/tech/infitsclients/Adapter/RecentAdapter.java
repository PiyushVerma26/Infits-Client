package hello.tech.infitsclients.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import hello.tech.infitsclients.Modals.RecentModal;
import hello.tech.infitsclients.R;

public class RecentAdapter extends RecyclerView.Adapter<RecentAdapter.viewHolder> {
    ArrayList<RecentModal> list;
    Context context;
    public RecentAdapter(ArrayList<RecentModal> list, Context context) {
        this.list = list;
        this.context = context;
    }



    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.loglayout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        RecentModal modal=list.get(position);
        holder.amount.setText(modal.getAmount());
        holder.name.setText(modal.getName());
        holder.roti.setText(modal.getRoti());
        holder.gram.setText(modal.getGram());
        holder.image.setImageResource(modal.getImage());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public static class viewHolder extends RecyclerView.ViewHolder {
        TextView name,amount,roti,gram;
        ImageView image;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            amount=itemView.findViewById(R.id.amount);
            roti=itemView.findViewById(R.id.Roti);
            gram=itemView.findViewById(R.id.gram);
            image=itemView.findViewById(R.id.image);
        }
    }
}
