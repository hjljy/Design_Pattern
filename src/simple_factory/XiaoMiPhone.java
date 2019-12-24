package simple_factory;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: 小米手机实例类
 * @since 2019/7/7 23:34
 **/
public class XiaoMiPhone implements  Phone {
    @Override
    public void call() {
        System.out.println("为小米打Call");
    }
}
