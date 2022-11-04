package hello.tech.infitsclients.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import hello.tech.infitsclients.Adapter.breakfastAdapter;
import hello.tech.infitsclients.Modals.mealModal;
import hello.tech.infitsclients.R;
import hello.tech.infitsclients.databinding.FragmentBreakFastBinding;

public class BreakFast extends Fragment {
    FragmentBreakFastBinding binding;
    breakfastAdapter adapter;
    ArrayList<mealModal> list;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentBreakFastBinding.inflate(getLayoutInflater());
        list=new ArrayList<>();
        adapter =new breakfastAdapter(list,getContext());
        binding.mealRecycle.setHasFixedSize(true);
        binding.mealRecycle.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.mealRecycle.setAdapter(adapter);

        list.add(new mealModal(R.drawable.img_2,"Aloo Paratha","Today","6:30 am",R.drawable.img_3));
        list.add(new mealModal(R.drawable.img_2,"Paratha","Today","6:30 am",R.drawable.img_3));
        list.add(new mealModal(R.drawable.img_2,"Onion Paratha","Today","6:30 am",R.drawable.img_3));
        list.add(new mealModal(R.drawable.img_2,"Laccha Paratha","Today","6:30 am",R.drawable.img_3));
        list.add(new mealModal(R.drawable.img_2,"Mix Paratha","Today","6:30 am",R.drawable.img_3));

        return binding.getRoot();
    }
}