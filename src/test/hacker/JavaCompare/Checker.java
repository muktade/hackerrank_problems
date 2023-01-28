package test.hacker.JavaCompare;

import java.util.Comparator;

public class Checker implements Comparator<Player> {
    @Override
    public Comparator<Player> reversed() {
        return Comparator.super.reversed();
    }
    @Override
    public int compare(Player o1, Player o2) {
        return (o1.score- o2.score)!=0?(-o1.score+ o2.score):(o1.name.compareTo(o2.name));
    }

}
