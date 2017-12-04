package kr.co.tjeit.usedthingdeal.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.List;

import kr.co.tjeit.usedthingdeal.ProductActivity;
import kr.co.tjeit.usedthingdeal.R;
import kr.co.tjeit.usedthingdeal.data.Product;

/**
 * Created by the on 2017-11-27.
 */

public class HomeFragAdapter extends ArrayAdapter<Product> {

    Context mContext;
    List<Product> mList;
    LayoutInflater inf;

    public HomeFragAdapter(Context context, List<Product> list) {
        super(context, R.layout.main_girdview_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row =  inf.inflate(R.layout.main_girdview_list_item, null);
        }

        LinearLayout gridView_layout = (LinearLayout) row.findViewById(R.id.gridView_layout);

        gridView_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, ProductActivity.class);
                mContext.startActivity(intent);
            }
        });

        return row;
    }

    @Override
    public int getCount() {
        return 10;
    }
}
