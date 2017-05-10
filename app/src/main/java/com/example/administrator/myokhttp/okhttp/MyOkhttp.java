package com.example.administrator.myokhttp.okhttp;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import android.util.Log;


import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


/**
 * date:${DATA}
 * author:孟淑英
 * function:
 */
public class MyOkhttp {

    private final Context mContext;
    private final RecyclerView mRecyclerView;
    private MyAdapter mAdapter;
    private List<JsonBean.StudentsBean.StudentBean> mList;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            List<JsonBean.StudentsBean.StudentBean> obj = (List<JsonBean.StudentsBean.StudentBean>) msg.obj;
           Log.i("fff",obj+"");
            mAdapter = new MyAdapter(mContext,obj);
            mRecyclerView.setAdapter(mAdapter);

        }
    };

    public  MyOkhttp(Context context, RecyclerView recyclerView){
        mContext =context;
        mRecyclerView =recyclerView;

    }
    //创建okHttpClient对象
    OkHttpClient mOkHttpClient = new OkHttpClient();

    public void getData() {
        //创建一个Request
        final Request request = new Request.Builder()
                .url("http://result.eolinker.com/NiSmkrA4ba1fd6e49d7da31543bddc2bcacf98d558b4ca7?uri=hfnx")
                .build();
        //new call
        Call call = mOkHttpClient.newCall(request);
        //请求加入调度
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                Log.i("zzz",string);
                Gson gson=new Gson();
                JsonBean jsonBean = gson.fromJson(string, JsonBean.class);
                mList = jsonBean.getStudents().getStudent();
                Message obtain = Message.obtain();
                obtain.obj=mList;
                handler.sendMessage(obtain);


            }
        });
    }
}