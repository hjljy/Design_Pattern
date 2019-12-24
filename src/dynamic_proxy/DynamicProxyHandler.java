package dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: 动态代理处理器
 * @since 2019/7/23 22:36
 **/
public class DynamicProxyHandler implements InvocationHandler {

    //被代理对象
    private Object target;

    //传入被代理对象
    public DynamicProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //这里在调用前可以进行逻辑增强操作
        System.out.println("----调用前先吃个饭----");
        //调用被代理对象的方法
        Object invoke = method.invoke(target, args);
        //在掉用后也可以进行逻辑增强操作
        System.out.println("----调用后在洗个澡----");
        //返回调用的结果，这里是根据InvocationHandler接口的invoke方法说明进行的返回
        return invoke;
    }
}
