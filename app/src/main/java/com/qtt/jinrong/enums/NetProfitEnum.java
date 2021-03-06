package com.qtt.jinrong.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * 年近利润
 * Created by yanxin on 16/3/7.
 */
public enum NetProfitEnum {

    _50万(2,"0-50万"),
    _100万(3,"51-100万"),
    _200万(4,"101-200万"),
    _300万(5,"201-300万"),
    _500万(6,"301-500万"),
    _1000万(7,"501-1000万"),
    _2000万(8,"1001-2000万"),
    _3000万(8,"2001-3000万"),
    _5000万(8,"3001-5000万"),
    _6000万(8,"5001-6000万"),
    _1亿(8,"6001万-1亿"),
    _1亿以上(9,"1亿以上");

    private int code;
    private String title;

    NetProfitEnum(int code, String title) {
        this.code = code;
        this.title = title;
    }

    public int getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public static List<String> getValues() {
        List<String> titles = new ArrayList<>(5);
        NetProfitEnum[] enums = NetProfitEnum.values();
        for(int i=0;i<enums.length;i++) {
            titles.add(enums[i].getTitle());
        }
        return titles;
    }

    public static NetProfitEnum find(Integer code) {
        if(code == null) return null;
        NetProfitEnum[] enums = NetProfitEnum.values();
        for(int i=0;i<enums.length;i++) {
            if(enums[i].getCode() == code.intValue()) return enums[i];
        }
        return null;
    }
}
