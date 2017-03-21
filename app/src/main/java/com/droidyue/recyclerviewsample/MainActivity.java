package com.droidyue.recyclerviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private MyRecyclerViewAdapter mAdapter;
    private GridLayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mLayoutManager = new GridLayoutManager(this, 3);
        mLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                if (position == mAdapter.getItemCount() - 1) {
                    return 2;
                } else {
                    return 1;
                }
            }
        });
        mRecyclerView.setLayoutManager(mLayoutManager);
        String[] dataSource = {"Google", "Chrome", "Apple", "FireFox", "Safari", "Microsoft", "Linux", "Windows", "MacOs", "Others", "Flipboard"};
        mAdapter = new MyRecyclerViewAdapter();
        mAdapter.setDataSource(dataSource);
        mRecyclerView.setAdapter(mAdapter);
    }


}
