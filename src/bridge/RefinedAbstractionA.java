package bridge;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: TODO
 * @since 2019/9/22 17:20
 **/
public class RefinedAbstractionA extends  Abstraction{

    public RefinedAbstractionA(Implementor impl) {
        super(impl);
    }
    //修正类需要实现的业务
    public void otherOperation(){
        operation();
        System.out.println("小明吃完饭要干嘛？");

    }
}
