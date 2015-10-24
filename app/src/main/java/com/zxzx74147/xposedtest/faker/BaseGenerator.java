package com.zxzx74147.xposedtest.faker;

import android.util.Log;

import com.zxzx74147.xposedtest.stategy.BaseStategy;

/**
 * Created by zhengxin on 15/10/23.
 */
public class BaseGenerator {
    protected BaseStategy mStategy;
    private int mIndex = 0;

    public BaseGenerator(BaseStategy stategy) {
        mStategy = stategy;
    }

    public String getNextValue() {
        switch (mStategy.fake_stategy) {
            case FakerConfig.FAKE_MODE_NONE:
                return null;
            case FakerConfig.FAKE_MODE_RANDOM:
                return getRandomValue();
            case FakerConfig.FAKE_MODE_RANDOM_LIST_LIST:
                if (mStategy.fake_list != null && mStategy.fake_list.size() == 0) {
                    Log.e(mStategy.tag + " error", "list is empty!");
                    return null;
                }
                mIndex %= mStategy.fake_list.size();
                return mStategy.fake_list.get(mIndex);
        }
        return null;
    }

    protected String getRandomValue() {
        return null;
    }
}
