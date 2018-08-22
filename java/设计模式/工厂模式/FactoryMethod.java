import java.util.Scanner;

/**
 * @ Author: xin
 * @ Date: 2018/8/7 18:46
 */
interface Factory{
    Clothes chooseClothes();
}

class ChildFactory implements Factory{

    @Override
    public Clothes chooseClothes() {
        return new Child();
    }
}
class FemaleFactory implements Factory{

    @Override
    public Clothes chooseClothes() {
        return new Female();
    }
}
class MaleFactory implements Factory{

    @Override
    public Clothes chooseClothes() {
        return new Male();
    }
}



public class FactoryMethod {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请问客户需要哪种服装？");
        String type=scanner.nextLine();

        String clothes=new ChildFactory().chooseClothes().getClothes();

        System.out.println(clothes);
    }
}
