package kr.co.tjeit.usedthingdeal;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by the on 2017-11-23.
 */

public abstract class BaseActivity extends AppCompatActivity {

    Context mContext = this;

    public abstract void setValuse();
    public abstract void setupEvent();
    public abstract void bindViews();

}
