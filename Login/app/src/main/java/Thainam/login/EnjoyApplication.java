package Thainam.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import app.App;
import category.Category;
import category.CategoryAdapter;

public class EnjoyApplication extends AppCompatActivity {

    private RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enjoy_application);
        rcvCategory = findViewById(R.id.rcv_category);
        categoryAdapter = new CategoryAdapter(this);

        LinearLayoutManager  linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvCategory.setLayoutManager(linearLayoutManager);

        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);
    }

    private List<Category> getListCategory() {
        List<Category> listCategory = new ArrayList<>();

        List<App> listApp = new ArrayList<>();
        listApp.add(new App(R.drawable.anh33,"Spotify"));
        listApp.add(new App(R.drawable.anh33,"Music"));
        listApp.add(new App(R.drawable.anh33,"Youtube"));
        listApp.add(new App(R.drawable.anh33,"Zing mp3"));

        listCategory.add(new Category("Music",listApp));
        listCategory.add(new Category("Watch film",listApp));
        listCategory.add(new Category("Read book",listApp));
        listCategory.add(new Category("Music",listApp));

        return listCategory;
    }
}