public class Person {
    private String eyecolor;
    private String haircolor;
    private String skintone;
    private String gender;
    private int age;
    private boolean alive = true;
    public static void main(String[] args) {
        
    }

    public Person(String eyecolor, String haircolor, String skintone, String gender, int age) {
        this.eyecolor = eyecolor;
        this.haircolor = haircolor;
        this.skintone = skintone;
        this.gender = gender;
        this.age = age;
    }

    public String getHairColor() {
        return haircolor;
    }

    public void dyeHair(String haircolor) {
        this.haircolor = haircolor;
    }
        
    public String getEyeColor() {
        return eyecolor;
    }

    public String getSkintone() {
        return skintone;
    }

    public String getGender() {
        return gender;
    }

    public void changeGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }
    
    public void birthday(int age) {
        this.age = this.age++;
    }

    public boolean getAlive() {
        return alive;
    }
    public void dead() {
        this.alive = false;
    }
}