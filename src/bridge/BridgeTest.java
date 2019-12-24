package bridge;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: TODO
 * @since 2019/9/22 17:47
 **/
public class BridgeTest {
    public static void main(String[] args) {

        Implementor imA = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstractionA(imA);
        abs.operation();
        Implementor imB = new ConcreteImplementorA();
        abs.impl=imB;
        abs.operation();
    }
}
