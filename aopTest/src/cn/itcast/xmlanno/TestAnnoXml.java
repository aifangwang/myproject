package cn.itcast.xmlanno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by waf on 2018/7/27.
 */
public class TestAnnoXml {
    @Test
    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        BookService bookSer = (BookService)context.getBean("bookService");
        bookSer.add();
    }
}
