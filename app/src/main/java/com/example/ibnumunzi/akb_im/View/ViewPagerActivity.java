package com.example.ibnumunzi.akb_im.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.ibnumunzi.akb_im.Presenter.CustomPagerAdapter;
import com.example.ibnumunzi.akb_im.R;

public class ViewPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager);

        ViewPager viewPager = (ViewPager) findViewById(R.id.vp);
        viewPager.setAdapter(new CustomPagerAdapter(this));

    }
    public void oke(View view){
        Intent intent = new Intent(ViewPagerActivity.this, MainActivity.class);
        startActivity(intent);
    }
}