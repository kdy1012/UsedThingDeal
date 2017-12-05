package kr.co.tjeit.usedthingdeal.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.usedthingdeal.ProductActivity;
import kr.co.tjeit.usedthingdeal.R;

/**
 * Created by the on 2017-12-04.
 */

public class PhotoViewPagerAdapter extends PagerAdapter {


    Context mContext;
    List<String> mList; // 사진들의 주소를 저장하기 위함.
    LayoutInflater inf;
    private ImageView photoItemImg;

    public PhotoViewPagerAdapter(LayoutInflater inflater) {

        // TODO Auto-generated constructor stub

        //전달 받은 LayoutInflater를 멤버변수로 전달

        this.inf=inflater;
    }

    public PhotoViewPagerAdapter(Context context, List<String> list) {
        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View row = inf.inflate(R.layout.photo_item, container, false);
        String url = mList.get(position);

        this.photoItemImg = (ImageView) row.findViewById(R.id.photoItemImg);

        Glide.with(mContext).load(url).into(photoItemImg);
        container.addView(row);

        return row;

    }

    @Override

    public void destroyItem(ViewGroup container, int position, Object object) {

        // TODO Auto-generated method stub

        //ViewPager에서 보이지 않는 View는 제거

        //세번째 파라미터가 View 객체 이지만 데이터 타입이 Object여서 형변환 실시

        container.removeView((View)object);

    }



    //instantiateItem() 메소드에서 리턴된 Ojbect가 View가  맞는지 확인하는 메소드

    @Override

    public boolean isViewFromObject(View v, Object obj) {

        // TODO Auto-generated method stub

        return v==obj;

    }

}

