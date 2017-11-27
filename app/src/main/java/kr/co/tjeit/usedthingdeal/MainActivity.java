package kr.co.tjeit.usedthingdeal;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.usedthingdeal.adapter.MainGridViewAdapter;
import kr.co.tjeit.usedthingdeal.data.Product;

public class MainActivity extends BaseActivity {

    List<Product> GridListData = new ArrayList<>();
    MainGridViewAdapter mAdapter;

    private android.widget.ImageView hambugermenuimg;
    private android.widget.ImageView noticeImg;
    private android.widget.EditText serachEdt;
    private android.widget.ImageView serachImg;
    private android.widget.GridView GridView;
    private android.widget.LinearLayout homefrag;
    private android.widget.LinearLayout categorifrag;
    private android.widget.LinearLayout communityfrag;
    private android.widget.LinearLayout moreSeefrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setValuse();
        setupEvent();
    }

    @Override
    public void setValuse() {
        mAdapter = new MainGridViewAdapter(mContext, GridListData);
        GridView.setAdapter(mAdapter);

    }

    @Override
    public void setupEvent() {

    }

    @Override
    public void bindViews() {
        this.moreSeefrag = (LinearLayout) findViewById(R.id.moreSee_frag);
        this.communityfrag = (LinearLayout) findViewById(R.id.community_frag);
        this.categorifrag = (LinearLayout) findViewById(R.id.categori_frag);
        this.homefrag = (LinearLayout) findViewById(R.id.home_frag);
        this.GridView = (android.widget.GridView) findViewById(R.id.GridView);
        this.serachImg = (ImageView) findViewById(R.id.serachImg);
        this.serachEdt = (EditText) findViewById(R.id.serachEdt);
        this.noticeImg = (ImageView) findViewById(R.id.noticeImg);
        this.hambugermenuimg = (ImageView) findViewById(R.id.hambuger_menu_img);

    }
}
