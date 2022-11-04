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

import hello.tech.infitsclients.Modals.mealModal;
import hello.tech.infitsclients.R;

public class breakfastAdapter extends RecyclerView.Adapter<breakfastAdapter.viewHolder> {
    ArrayList<mealModal> list;
    Context context;

    public breakfastAdapter(ArrayList<mealModal> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.meallayout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        mealModal modal= list.get(position);
holder.day.setText(modal.getDay());
holder.time.setText(modal.getTime());
holder.item.setText(modal.getItem());
holder.image.setImageResource(modal.getImg());
holder.icon.setImageResource(modal.getIcon());
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView image,icon;
        TextView  day,time,item;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            item=itemView.findViewById(R.id.item);
            day=itemView.findViewById(R.id.day);
            time=itemView.findViewById(R.id.time);
            icon=itemView.findViewById(R.id.icon);
        }
    }
}
