package dytext;

import com.lhx.mapper.dynamicmapper;
import com.lhx.pojo.emp;
import com.lhx.util.sqlutils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class text1 {
    @Test
    public void  getempanddynamic(){
        SqlSession sqls = sqlutils.sqls();
        dynamicmapper mapper = sqls.getMapper(dynamicmapper.class);
        emp emp = new emp(null, "小明", null, "男");
        List<com.lhx.pojo.emp> getempanddynamic = mapper.getempanddynamic(emp);
         getempanddynamic.forEach(System.out::println);
    }
    @Test
    public void  getadds(){//批量添加
        SqlSession sqls = sqlutils.sqls();
        dynamicmapper mapper = sqls.getMapper(dynamicmapper.class);
        emp emp1 = new emp(null, "小丁", 23, "男");
        emp emp2 = new emp(null, "小陈", 22, "男");
        emp emp3 = new emp(null, "小王", 22, "男");
        List<emp> emps = Arrays.asList(emp1, emp2, emp3);
        mapper.getadds(emps);

    }
    @Test
    public void  deletes(){//批量删除
        SqlSession sqls = sqlutils.sqls();
        dynamicmapper mapper = sqls.getMapper(dynamicmapper.class);
            Integer[] integers={4,5};
            mapper.getdeletes(integers);
    }
}
