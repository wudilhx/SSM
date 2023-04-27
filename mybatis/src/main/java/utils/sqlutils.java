package utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class sqlutils {
    public static SqlSession sqls(){
        //获取核心配置文件的输入流
        InputStream resou = null;
        SqlSession sqlSession=null;
        try {
            resou = Resources.getResourceAsStream("mybatis-config.xml");
            //获取SqlSessionFactoryBuilder对象
            SqlSessionFactoryBuilder sql = new SqlSessionFactoryBuilder();
            //获取SqlSessionFactory对象
            SqlSessionFactory build = sql.build(resou);
            //获取sql的会话对象SqlSession，是mybatis提供操作数据库的对象 true自动提交
             sqlSession = build.openSession(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
       return sqlSession;
    }
}
