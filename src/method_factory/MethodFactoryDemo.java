package method_factory;

import simple_factory.Phone;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: TODO
 * @since 2019/7/10 22:58
 **/
public class MethodFactoryDemo {
    public static void main(String[] args) {
        //  通过华为工厂生产的手机是华为手机
        HuaWeiFactory  huaWeiFactory = new HuaWeiFactory();
        huaWeiFactory.createPhone().call();
        // 通过小米工厂生产的手机是小米手机
        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        xiaoMiFactory.createPhone().call();
    }
}
