package flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: TODO
 * @since 2019/10/14 23:20
 **/
public class FlyweightTest {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();
        List<String> colors = new ArrayList<>();
        colors.add("黑色");
        Flyweight flyweight1 = flyweightFactory.getUnsharableFlyweight(colors);
        Flyweight flyweight2 = flyweightFactory.getUnsharableFlyweight(colors);
        System.out.println("非享元角色是否可以共享对象：" + (flyweight1 == flyweight2));
        System.out.println("---------------------------------");
        String color = "白色";
        Flyweight fly1 = flyweightFactory.getFlyweight(color);
        Flyweight fly2 = flyweightFactory.getFlyweight(color);
        System.out.println("享元角色是否可以共享对象：" + (fly1 == fly2));
        flyweightFactory.showNumber();
    }
}
