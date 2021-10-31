package Thainam.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;



import com.google.android.material.navigation.NavigationView;

public class MainWork extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    MenuView.ItemView gi;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Button chuyen;
    Button chuyenEnjoy;
    Button chuyenWork;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_work);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,
                drawerLayout,
                toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

        chuyen = findViewById(R.id.btn_chuyen_cooking);
        chuyenEnjoy = findViewById(R.id.btn_chuyen_enjoy);
        chuyenWork = findViewById(R.id.btn_chuyen_work);
        chuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentcooking = new Intent(MainWork.this,Cooking.class);
                startActivity(intentcooking);
            }
        });
        chuyenEnjoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentenjoy = new Intent(MainWork.this,UIApplication.class);
                startActivity(intentenjoy);
            }
        });
        chuyenWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenteworrk = new Intent(MainWork.this,Work.class);
                startActivity(intenteworrk);
            }
        });

    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
//        if (id == R.id.nav_home) {
//            Intent intent = new Intent(MainWork.this, MainWork2.class);
//            startActivity(intent);
//            return true;
//        }
//        else
//        if (id == R.id.nav_user) {
//            Intent intent = new Intent(MainWork.this, MainWork2.class);
//            startActivity(intent);
//            return true;
//        }
//        else
        if (id == R.id.nav_login) {
            Intent intent = new Intent(MainWork.this, LoginActivity.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.nav_logout) {
            Intent intent = new Intent(MainWork.this, RegisterActivity.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.nav_aboutus) {
            Intent intent = new Intent(MainWork.this, AboutUs.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.nav_ig) {
            final String appPackageName = "com.instagram.android&hl=vi&gl=US"; // getPackageName() from Context or Activity object
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
            } catch (android.content.ActivityNotFoundException anfe) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
            }
        }
        else
        if (id == R.id.nav_fb) {
            final String appPackageName = "com.facebook.katana&hl=vi&gl=US"; // getPackageName() from Context or Activity object
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
            } catch (android.content.ActivityNotFoundException anfe) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
            }

        }
        else
        if (id == R.id.nav_share) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    String Body = "Download this App";
                    String Sub = "http://play.google.com";
                    intent.putExtra(Intent.EXTRA_TEXT,Body);
                    intent.putExtra(Intent.EXTRA_TEXT,Sub);
                    startActivity(Intent.createChooser(intent,"Share using"));
        }
        else
        if (id == R.id.nav_rate) {
            Intent intent = new Intent(MainWork.this, SendFeedback.class);
            startActivity(intent);
        }
        return true;


    }


}