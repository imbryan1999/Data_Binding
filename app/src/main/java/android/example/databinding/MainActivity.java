package android.example.databinding;

import android.example.databinding.databinding.ActivityMainBinding;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        activityMainBinding.setMyVariable("Hello Data Binding...");

        User user = new User("Your Lovely", 22, false, "https://picsum.photos/id/237/200/300.jpg");

        activityMainBinding.setUser(user);

//        activityMainBinding.button.setOnClickListener(v -> {
//            Toast.makeText(this, "Button is Clicked...", Toast.LENGTH_SHORT).show();
//        });

    }
}