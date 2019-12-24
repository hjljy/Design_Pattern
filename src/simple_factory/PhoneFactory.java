package simple_factory;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: 手机工厂类
 * @since 2019/7/7 23:36
 **/
public class PhoneFactory {
    //方式一  通过静态方法创建对应的对象
    public static HuaWeiPhone createHuaWeiPhone(){
        return  new HuaWeiPhone();
    }
    public static XiaoMiPhone createXiaoMiPhone(){
        return  new XiaoMiPhone();
    }
    //方式二 通过参数创建对象
    public Phone  createPhone(String name){
        Phone phone = null;
        if("HuaWei".equals(name)){
            phone= new HuaWeiPhone();
        }else if("XiaoMi".equals(name)){
            phone= new XiaoMiPhone();
        }else{
            System.out.println("请输入正确的手机品牌");
        }
        return phone;
    }
}
