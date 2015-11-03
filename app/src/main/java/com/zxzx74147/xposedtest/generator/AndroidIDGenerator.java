package com.zxzx74147.xposedtest.generator;

import com.zxzx74147.xposedtest.faker.BaseGenerator;
import com.zxzx74147.xposedtest.stategy.CommonStategy;
import com.zxzx74147.xposedtest.util.RandomUtil;

/**
 * Created by zhengxin on 15/10/23.
 */
public class AndroidIDGenerator extends BaseGenerator {

    public AndroidIDGenerator(CommonStategy stategy) {
        super(stategy);
    }

    @Override
    protected String getRandomValue() {
        StringBuffer sb = new StringBuffer(17);
        sb.append(RandomUtil.getRandomInt(100000,999999));
        sb.append(RandomUtil.getRandomInt(0,100));
        sb.append(RandomUtil.getRandomInt(100000,999999));
        sb.append(RandomUtil.getRandomInt(0,10));
        return sb.toString();
    }

}
