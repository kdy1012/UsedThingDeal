package kr.co.tjeit.usedthingdeal.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import kr.co.tjeit.usedthingdeal.ClothingCategoryActivity;
import kr.co.tjeit.usedthingdeal.R;

/**
 * Created by the on 2017-11-27.
 */

public class CategoryFrag extends Fragment {

    private android.widget.ImageView clothingImg;
    private android.widget.ImageView beautyImg;
    private android.widget.ImageView accessoryImg;
    private android.widget.ImageView sportImg;
    private android.widget.ImageView digitalImg;
    private android.widget.ImageView etcImg;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_category, container, false);
        this.etcImg = (ImageView) v.findViewById(R.id.etcImg);
        this.digitalImg = (ImageView) v.findViewById(R.id.digitalImg);
        this.sportImg = (ImageView) v.findViewById(R.id.sportImg);
        this.accessoryImg = (ImageView) v.findViewById(R.id.accessoryImg);
        this.beautyImg = (ImageView) v.findViewById(R.id.beautyImg);
        this.clothingImg = (ImageView) v.findViewById(R.id.clothingImg);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        clothingImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ClothingCategoryActivity.class);
                startActivity(intent);
            }
        });

    }
}
