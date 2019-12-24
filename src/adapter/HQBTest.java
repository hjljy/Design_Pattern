package adapter;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: TODO
 * @since 2019/8/5 22:10
 **/
public class HQBTest {
    public static void main(String[] args) {
        //类适配器
        String newShow = new HQBAdapter().newShow("两分刘", "真的短");
        System.out.println(newShow);
        //对象适配器
        new HQBAdapter2(new HQB()).newShow("乔碧螺陛下","榜一");
    }
}
