package cn.itcast.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by waf on 2018/7/27.
 */

@Service(value = "userService") //value可以省略
public class UserService {
    //得到dao对象
    //1定义dao类型属性
    //在dao上面使用注解 完成对象注入
//    @Autowired
//    private UserDao ueserDao;

    //name属性值 写 注解创建dao对象value值
    @Resource(name = "userDao")
    private UserDao ueserDao;
    public void add(){
        System.out.println("userService..............");
        ueserDao.add();
    }
}
