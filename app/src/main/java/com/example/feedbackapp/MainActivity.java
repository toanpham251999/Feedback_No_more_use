package com.example.feedbackapp;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;

import com.example.feedbackapp.UserInfo.UserInfo;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.ActionBar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // ẩn title
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);

        //
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        ConfigNavigationView();
        //ẩn bớt phần tử trong slide menu
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_homepage, R.id.nav_assignment, R.id.nav_classs, R.id.nav_module,R.id.nav_enrrollment, R.id.nav_feedback,
                R.id.nav_result, R.id.nav_question, R.id.nav_contact, R.id.nav_logout)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);// điều hướng đến  fragment nav_host_fragment trong layout content_main
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        //hiện thông tin người dùng sau khi đăng nhập, dùng để test
        ShowUserData();
    }
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    void ConfigNavigationView(){
        //chưa dùng tới
        UserInfo userInfo = new UserInfo(getApplicationContext());
        String role = userInfo.role();

        Menu nav_Menu = navigationView.getMenu();
        if(role.equals("admin")){
            //không ẩn đi gì cả, sau này sẽ ẩn Join đi
//            nav_Menu.findItem(R.id.nav_join).setVisible(false);
        }
        else if(role.equals("trainer")){
            nav_Menu.findItem(R.id.nav_enrrollment).setVisible(false);
            nav_Menu.findItem(R.id.nav_feedback).setVisible(false);
            nav_Menu.findItem(R.id.nav_question).setVisible(false);
            //nav_Menu.findItem(R.id.nav_join).setVisible(false);
        }
        else{
            nav_Menu.findItem(R.id.nav_assignment).setVisible(false);
            nav_Menu.findItem(R.id.nav_enrrollment).setVisible(false);
            nav_Menu.findItem(R.id.nav_feedback).setVisible(false);
            nav_Menu.findItem(R.id.nav_result).setVisible(false);
            nav_Menu.findItem(R.id.nav_question).setVisible(false);
            //nav_Menu.findItem(R.id.nav_join).setVisible(false);
        }
    }

    //hàm này để thử xem dữ liệu như token, username, có lưu lại được không
    public void ShowUserData(){
        UserInfo userInfo = new UserInfo(getApplicationContext());
        String toastValue = "token: " + userInfo.token() +
                "\n username: " + userInfo.username() +
                "\n login time: " + userInfo.loginTime() +
                "\n remember: " + userInfo.isRemember() +
                "\n role: " + userInfo.role();
        Toast.makeText(getApplicationContext(),toastValue,Toast.LENGTH_LONG).show();
    }
}