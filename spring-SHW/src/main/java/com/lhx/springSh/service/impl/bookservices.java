package com.lhx.springSh.service.impl;

import com.lhx.springSh.dao.bookdao;
import com.lhx.springSh.dao.impl.bookdaos;
import com.lhx.springSh.service.bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

@Service
public class bookservices implements bookservice {
    @Autowired
    private bookdao bookdaos;
@Transactional(
        //readOnly = true 只读 对查询时进行优化
        //timeout = 3 超时3s自动回滚抛出异常  TransactionTimedOutException
        //noRollbackFor = ArithmeticException.class 出现ArithmeticException不发生回滚
       // propagation = Propagation.REQUIRES_NEW 使用当前事务，如还有个
        //a方法调用buybook方法也有事务，不设置默认使用a方法事务
)
    public void buybook(Integer userid, Integer bookid) {
    //查询图书价格
       Integer price= bookdaos.getidcount(bookid);
        //更新图书库存
        bookdaos.updatebook(bookid);
        //更新用户余额
        bookdaos.updatebalance(userid,price);
    }
}
