package hello.tech.infitsclients.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

import hello.tech.infitsclients.Adapter.RecentAdapter;
import hello.tech.infitsclients.Modals.RecentModal;
import hello.tech.infitsclients.R;
import hello.tech.infitsclients.databinding.ActivityLogBinding;

public class LogActivity extends AppCompatActivity {
    ActivityLogBinding binding;
    ArrayList<RecentModal> list;
    RecentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityLogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        list=new ArrayList<>();
        adapter=new RecentAdapter(list,this);
        binding.recentRecycle.setAdapter(adapter);
        binding.recentRecycle.setHasFixedSize(true);
        binding.recentRecycle.setLayoutManager(new LinearLayoutManager(this));
        list.add(new RecentModal(R.drawable.img_8,"Breakfast", "50 kcal","1 Roti","10g"));
        list.add(new RecentModal(R.drawable.img_8,"Breakfast", "50 kcal","1 Roti","10g"));
        list.add(new RecentModal(R.drawable.img_8,"Breakfast", "50 kcal","1 Roti","10g"));
        list.add(new RecentModal(R.drawable.img_8,"Breakfast", "50 kcal","1 Roti","10g"));
        list.add(new RecentModal(R.drawable.img_8,"Breakfast", "50 kcal","1 Roti","10g"));
        list.add(new RecentModal(R.drawable.img_8,"Breakfast", "50 kcal","1 Roti","10g"));
        list.add(new RecentModal(R.drawable.img_8,"Breakfast", "50 kcal","1 Roti","10g"));
        list.add(new RecentModal(R.drawable.img_8,"Breakfast", "50 kcal","1 Roti","10g"));
        list.add(new RecentModal(R.drawable.img_8,"Breakfast", "50 kcal","1 Roti","10g"));
        list.add(new RecentModal(R.drawable.img_8,"Breakfast", "50 kcal","1 Roti","10g"));
        list.add(new RecentModal(R.drawable.img_8,"Breakfast", "50 kcal","1 Roti","10g"));
        list.add(new RecentModal(R.drawable.img_8,"Breakfast", "50 kcal","1 Roti","10g"));
    }
}