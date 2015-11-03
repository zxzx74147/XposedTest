package com.zxzx74147.xposedtest.faker;

import android.util.Log;

import com.zxzx74147.xposedtest.stategy.CommonStategy;

/**
 * Created by zhengxin on 15/10/23.
 */
public class BaseGenerator {
    protected CommonStategy mStategy;
    private int mIndex = 0;

    public BaseGenerator(CommonStategy stategy) {
        mStategy = stategy;
    }

    public String getNextValue() {
        switch (mStategy.stategy) {
            case FakerConfig.FAKE_MODE_NONE:
                return null;
            case FakerConfig.FAKE_MODE_RANDOM:
                return getRandomValue();
            case FakerConfig.FAKE_MODE_RANDOM_LIST_LIST:
                if (mStategy.list != null && mStategy.list.size() == 0) {
                    Log.e(mStategy.tag + " error", "list is empty!");
                    return null;
                }
                mIndex %= mStategy.list.size();
                return mStategy.list.get(mIndex);
        }
        return null;
    }

    protected String getRandomValue() {
        return null;
    }
}
