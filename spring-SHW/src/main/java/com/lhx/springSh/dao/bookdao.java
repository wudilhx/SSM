package com.lhx.springSh.dao;

public interface bookdao {
    //更新库存
    void updatebook(Integer bookid);
//查询价格
    Integer getidcount(Integer bookid);
//更新用户余额
    void updatebalance(Integer userid, Integer price);
}
