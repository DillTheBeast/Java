public class TheKnight {
    private String maskColor;
    private String game;
    private String weapon;
    private int health;

    public TheKnight(String maskColor, String game, String weapon, int health) {
        this.maskColor = maskColor;
        this.game = game;
        this.weapon = weapon;
        this.health = health;
    }
    public String getmaskColor() {
        return maskColor;
    }
    public String getgame() {
        return game;
    }
    public String getweapon() {
        return weapon;
    }
    public int gethealth() {
        return health;
    }

}
