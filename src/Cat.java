public class Cat {
    private String name;             //名前
    private String catBreed;         //猫の種類
    private String likeFood;         //好きな食べ物
    private int age;                 //年齢

    public Cat(String name, String catBreed, String likeFood, int age) {
        this.name = name;
        this.catBreed = catBreed;
        this.likeFood = likeFood;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public String getCatBreed() {
        return catBreed;
    }

    public String getLikeFood() {
        return likeFood;
    }

    public int getAge() {
        return age;
    }

    public void introduction() {
        System.out.println("この子の名前は" + getName() + "です。" + getAge() + "の" + getCatBreed() + "で、好きな食べ物は" + getLikeFood() + "です。");
    }

}