package com.sds.study.recordapp.page;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sds.study.recordapp.R;

/**
 * Created by efro2 on 2016-11-17.
 */

public class FragmentC extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.c_layout,null);
    }
}
