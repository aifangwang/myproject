package cn.itcast.anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by waf on 2018/7/27.
 */
public class TestAnno {
    @Test
    public void testService() {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = (UserService)context.getBean("userService");
        System.out.println(userService);
        userService.add();
    }
    @Test
    public void testUser() {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean.xml");
        User user = (User)context.getBean("user");
        System.out.println(user);
        user.add();
    }
}
