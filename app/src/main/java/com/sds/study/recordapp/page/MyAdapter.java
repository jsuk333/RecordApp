package com.sds.study.recordapp.page;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 뷰 페이저는 껍데기에 불과 하므로 뷰 페이저에 보여질 프래그먼트가  몇개고 어떤 프래그먼트를보여줄지 관리.
 */

public class MyAdapter extends FragmentStatePagerAdapter{

    //앱에서 사용할 프래그먼트를 준비해놓자
    Fragment[] fragments={new FragmentA(),new FragmentB(),new FragmentC()};
    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }
}
