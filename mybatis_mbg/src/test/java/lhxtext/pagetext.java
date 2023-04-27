package lhxtext;

import com.github.pagehelper.PageHelper;
import com.lhx.mybatis.mapper.EmpMapper;
import com.lhx.mybatis.pojo.Emp;
import com.lhx.mybatis.utils.sqlutils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class pagetext {
    @Test
    public void cc() {
        SqlSession sqls = sqlutils.sqls();
        EmpMapper mapper = sqls.getMapper(EmpMapper.class);
        //查寻前开启分页功能  第一页 每页2条数据
        PageHelper.startPage(1,2);
        List<Emp> emps = mapper.selectByExample(null);
        emps.forEach(System.out::println);
    }
}