package com.example.administrator.myokhttp.okhttp;
import android.content.Context;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myokhttp.R;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * date:${DATA}
 * author:孟淑英
 * function:
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ListViewHolder>{

    private final Context mContext;
    private final List<JsonBean.StudentsBean.StudentBean> mStudentBeen;


    public MyAdapter(Context context, List<JsonBean.StudentsBean.StudentBean> list){
       mContext =context;
       mStudentBeen =list;
   }
    @Override
    public MyAdapter.ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = View.inflate(mContext, R.layout.listview_layout, null);
        ListViewHolder listViewHolder=new ListViewHolder(view);
        return listViewHolder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ListViewHolder holder, int position) {
        JsonBean.StudentsBean.StudentBean studentBean = mStudentBeen.get(position);
        holder.setdata(studentBean);
    }



    @Override
    public int getItemCount() {
        return mStudentBeen.size();
    }



    public class ListViewHolder extends RecyclerView.ViewHolder {
        private final ImageView mImageview;
        private final TextView mTextview;
        public ListViewHolder(View itemView){
            super(itemView);
            mImageview = (ImageView) itemView.findViewById(R.id.imageview);
            mTextview = (TextView) itemView.findViewById(R.id.textview);
        }

        public void setdata(JsonBean.StudentsBean.StudentBean studentBean) {
            ImageLoader.getInstance().displayImage(studentBean.getImg(), mImageview);
            mTextview.setText(studentBean.getContent());
        }
    }
}
