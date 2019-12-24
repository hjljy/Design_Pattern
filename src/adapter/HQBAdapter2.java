package adapter;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: TODO
 * @since 2019/8/5 22:36
 **/
public class HQBAdapter2 {
    //将被适配者当成属性持有
    private HQB hqb;
    //通过构造器方式注入  不一定使用这种方式，但一定要保证被适配者不为NULL，不然怎么进行适配
    public HQBAdapter2(HQB hqb){
        this.hqb=hqb;
    }

    public void newShow(String name,String msg){
        //原来的处理方式
        String show = hqb.show(msg);
        System.out.println(show);
        //新处理方式
        System.out.println(show.replace("霍去病",name));
    }
}
