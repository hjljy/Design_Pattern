package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author   海加尔金鹰
 * @version V1.0
 * @email  hjljy@outlook.com
 * @description: TODO
 * @since 2019/10/17 22:16
 **/
public class UnsharableFlyweight extends Flyweight {

    //用于保存单纯享元对象
    private Map<String,Flyweight> flys = new HashMap<>();

    /**
     * 增加一个新的单纯享元对象到集合中
     * @param key
     * @param fly 单纯享元对象
     */
    public void add(String key , Flyweight fly){
        flys.put(key,fly);
    }

    /**
     * 为所有的单纯享元对象统一设置相同的外部状态
     * @param location
     */
    @Override
    public void setLocation(String location) {
        for (String s : flys.keySet()) {
            flys.get(s).setLocation(location);
        }
    }
}
