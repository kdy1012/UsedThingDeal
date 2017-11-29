package kr.co.tjeit.usedthingdeal;

import android.os.Bundle;
import android.widget.TextView;

public class ClothingCategoryActivity extends BaseActivity {

    private android.widget.GridView GridView;
    private android.widget.TextView titleTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothing_category);
        this.titleTxt = (TextView) findViewById(R.id.titleTxt);
        this.GridView = (android.widget.GridView) findViewById(R.id.GridView);
        String title = getIntent().getStringExtra("category");

        titleTxt.setText(title);

        bindViews();
        setValuse();
        setupEvent();

    }

    @Override
    public void setValuse() {

    }

    @Override
    public void setupEvent() {

    }

    @Override
    public void bindViews() {

    }
}
