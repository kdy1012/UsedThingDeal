package kr.co.tjeit.usedthingdeal.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.usedthingdeal.R;
import kr.co.tjeit.usedthingdeal.adapter.CommunityListAdapter;
import kr.co.tjeit.usedthingdeal.data.NoticeBoard;

/**
 * Created by the on 2017-11-28.
 */

public class CommunityFrag extends Fragment {

    List<NoticeBoard> noticeBoardData = new ArrayList<>();
    CommunityListAdapter mAdapter;
    private android.widget.ListView freeListView;
    private ListView declarationListView;
    private android.widget.TextView moreSeeTxt1;
    private android.widget.TextView moreSeeTxt2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_community, container, false);
        this.moreSeeTxt2 = (TextView) v.findViewById(R.id.moreSeeTxt2);
        this.moreSeeTxt1 = (TextView) v.findViewById(R.id.moreSeeTxt1);
        this.declarationListView = (ListView) v.findViewById(R.id.declarationListView);
        this.freeListView = (ListView) v.findViewById(R.id.freeListView);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mAdapter = new CommunityListAdapter(getContext(), noticeBoardData);
        freeListView.setAdapter(mAdapter);
        declarationListView.setAdapter(mAdapter);



    }


}

