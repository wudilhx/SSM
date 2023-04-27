package text01;

import com.lhx.mapper.Empmapper;
import com.lhx.mapper.dmpmapper;
import com.lhx.pojo.dmp;
import com.lhx.pojo.emp;
import com.lhx.utils.sqlutils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class emptext {
    @Test
    public void add() {
        SqlSession sqls = sqlutils.sqls();
        //获取 UserMapper的代理实现类对象
        Empmapper mapper = sqls.getMapper(Empmapper.class);
        emp emp = new emp(null, "小明", 22, "男");
        int add = mapper.add(emp);
        System.out.println(add);
    }

    @Test
    public void select() {
        SqlSession sqls = sqlutils.sqls();
        //获取 UserMapper的代理实现类对象
        Empmapper mapper = sqls.getMapper(Empmapper.class);
        List select = mapper.select();
        System.out.println(select);
    }

    @Test
    public void selectid() {
        SqlSession sqls = sqlutils.sqls();
        //获取 UserMapper的代理实现类对象
        Empmapper mapper = sqls.getMapper(Empmapper.class);
        emp selectid = mapper.selectid(1);
        System.out.println(selectid);
    }
    @Test
    public void selectids() {
        SqlSession sqls = sqlutils.sqls();
        //获取 UserMapper的代理实现类对象
        Empmapper mapper = sqls.getMapper(Empmapper.class);
        emp getempselectidsone = mapper.getempselectidsone(1);
        System.out.println(getempselectidsone);
    }
    @Test
    public void dmpid() {
        SqlSession sqls = sqlutils.sqls();
        //获取 UserMapper的代理实现类对象
        dmpmapper mapper = sqls.getMapper(dmpmapper.class);
        dmp getdmpid = mapper.getdmpid(1);
        System.out.println(getdmpid);
    }
}