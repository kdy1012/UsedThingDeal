package kr.co.tjeit.usedthingdeal.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import kr.co.tjeit.usedthingdeal.R;
import kr.co.tjeit.usedthingdeal.SetActivity;

/**
 * Created by the on 2017-11-28.
 */

public class MoreSeeFrag extends Fragment {

    private android.widget.TextView likeItemTxt;
    private android.widget.TextView shoppingBasketTxt;
    private android.widget.TextView setTxt;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_moresee, container, false);
        this.setTxt = (TextView) v.findViewById(R.id.setTxt);
        this.shoppingBasketTxt = (TextView) v.findViewById(R.id.shoppingBasketTxt);
        this.likeItemTxt = (TextView) v.findViewById(R.id.likeItemTxt);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SetActivity.class);
                startActivity(intent);
            }
        });
    }
}

