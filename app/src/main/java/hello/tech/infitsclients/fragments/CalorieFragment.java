  package hello.tech.infitsclients.fragments;

  import android.content.Intent;
  import android.os.Bundle;
  import android.view.LayoutInflater;
  import android.view.View;
  import android.view.ViewGroup;

  import androidx.annotation.NonNull;
  import androidx.fragment.app.Fragment;
  import androidx.recyclerview.widget.LinearLayoutManager;

  import java.util.ArrayList;

  import hello.tech.infitsclients.Adapter.DailyMealAdapter;
  import hello.tech.infitsclients.Modals.DailyMealModal;
  import hello.tech.infitsclients.R;
  import hello.tech.infitsclients.View.LogActivity;
  import hello.tech.infitsclients.databinding.FragmentCalorieBinding;

  public class CalorieFragment extends Fragment {
    FragmentCalorieBinding binding;
    ArrayList<DailyMealModal> list;
    DailyMealAdapter adapter;

    public CalorieFragment() {
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentCalorieBinding.inflate(getLayoutInflater());
        list=new ArrayList<>();
        adapter=new DailyMealAdapter(list,getContext());
        binding.dailyMealsRecycle.setHasFixedSize(true);
        binding.dailyMealsRecycle.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.dailyMealsRecycle.setAdapter(adapter);
        list.add(new DailyMealModal("Breakfast","Hotdog","200",R.drawable.img_8, "450 kcal"));
        list.add(new DailyMealModal("Breakfast","Hotdog","200",R.drawable.img_8, "450 kcal"));
        list.add(new DailyMealModal("Breakfast","Hotdog","200",R.drawable.img_8, "450 kcal"));
        list.add(new DailyMealModal("Breakfast","Hotdog","200",R.drawable.img_8, "450 kcal"));
        list.add(new DailyMealModal("Breakfast","Hotdog","200",R.drawable.img_8, "450 kcal"));
        list.add(new DailyMealModal("Breakfast","Hotdog","200",R.drawable.img_8, "450 kcal"));
        list.add(new DailyMealModal("Breakfast","Hotdog","200",R.drawable.img_8, "450 kcal"));


        binding.log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), LogActivity.class));
            }
        });
       return binding.getRoot();
    }
}