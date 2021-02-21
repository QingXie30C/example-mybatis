import com.qinxie30c.mybatis.entity.UserEntity;
import com.qinxie30c.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @auther qinxie30c
 * @date 2021/2/21 11:08 上午
 * @desc:
 */
public class MybatisTest {

    @Test
    public void test1() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<UserEntity> userEntities = userMapper.selectList();
        userEntities.forEach(vo-> {
            System.out.println(vo.getUsername()+"::"+vo.getPassword());
        });
    }
}
