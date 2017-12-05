package kr.co.tjeit.usedthingdeal;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

import kr.co.tjeit.usedthingdeal.adapter.PhotoViewPagerAdapter;

public class ProductActivity extends BaseActivity {

    private android.support.v4.view.ViewPager imgViewPager;


    private android.widget.TextView titleTxt;
    private android.widget.TextView contentsTxt;
    private android.widget.TextView userTxt;
    private android.widget.TextView phoneTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        bindViews();
        setValuse();
        setupEvent();

    }

    @Override
    public void setValuse() {
        PhotoViewPagerAdapter adapter = new PhotoViewPagerAdapter(getLayoutInflater());
        imgViewPager.setAdapter(adapter);

    }

    @Override
    public void setupEvent() {

    }

    @Override
    public void bindViews() {
        this.phoneTxt = (TextView) findViewById(R.id.phoneTxt);
        this.userTxt = (TextView) findViewById(R.id.userTxt);
        this.contentsTxt = (TextView) findViewById(R.id.contentsTxt);
        this.titleTxt = (TextView) findViewById(R.id.titleTxt);
        this.imgViewPager = (ViewPager) findViewById(R.id.imgViewPager);
    }
}
