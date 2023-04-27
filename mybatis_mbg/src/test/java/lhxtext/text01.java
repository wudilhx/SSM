package lhxtext;

import com.lhx.mybatis.mapper.EmpMapper;
import com.lhx.mybatis.pojo.Emp;
import com.lhx.mybatis.pojo.EmpExample;
import com.lhx.mybatis.utils.sqlutils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class text01 {
    @Test
    public void cc() {
        SqlSession sqls = sqlutils.sqls();
        EmpMapper mapper = sqls.getMapper(EmpMapper.class);
        //1,根据id查数据
//          Emp emp = mapper.selectByPrimaryKey(2);
//          System.out.println(emp);
        //2，查寻所有数据
//          List<Emp> emps = mapper.selectByExample(null);
//          System.out.println(emps);
        //设置条件查
        EmpExample empExample = new EmpExample();
        empExample.createCriteria().andEmpNameEqualTo("小明")
                .andAgeEqualTo(22);
        //后面加or
        empExample.or().andDeptIdEqualTo(1);
        List<Emp> emps = mapper.selectByExample(empExample);
        System.out.println(emps);
    }

    @Test
    public void aa() {
        SqlSession sqls = sqlutils.sqls();
        EmpMapper mapper = sqls.getMapper(EmpMapper.class);
        //普通修改
//        Emp emp = new Emp(2,"小黄",21,"女",null);
//        mapper.updateByPrimaryKey(emp);
        //选择性修改
        Emp emp = new Emp(2, "小黄", 21, null, 1);
        mapper.updateByPrimaryKeySelective(emp);
    }
}