/**
 * @ Author: xin
 * @ Date: 2018/8/7 18:29
 */
public interface Clothes {
     String getClothes();
}

class Child implements Clothes{

    @Override
    public String getClothes() {
        return "客户获得童装";
    }
}
class Female implements Clothes{

    @Override
    public String getClothes() {
        return "客户获得女装";
    }
}
class Male implements Clothes{

    @Override
    public String getClothes() {
        return "客户获得男装";
    }
}

