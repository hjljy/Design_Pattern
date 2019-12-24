package abstract_factory;

import simple_factory.HuaWeiPhone;
import simple_factory.Phone;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: TODO
 * @since 2019/7/10 22:54
 **/
public class HuaWeiFactory implements AbstractFactory {

    @Override
    public Phone CreatePhone() {
        return new HuaWeiPhone();
    }

    @Override
    public NoteBook CreateNoteBook() {
        return new HuaWeiNoteBook();
    }
}
