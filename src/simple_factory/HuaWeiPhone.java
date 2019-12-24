package simple_factory;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: 华为手机实体类
 * @since 2019/7/7 23:31
 **/
public class HuaWeiPhone implements Phone{
    @Override
    public void call() {
        System.out.println("为华为打Call");
    }
}
