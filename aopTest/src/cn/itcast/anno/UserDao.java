package cn.itcast.anno;

import org.springframework.stereotype.Component;

/**
 * Created by waf on 2018/7/27.
 */
@Component(value = "userDao123")
public class UserDao {
    public void add(){
        System.out.println("dao................");
    }
}
