package com.lhx.springSh.dao.impl;

import com.lhx.springSh.dao.bookdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class bookdaos implements bookdao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void updatebook(Integer bookid) {
        String sql="update t_book set stock=stock-1 where book_id=? ";
          jdbcTemplate.update(sql,bookid);
    }

    @Override
    public Integer getidcount(Integer bookid) {
        String sql="select price from t_book where book_id=?";
        return jdbcTemplate.queryForObject(sql,Integer.class,bookid);
    }

    @Override
    public void updatebalance(Integer userid, Integer price) {
       String sql="update t_user set balance=balance-price where user_id=?";
       jdbcTemplate.update(sql,userid);
    }
}
