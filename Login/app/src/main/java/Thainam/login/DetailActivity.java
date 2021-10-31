package Thainam.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Bundle bundle =getIntent().getExtras();
        if(bundle == null){
            return;
        }
        UserCooking userCooking = (UserCooking) bundle.get("object");

        TextView tvdetail = findViewById(R.id.tv_detail1);
        TextView tvNameUser = findViewById(R.id.tv_name_user);
        tvNameUser.setText(userCooking.getName());
        tvdetail.setText(userCooking.getDetail());

    }
}