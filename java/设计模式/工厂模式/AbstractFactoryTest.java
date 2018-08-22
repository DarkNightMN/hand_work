import java.io.BufferedWriter;
import java.util.Scanner;

/**
 * @ Author: xin
 * @ Date: 2018/8/7 18:59
 */
interface Chain{
    void describe1();
}

interface Material{
    void describe2();
}

interface Button{
    void describe3();
}

class ChildChian implements Chain{
    @Override
    public void describe1() {
        System.out.println("童装拉链");
    }
}
class ChildMaterial implements Material{
    @Override
    public void describe2() {
        System.out.println("童装布料");
    }
}
class ChildButton implements Button{
    @Override
    public void describe3() {
        System.out.println("童装纽扣");
    }
}

//同理男装、女装的拉链，布料，纽扣 class

interface AbstractFactory{
    Chain createChain();
    Material createMaterial();
    Button createButton();
}

class ChildFactory implements AbstractFactory{
    @Override
    public Chain createChain() {
        return new ChildChian();
    }

    @Override
    public Material createMaterial() {
        return new ChildMaterial();
    }

    @Override
    public Button createButton() {
        return new ChildButton();
    }
}


public class AbstractFactoryTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请问客户需要哪种服装？");
        String type=scanner.nextLine();
        System.out.println("该服装由以下组件构成：");

        ChildFactory cf=new ChildFactory();
        cf.createChain().describe1();
        cf.createMaterial().describe2();
        cf.createButton().describe3();
    }
}
