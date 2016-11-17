package com.sds.study.recordapp.record;

import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.sds.study.recordapp.R;

import org.w3c.dom.Text;

import java.io.File;
import java.util.ArrayList;

/**
 * 녹음 파일 불러오고 눌르면 재생
 */

public class FileListActivity extends AppCompatActivity {
    ViewPager viewPager;
    TextView txt_title;

    String TAG;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG=getClass().getName();
        setContentView(R.layout.list_layout);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
        RecordPagerAdapter adapter=new RecordPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        Log.d(TAG,"파일 리스트 ㅁㅎㅁㅎㅁㅎㅁㅎㅁㅎㅁㅎㅁㅎㅁㅎㅁㅎㅁㅎㅁㅎ"+this);
    }
}
