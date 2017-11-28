package kr.co.tjeit.usedthingdeal.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.usedthingdeal.R;
import kr.co.tjeit.usedthingdeal.adapter.HomeFragAdapter;
import kr.co.tjeit.usedthingdeal.data.Product;

/**
 * Created by user on 2017-11-27.
 */

public class HomeFrag extends Fragment {

    List<Product> GridListData = new ArrayList<>();
    HomeFragAdapter mAdapter;

    private android.widget.GridView GridView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_home, container, false);
        this.GridView = (android.widget.GridView) v.findViewById(R.id.GridView);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mAdapter = new HomeFragAdapter(getContext(), GridListData);
        GridView.setAdapter(mAdapter);
//        값 설정, 이벤트 붙이기

    }
}
