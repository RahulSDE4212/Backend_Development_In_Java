package ObjectOrientedProgramming._4_ThisKeyword;

public class Player {
    int age;
    String battingStyle;
    int runsInOdi;
    int penalty;

    Player(int age, String battingStyle, int runsInOdi, int penalty){
        this.age = age;
        this.battingStyle = battingStyle;
        this.runsInOdi = runsInOdi;
        this.penalty = penalty;
        add(this);
    }

    void add(Player player) {
        player.runsInOdi = player.runsInOdi -  player.penalty;
    }

    public String toString() {
        return this.age + " /// " + this.battingStyle + " ///// " + this.runsInOdi + " ///// " + this.penalty;
    }

    public static void main(String[] args) {
        Player player = new Player(34, "right-hand batsmen", 10000, 2000);
        System.out.println(player);
    }
}
