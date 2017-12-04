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

/**
 * Created by the on 2017-12-04.
 */

public class PhotoViewPagerAdapter extends PagerAdapter {

    Context mContext;
    List<String> mList; // 사진들의 주소를 저장하기 위함.
    LayoutInflater inf;

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
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }

}
