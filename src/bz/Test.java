package bz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setId(new Date().toLocaleString());
        Goods g1 = new Goods("001","手机",2000.00f,3);
        Goods g2 = new Goods("002","computer",6000.00f,5);
        Goods g3 = new Goods("003","TV",3000.00f,8);
        List<Goods> goods = new ArrayList<Goods>();
        goods.add(g1);
        goods.add(g2);
        goods.add(g3);

        order.setGoods(goods);
        System.out.println(order);

    }
}
