package abstract_factory;

import simple_factory.Phone;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: 抽象工厂接口
 * @since 2019/7/15 22:34
 **/
public interface AbstractFactory {
     Phone CreatePhone();
     NoteBook CreateNoteBook();
}
