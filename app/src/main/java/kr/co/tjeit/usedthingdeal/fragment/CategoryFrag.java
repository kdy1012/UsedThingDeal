package kr.co.tjeit.usedthingdeal.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import kr.co.tjeit.usedthingdeal.CategoryActivity;
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
                Intent intent = new Intent(getContext(), CategoryActivity.class);
                intent.putExtra("category", "의류");
                startActivity(intent);
            }
        });

        beautyImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), CategoryActivity.class);
                intent.putExtra("category", "뷰티/미용");
                startActivity(intent);
            }
        });

        accessoryImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), CategoryActivity.class);
                intent.putExtra("category", "악세서리");
                startActivity(intent);
            }
        });

        sportImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), CategoryActivity.class);
                intent.putExtra("category", "스포츠/레저");
                startActivity(intent);
            }
        });

        digitalImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), CategoryActivity.class);
                intent.putExtra("category", "디지털/가전");
                startActivity(intent);
            }
        });

        etcImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), CategoryActivity.class);
                intent.putExtra("category", "기타");
               startActivity(intent);
            }
        });



    }
}
