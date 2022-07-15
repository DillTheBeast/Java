public class Radiance {
    private String name;
    private int Attacks;
    private int Phases; 

    public Radiance(String name, int Attacks, int Phases) {
        this.name = name;
        this.Attacks = Attacks;
        this.Phases = Phases;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public int getAttacks() {
        return Attacks;
    }
    public void setAttacks(int Attacks) {
        this.Attacks = Attacks;
    }
    public int getPhases() {
        return Phases;
    }
    public void setPhases(int Phases) {
        this.Phases = Phases;
    }
    public String toString() {
        return "Name: " + name + ", Number of Attacks: " + Attacks + ", Number of Phases: " + Phases;
    }
}
