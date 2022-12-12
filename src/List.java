public class List {
    public static void main(String[] args) {
        Cat catA = new Cat("まめだいふく" ,"マンチカン","魚",3);
        Cat catB = new Cat("とらまる","キジトラ","魚",10);
        Cat catC = new Cat("たま","三毛猫","鶏肉",15);
        Cat catD = new Cat("じろう","キジトラ","海苔",8);
        Cat catE = new Cat("まるお","スコティッシュフォールド","お米",15);

        //見にくいかも
        Cat[] cats = new Cat[5];
        cats[0] = catA;
        cats[1] = catB;
        cats[2] = catC;
        cats[3] = catD;
        cats[4] = catE;

        //愚直な書き方
        for (int i = 0; i < cats.length; i++) {
            System.out.println("この子の名前は、「" + cats[i].getName() + "」です。" + cats[i].getAge() + "歳の" + cats[i].getCatBreed() + "です。" + "好きな食べ物は" + cats[i].getLikeFood() +  "です。");
        }

        System.out.println("\n");

        for (int i = 0; i < cats.length; i++) {
            if (cats[i].getLikeFood().equals("魚")) {
                System.out.println(cats[i].getName() + "は魚が好きです。");
            } else if (cats[i].getLikeFood().equals("鶏肉")) {
                System.out.println(cats[i].getName() + "は鶏肉が好きです。");
            } else {
                System.out.println(cats[i].getName() + "は魚や鶏肉以外の好きな食べ物があります。それは" + cats[i].getLikeFood() + "です。");
            }
        }

    }

}