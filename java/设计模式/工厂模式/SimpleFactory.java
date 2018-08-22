import java.util.Scanner;

/**
 * @ Author: xin
 * @ Date: 2018/8/7 18:28
 */

class ClothesFactory{
    public static Clothes chooseClothes(String clothes){
        if(clothes.equals("童装")){
            return new Child();
        }
        else if(clothes.equals("女装")){
            return new Female();
        }
        else if(clothes.equals("男装")){
            return new Male();
        }
        return null;
    }
}

public class SimpleFactory {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请问客户需要哪种服装？");
        String type=scanner.nextLine();

        String clothes=ClothesFactory.chooseClothes(type).getClothes();
        System.out.println(clothes);
    }
}
