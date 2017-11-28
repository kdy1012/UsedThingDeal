package kr.co.tjeit.usedthingdeal;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.usedthingdeal.adapter.HomeFragAdapter;
import kr.co.tjeit.usedthingdeal.data.Product;
import kr.co.tjeit.usedthingdeal.fragment.CategoryFrag;
import kr.co.tjeit.usedthingdeal.fragment.CommunityFrag;
import kr.co.tjeit.usedthingdeal.fragment.HomeFrag;
import kr.co.tjeit.usedthingdeal.fragment.MoreSeeFrag;

public class MainActivity extends BaseActivity {


    List<Product> GridListData = new ArrayList<>();
    HomeFragAdapter mAdapter;

    private android.widget.ImageView hambugermenuimg;
    private android.widget.ImageView noticeImg;
    private android.widget.EditText serachEdt;
    private android.widget.ImageView serachImg;
    private android.widget.GridView GridView;
    private android.widget.LinearLayout homefrag;
    private android.widget.LinearLayout categoryfrag;
    private android.widget.LinearLayout communityfrag;
    private android.widget.LinearLayout moreSeefrag;
    private android.support.v4.view.ViewPager mainViewPager;

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
        mainViewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

        mAdapter = new HomeFragAdapter(mContext, GridListData);
        GridView.setAdapter(mAdapter);

    }

    @Override
    public void setupEvent() {

        View.OnClickListener pageChangeListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pageNum = Integer.parseInt(v.getTag().toString());
                mainViewPager.setCurrentItem(pageNum);
            }
        };

        homefrag.setOnClickListener(pageChangeListener);
        categoryfrag.setOnClickListener(pageChangeListener);
        communityfrag.setOnClickListener(pageChangeListener);
        moreSeefrag.setOnClickListener(pageChangeListener);

        mainViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                // 한장의 페이지로 자리를 잡았을 때.

                // 페이지에 맞는 제목을 설정
                if (position == 0) {
                    homefrag.setBackgroundColor(Color.GRAY);
                } else if (position == 1) {
                    categoryfrag.setBackgroundColor(Color.GRAY);
                } else if (position == 2) {
                    communityfrag.setBackgroundColor(Color.GRAY);
                } else if (position == 3) {
                    moreSeefrag.setBackgroundColor(Color.GRAY);
                }


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public void bindViews() {
        this.moreSeefrag = (LinearLayout) findViewById(R.id.moreSee_frag);
        this.communityfrag = (LinearLayout) findViewById(R.id.community_frag);
        this.categoryfrag = (LinearLayout) findViewById(R.id.category_frag);
        this.homefrag = (LinearLayout) findViewById(R.id.home_frag);
        this.mainViewPager = (ViewPager) findViewById(R.id.mainViewPager);
        this.serachImg = (ImageView) findViewById(R.id.serachImg);
        this.serachEdt = (EditText) findViewById(R.id.serachEdt);
        this.noticeImg = (ImageView) findViewById(R.id.noticeImg);
        this.hambugermenuimg = (ImageView) findViewById(R.id.hambuger_menu_img);
    }

    class MyPagerAdapter extends FragmentStatePagerAdapter {
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public Fragment getItem(int position) {

            if (position == 0) {

                return new HomeFrag();
            } else if (position == 1) {

                return new CategoryFrag();
            } else if (position == 2) {
                return new CommunityFrag();
            } else {
                return new MoreSeeFrag();
            }

        }
    }
}
