package method_factory;

import simple_factory.Phone;
import simple_factory.XiaoMiPhone;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: TODO
 * @since 2019/7/10 22:51
 **/
public class XiaoMiFactory implements AbstractFactory {
    @Override
    public Phone createPhone() {
        return new XiaoMiPhone();
    }
}
