package component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 海加尔金鹰
 * @version V1.0
 * @email hjljy@outlook.com
 * @description: TODO
 * @since 2019/12/24 21:31
 **/
public class ComponentTest2 {
    public static void main(String[] args) {
        // 创建一个根节点
        Composite root = new Composite("根节点");
        // 创建树枝节点
        Composite branchA = new Composite("---树枝A");
        Composite branchB = new Composite("---树枝B");
        // 来一个叶子节点
        Component leafA = new Leaf("------叶子A");
        Component leafB = new Leaf("------叶子B");
        Component leafC = new Leaf("---叶子C");

        root.addChild(branchA);
        root.addChild(leafC);
        branchA.addChild(leafA);
        branchA.addChild(branchB);
        branchB.addChild(leafB);

        String result = root.operation();
        System.out.println(result);
    }

    // 抽象构建角色
    static abstract class Component {
        String name;

        Component(String name) {
            this.name = name;
        }

        public abstract String operation();

    }

    //树枝构建角色
    static class Composite extends Component {
        private List<Component> childComponent;

        public Composite(String name) {
            super(name);
            this.childComponent = new ArrayList<>();
        }

        @Override
        public String operation() {
            StringBuilder builder = new StringBuilder(this.name);
            if(this.childComponent.size()>0){
                for (Component component : this.childComponent) {
                    builder.append("\n");
                    builder.append(component.operation());

                }
            }
            return builder.toString();
        }


        public boolean addChild(Component component) {
            return this.childComponent.add(component);
        }


        public Component getChild(int index) {
            return this.childComponent.get(index);
        }
    }

    //叶子构建角色
    static class Leaf extends Component {

        public Leaf(String name) {
            super(name);
        }

        @Override
        public String operation() {
            return this.name;
        }
    }

}
