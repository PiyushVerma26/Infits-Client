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

import hello.tech.infitsclients.Modals.DailyMealModal;
import hello.tech.infitsclients.R;

public class DailyMealAdapter extends RecyclerView.Adapter<DailyMealAdapter.viewHolder> {
    ArrayList<DailyMealModal> list;
    Context context;

    public DailyMealAdapter(ArrayList<DailyMealModal> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.dailymeals,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        DailyMealModal modal=list.get(position);
        holder.time.setText(modal.getTime());
        holder.name.setText(modal.getName());
        holder.amount.setText(modal.getAmount());
        holder.totalAmount.setText(modal.getTotalAmount());
        holder.image.setImageResource(modal.getImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder
    {
        TextView time,name ,amount,totalAmount;
        ImageView image;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            time=itemView.findViewById(R.id.time);
            name=itemView.findViewById(R.id.name);
            amount=itemView.findViewById(R.id.amount);
            totalAmount=itemView.findViewById(R.id.totalAmount);
            image=itemView.findViewById(R.id.image);
        }
    }
}
