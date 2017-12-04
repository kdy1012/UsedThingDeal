package kr.co.tjeit.usedthingdeal.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.List;

import kr.co.tjeit.usedthingdeal.NoticeBoardActivity;
import kr.co.tjeit.usedthingdeal.R;
import kr.co.tjeit.usedthingdeal.data.NoticeBoard;
import kr.co.tjeit.usedthingdeal.data.Product;

/**
 * Created by the on 2017-11-30.
 */

public class CommunityListAdapter extends ArrayAdapter<NoticeBoard> {

    Context mContext;
    List<NoticeBoard> mList;
    LayoutInflater inf;

    public CommunityListAdapter(Context context, List<NoticeBoard> list) {
        super(context, R.layout.community_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row =  inf.inflate(R.layout.community_list_item, null);
        }

        RelativeLayout noticeLayout = (RelativeLayout) row.findViewById(R.id.noticeLayout);

        noticeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, NoticeBoardActivity.class);
                mContext.startActivity(intent);
            }
        });

        return row;
    }

    @Override
    public int getCount() {
        return 5;
    }

}

