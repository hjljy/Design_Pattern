package abstract_factory;

import simple_factory.Phone;
import simple_factory.XiaoMiPhone;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: TODO
 * @since 2019/7/15 22:41
 **/
public class XiaoMiFactory  implements AbstractFactory{

    @Override
    public Phone CreatePhone() {
        return new XiaoMiPhone();
    }

    @Override
    public NoteBook CreateNoteBook() {
        return new XiaoMiNoteBook();
    }
}
