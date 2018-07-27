package cn.itcast.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by waf on 2018/7/26.
 */
//使用注解创建对象
@Service(value = "user") //相当于  <bean id=" user"  class=""/>
@Scope(value = "prototype")
public class User {
    public void add(){
        System.out.println("add.................");
    }
}
