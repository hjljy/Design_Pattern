package flyweight;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: TODO
 * @since 2019/10/14 22:43
 **/
public class ConcreteFlyweight extends Flyweight {
    //颜色   内部状态，创建后不会改变的属性
    private String color = null;

    //创建对象的时候必须设置好对象的内部状态,同时设置该构造器为protect
    protected ConcreteFlyweight(String color){
        this.color=color;
    }

    @Override
    public void setLocation(String location) {
        // doSomething
        System.out.println("===color ：" +color+"===location ："+location);
    }
}
