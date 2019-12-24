package flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: TODO
 * @since 2019/10/14 22:52
 **/
public class FlyweightFactory {
    /**
     * 通过工厂模式控制享元对象的生成时，
     * 必须保证每次获取到的工厂是同一个工厂，
     * 所以采用单例模式来控制工厂模式的创建。
     */
    private static FlyweightFactory instance = new FlyweightFactory();

    private FlyweightFactory() {
    }


    public static FlyweightFactory getInstance() {
        return instance;
    }
    /**
     * 复合享元工厂方法
     */
    public Flyweight getUnsharableFlyweight(List<String> colors){
        UnsharableFlyweight fly = new UnsharableFlyweight();
        for(String color : colors){
            fly.add(color,this.getFlyweight(color));
        }
        return fly;
    }

    //享元池
    private Map<String, Flyweight> flyweightMap = new HashMap<>();

    /**
     * 单纯享元对象获取
     * @param color
     * @return
     */
    public Flyweight getFlyweight(String color) {
        // 判断享元池是否包含这个享元对象
        if (flyweightMap.containsKey(color)) {
            return flyweightMap.get(color);
        } else {
            //如果不包含就创建一个
            Flyweight flyweight = new ConcreteFlyweight(color);
            flyweightMap.put(color, flyweight);
            return flyweight;
        }
    }
    public void showNumber(){
        System.out.println("享元池里面现在有："+flyweightMap.size()+"个享元对象");
    }
}
