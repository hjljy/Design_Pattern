package static_proxy;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: TODO
 * @since 2019/7/22 22:31
 **/
public class StaticProxyTest {
    public static void main(String[] args) {
        System.out.println("--------使用代理模式之前---------");
        StaticProxyTarget target = new StaticProxyTarget();
        target.dosomething();
        System.out.println("--------使用代理模式之后---------");
      //  StaticProxy staticProxy = new StaticProxyImpl(target);
      //  staticProxy.dosomething();
    }
}
