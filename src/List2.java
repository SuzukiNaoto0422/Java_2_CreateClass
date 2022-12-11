public class List2 {
    public static void main(String[] args) {
        Cat catA = new Cat("まめだいふく" ,"マンチカン","魚",3);
        Cat catB = new Cat("とらまる","キジトラ","魚",10);
        Cat catC = new Cat("たま","三毛猫","鶏肉",15);
        Cat catD = new Cat("じろう","キジトラ","海苔",8);
        Cat catE = new Cat("まるお","スコティッシュフォールド","お米",15);


        //List9行目はこうも書ける
        Cat[] catList = new Cat[]{catA,catB,catC,catD,catE};

        //拡張for文
        for(Cat cat : catList) {
            System.out.println("この子の名前は、「" + cat.getName() + "」です。" + cat.getAge() + "歳の" + cat.getCatBreed() + "です。" + "好きな食べ物は" + cat.getLikeFood() +  "です。");
        }

        System.out.println("\n");


        for (Cat cat : catList) {
            if (cat.getLikeFood().equals("魚")) {
                System.out.println(cat.getName() + "は魚が好きです。");
            } else if (cat.getLikeFood().equals("鶏肉")) {
                System.out.println(cat.getName() + "は鶏肉が好きです。");
            } else {
                System.out.println(cat.getName() + "は魚や鶏肉以外の好きな食べ物があります。それは" + cat.getLikeFood() + "です。");
            }
        }
    }

}