package com.droidyue.recyclerviewsample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by androidyue on 3/12/17.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>{
    private String[] mDataSource;

    public void setDataSource(String[] dataSource) {
        mDataSource = dataSource;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_text_view, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.setTextViewContent(mDataSource[position]);
    }

    @Override
    public int getItemCount() {
        return mDataSource.length;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView mTextView;
        public MyViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView)itemView;
        }

        public void setTextViewContent(String content) {
            mTextView.setText(content);
        }
    }
}
