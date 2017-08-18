package monster;

public class Monster {

    private int def;
    private int hp; //życie
    private String name;
    private int attack;
    //int gameDay = 0;

    public Monster( int def,int hp, String name, int gameDay, int attack) {

        this.def = def;
        this.hp = hp;
        this.name = name;
        this.attack = attack;
        //this.gameDay = gameDay;
    }

    public int getDef() {
        return def;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Monster monster = (Monster) o;

        if (def != monster.def) return false;
        if (hp != monster.hp) return false;
        //if (gameDay != monster.gameDay) return false;
        return name != null ? name.equals(monster.name) : monster.name == null;
    }

    @Override
    public int hashCode() {
        int result = def;
        result = 31 * result + hp;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        //result = 31 * result + gameDay;
        return result;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "def=" + def +
                ", hp=" + hp +
                ", name='" + name + '\'' +
               // ", gameDay=" + gameDay +
                '}';
    }

}
