package bridge;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: TODO
 * @since 2019/9/22 17:35
 **/
public class ConcreteImplementorA implements Implementor {

    @Override
    public void operationImpl() {

        System.out.println("具体实现类A的具体操作");
    }

}
