public class List {
    public static void main(String[] args) {
        Cat catA = new Cat("まめだいふく" ,"マンチカン","かつお節",3);
        Cat catB = new Cat("とらまる","キジトラ","ささみ",10);
        Cat catC = new Cat("たま","三毛猫","まぐろ",15);

        Cat[] CatList = new Cat[3];
        CatList[0] = catA;
        CatList[1] = catB;
        CatList[2] = catC;
    }

}