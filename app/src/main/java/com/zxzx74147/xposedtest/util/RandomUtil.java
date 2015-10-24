package com.zxzx74147.xposedtest.util;

import java.util.Random;

/**
 * Created by zhengxin on 15/10/23.
 */
public class RandomUtil {
    public static Random mRandom = new Random(System.currentTimeMillis());

    public static int getRandomInt(int min,int max){
        int random = mRandom.nextInt(max-min);
        return random +min;
    }

    public static int getRandomInt(int max){
        return mRandom.nextInt(max);
    }

    public static String getNextStringNumLetter(int length){
        StringBuffer sb = new StringBuffer(length+1);
        while(length>0){
            int temp = getRandomInt(36);
            if(temp<10){
                sb.append(String.valueOf(temp));
            }else{
                sb.append((char)(temp-10+'a'));
            }
        }
        return sb.toString();
    }

    public static String getNextStringDex(int length){
        StringBuffer sb = new StringBuffer(length+1);
        while(length>0){
            int temp = getRandomInt(16);
            sb.append(Integer.toHexString(temp).toLowerCase());
        }
        return sb.toString();
    }
}
