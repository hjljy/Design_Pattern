package static_proxy;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: 目标代理对象
 * @since 2019/7/22 22:16
 **/
public class StaticProxyTarget implements StaticProxy {
    @Override
    public void dosomething() {
        System.out.println("我要打10个");
    }
}
