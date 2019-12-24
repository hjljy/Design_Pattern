package method_factory;

import simple_factory.Phone;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: 抽象工厂类
 * @since 2019/7/10 22:44
 **/
public interface AbstractFactory {
    Phone createPhone();
}
