package com.sds.study.recordapp.record;

import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.sds.study.recordapp.R;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by efro2 on 2016-11-17.
 */

public class ListFragment extends Fragment implements AdapterView.OnItemClickListener{
    ListView listView;
    String TAG;
    ArrayAdapter arrayAdapter;
    ArrayList<String> arrayList;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_list,container,false);
        TAG=view.getClass().getName();
        listView=(ListView)view.findViewById(R.id.listView);
        arrayAdapter=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,getFileList());
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);//리스트뷰와 리스너 연결
        return view;
    }

    public List getFileList(){
        File dir=new File(Environment.getExternalStorageDirectory(),"iot_record");
        File[] files=dir.listFiles();
        arrayList=new ArrayList<String>();
        for(int i=0;i<files.length;i++){
            arrayList.add(files[i].getName());
        }
        return arrayList;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int index, long id) {
        TextView textView=((TextView)view);
        String fileName=textView.getText().toString();
        Toast.makeText(getContext(),"파일명"+fileName,Toast.LENGTH_SHORT).show();
        /*뷰페이저 중 index 1(2번째 페이지)dp goekdgksms DetailFragment보여주기*/

        FileListActivity fileListActivity=(FileListActivity)getContext();
        Log.d(TAG,fileListActivity.toString());
        fileListActivity.viewPager.setCurrentItem(2);
    }
}
