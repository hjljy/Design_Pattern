package static_proxy;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: 静态代理对象
 * @since 2019/7/22 22:18
 **/
public class StaticProxyImpl implements StaticProxy {

    //代理对象需要持有目标对象
    private StaticProxy staticProxy;

    //通过构造器的方式传入目标对象
    public StaticProxyImpl(StaticProxy staticProxy) {
        this.staticProxy = staticProxy;
    }

    @Override
    public void dosomething() {
        System.out.println("我是代理做的事，可有可无");
        //必须要有，并且真正做事的还是目标对象。
        this.staticProxy.dosomething();
        System.out.println("目标对象做完之后做的事，可有可无");
    }
}
