package com.example.administrator.myokhttp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.administrator.myokhttp.okhttp.MyOkhttp;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecview = (RecyclerView) findViewById(R.id.recview);
        MyOkhttp myOkhttp=new MyOkhttp(this,mRecview);
        myOkhttp.getData();
        //布局管理器所需参数,其参数上下文this.
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        //B.通过布局管理器可以控制条目排列的顺序      true:反向显示    false:正常显示
        mRecview.setLayoutManager(linearLayoutManager);
    }
}
