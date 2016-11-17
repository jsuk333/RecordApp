package com.sds.study.recordapp.record;

import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sds.study.recordapp.R;

import java.io.File;

/**
 * Created by efro2 on 2016-11-17.
 */

public class DetailFragment extends Fragment {
    TextView txt_title;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_detail,container,false);
        File dir= new File(Environment.getExternalStorageDirectory(),"iot_record");
        File[] files=dir.listFiles();
        txt_title=(TextView)view.findViewById(R.id.txt_title);
        txt_title.setText(files[0].getAbsolutePath());
        return view;
    }
}
