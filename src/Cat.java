public class Cat {
    private String name;             //名前
    private String catBreed;         //猫の種類
    private String likeFood;         //好きな食べ物
    private int age;                 //年齢
    private String eyeColor;         //瞳の色

    public Cat(String name, String catBreed, String likeFood, int age, String eyeColor) {
        this.name = name;
        this.catBreed = catBreed;
        this.likeFood = likeFood;
        this.age = age;
        this.eyeColor = eyeColor;

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

    public String getEyeColor() {
        return eyeColor;
    }
 }