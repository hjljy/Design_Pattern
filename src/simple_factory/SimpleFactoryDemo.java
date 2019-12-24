package simple_factory;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: 简单工厂实例
 * @since 2019/7/7 23:49
 **/
public class SimpleFactoryDemo {
    public static void main(String[] args) {
        //方式一 静态方法调用
        HuaWeiPhone huaWeiPhone = PhoneFactory.createHuaWeiPhone();
        XiaoMiPhone xiaoMiPhone = PhoneFactory.createXiaoMiPhone();
        huaWeiPhone.call();
        xiaoMiPhone.call();
        //方式二 方法参数调用
        PhoneFactory factory = new PhoneFactory();
        Phone huaWei = factory.createPhone("HuaWei");
        Phone xiaoMi = factory.createPhone("XiaoMi");
        huaWei.call();
        xiaoMi.call();
    }
}
