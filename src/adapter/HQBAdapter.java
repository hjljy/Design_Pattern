package adapter;

import com.sun.xml.internal.ws.util.StringUtils;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: TODO
 * @since 2019/8/5 21:55
 **/
public class HQBAdapter extends HQB implements HQUBService {

    @Override
    public String newShow(String name,String msg) {
        //这是原来的接口
        String old = show(msg);
        System.out.println(old);
        //新接口需要在原来的接口上进行部分修改
        String replace = old.replace("霍去病", name);
        return replace;
    }
}
