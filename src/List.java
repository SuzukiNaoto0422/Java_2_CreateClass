public class List {
    public static void main(String[] args) {
        Cat catA = new Cat("まめだいふく" ,"マンチカン","魚",3,"青");
        Cat catB = new Cat("とらまる","キジトラ","魚",10, "黄");
        Cat catC = new Cat("たま","三毛猫","鶏肉",15, "黄");
        Cat catD = new Cat("じろう","キジトラ","海苔",8, "黄");
        Cat catE = new Cat("まるお","スコティッシュフォールド","お米",15, "青");

        Cat[] catList = new Cat[5];
        catList[0] = catA;
        catList[1] = catB;
        catList[2] = catC;
        catList[3] = catD;
        catList[4] = catE;

        //愚直な書き方
        for (int i = 0; i < catList.length; i++) {
            System.out.println("この子の名前は、「" + catList[i].getName() + "」です。" + catList[i].getAge() + "歳の" + catList[i].getCatBreed() + "です。" + "好きな食べ物は" + catList[i].getLikeFood() +  "です。");
        }

        System.out.println("\n");

        for (int i = 0; i < catList.length; i++) {
            if (catList[i].getLikeFood().equals("魚")) {
                System.out.println(catList[i].getName() + "は魚が好きです。");
            } else if (catList[i].getLikeFood().equals("鶏肉")) {
                System.out.println(catList[i].getName() + "は鶏肉が好きです。");
            } else {
                System.out.println(catList[i].getName() + "は魚や鶏肉以外の好きな食べ物があります。それは" + catList[i].getLikeFood() + "です。");
            }
        }

    }

}