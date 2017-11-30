package kr.co.tjeit.usedthingdeal;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.usedthingdeal.adapter.HomeFragAdapter;
import kr.co.tjeit.usedthingdeal.data.Product;

public class CategoryActivity extends BaseActivity {

    List<Product> GridListData = new ArrayList<>();
    HomeFragAdapter mAdapter;

    private android.widget.GridView GridView;
    private android.widget.TextView titleTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothing_category);
        bindViews();
        setValuse();
        setupEvent();


    }

    @Override
    public void setValuse() {

        mAdapter = new HomeFragAdapter(mContext, GridListData);
        GridView.setAdapter(mAdapter);


        String title = getIntent().getStringExtra("category");
        titleTxt.setText(title);

    }

    @Override
    public void setupEvent() {

    }

    @Override
    public void bindViews() {
        this.titleTxt = (TextView) findViewById(R.id.titleTxt);
        this.GridView = (android.widget.GridView) findViewById(R.id.GridView);
    }
}
