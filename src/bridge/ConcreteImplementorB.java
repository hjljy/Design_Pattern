package bridge;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: TODO
 * @since 2019/9/22 17:35
 **/
public class ConcreteImplementorB implements Implementor {

    @Override
    public void operationImpl() {
        System.out.println("实现类B的具体操作：吃完饭去打篮球");
    }

}
