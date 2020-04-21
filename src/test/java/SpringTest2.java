import com.yi.aop.StudentDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class SpringTest2 {

    @Resource(name = "studentDaoProxy")
    private StudentDao studentDao;

    @Test
    public void test1() {
        studentDao.find();
        studentDao.update();
        studentDao.save();
        studentDao.delete();
    }
}
