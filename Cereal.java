public class Cereal {

    private String cerealName;
    private int calories;

    public int getCalories() {
        return calories;
    }

    public String getName() {
        return cerealName;
    }

    public String toString() {
        return cerealName + " has " + calories + " calories.";
    }

    public Cereal(int c, String n) {

        calories = c;
        cerealName = n;

    }

    public static Cereal crazyCreamCrunch = new Cereal(910, "Crazy Cream Crunch");


    public static void main(String[] args) {

        System.out.println(crazyCreamCrunch);

        //diagnostics
        System.out.println(crazyCreamCrunch.getCalories());
        System.out.println(crazyCreamCrunch.getName());
    }



}