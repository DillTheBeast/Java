public class Knight {
    private String name;
    private String maskColor;
    private String game;
    private String weapon;
    private int health;

    public Knight(String name, String maskColor, String game, String weapon, int health) {
        this.name = name;
        this.maskColor = maskColor;
        this.game = game;
        this.weapon = weapon;
        this.health = health;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getmaskColor() {
        return maskColor;
    }
    public void setmaskColor(String maskColor) {
        this.maskColor = maskColor;
    }
    public String getgame() {
        return game;
    }
    public void setgame(String game) {
        this.game = game;
    }
    public String getweapon() {
        return weapon;
    }
    public void setweapon(String weapon) {
        this.weapon = weapon;
    }
    public int gethealth() {
        return health;
    }
    public void sethealth(int health) {
        this.health = health;
    }
    
    public String toString() {
        return "Name: " + name + ", Mask Color: " + maskColor + ", Game Resolution: " + game + ", Weapon: " + weapon + ", Player Health: " + health;
    }

}
