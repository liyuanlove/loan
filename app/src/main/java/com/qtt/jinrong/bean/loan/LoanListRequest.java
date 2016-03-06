package com.qtt.jinrong.bean.loan;

import com.qtt.jinrong.bean.IRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yanxin on 16/3/7.
 */
public class LoanListRequest implements IRequest {

    private int quota;
    private int limi;
    private int identity;
    private int guaranteeWay;
    private int repay;
    private int orderNo;
    private int pageSize = 20;
    private int pageNo;

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public int getLimi() {
        return limi;
    }

    public void setLimi(int limi) {
        this.limi = limi;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public int getGuaranteeWay() {
        return guaranteeWay;
    }

    public void setGuaranteeWay(int guaranteeWay) {
        this.guaranteeWay = guaranteeWay;
    }

    public int getRepay() {
        return repay;
    }

    public void setRepay(int repay) {
        this.repay = repay;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    @Override
    public Map<String, Object> getParams() {
        Map<String,Object> map = new HashMap<>();
        map.put("quota",quota);
        map.put("limi",limi);
        map.put("identity",identity);
        map.put("guaranteeWay",guaranteeWay);
        map.put("repay",repay);
        map.put("orderNo",orderNo);
        map.put("pageSize",pageSize);
        map.put("pageNo",pageNo);
        return map;
    }

}
