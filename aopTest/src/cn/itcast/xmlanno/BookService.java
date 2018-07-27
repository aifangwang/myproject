package cn.itcast.xmlanno;

import javax.annotation.Resource;

/**
 * Created by waf on 2018/7/27.
 */
public class BookService {

    //得到bookdao和ordersdao對象
    @Resource(name = "bookDao")
    private BookDao bookDao;

    @Resource(name = "ordersDao")
    private OrdersDao ordersDao;

    public void add(){
        System.out.println("service....................");
        bookDao.book();
        ordersDao.buy();
    }
}
