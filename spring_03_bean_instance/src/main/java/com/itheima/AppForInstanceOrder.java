package com.itheima;

import com.itheima.dao.OrderDao;
import com.itheima.dao.impl.OrderDaoImpl;
import com.itheima.factory.OrderDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceOrder {
    public static void main(String[] args) {
//        通过静态工厂创建对象
//        OrderDao orderDao = OrderDaoFactory.getOrderDao();
//        orderDao.save();


        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        OrderDao orderDao = (OrderDao) ctx.getBean("orderDao");//注意这里ctx.getBean("orderDao")是类不是接口
        OrderDao orderDao2 = (OrderDaoImpl) ctx.getBean("orderDao");//也可以，这个能理解，上面的有点绕

      /* 相当于  Object obj = ctx.getBean("orderDao");
        OrderDao orderDao1 = (OrderDao) obj;      // 倘若类实现了接口，就可以将类的类型转换为接口类型。
        System.out.println(orderDao1.getClass())  //运行类型为class com.itheima.dao.impl.OrderDaoImpl
        ;*/

        //ctx.getBean("orderDao")这个类编译类型是Object，
        // 运行时类型是class com.itheima.dao.impl.OrderDaoImpl
        // 倘若类实现了接口，就可以将类的类型转换为接口类型。

        System.out.println(ctx.getBean("orderDao").getClass());//class com.itheima.dao.impl.OrderDaoImpl


        orderDao.save();
    }
}
