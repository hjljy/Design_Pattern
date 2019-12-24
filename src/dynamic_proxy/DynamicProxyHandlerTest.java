package dynamic_proxy;

import dynamic_proxy.DynamicProxyHandler;
import org.omg.PortableInterceptor.InterceptorOperations;
import static_proxy.StaticProxy;
import static_proxy.StaticProxyTarget;

import java.lang.reflect.Proxy;
import java.util.List;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: TODO
 * @since 2019/7/23 22:53
 **/
public class DynamicProxyHandlerTest {
    public static void main(String[] args) {
        //获取类加载器，获取到的是AppClassLoader类加载器
        ClassLoader classLoader = List.class.getClassLoader();
        //获取接口
        Class<?>[] interfaces = PhoneServiceImpl.class.getInterfaces();
        //创建动态代理处理器
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler(new PhoneServiceImpl());
        //通过Proxy创建代理类
        PhoneService proxyInstance =(PhoneService) Proxy.newProxyInstance(classLoader,interfaces ,dynamicProxyHandler );
        //执行方法查看结果
        proxyInstance.dosomething2();
    }
}
