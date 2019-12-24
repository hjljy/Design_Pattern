package bridge;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: TODO
 * @since 2019/9/22 17:18
 **/
public abstract  class Abstraction {
    protected Implementor impl;

    public Abstraction(Implementor impl){
        this.impl = impl;
    }

    public void operation(){
        //调用实现化的具体实现
        impl.operationImpl();
    }
}
