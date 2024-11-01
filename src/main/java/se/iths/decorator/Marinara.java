package se.iths.decorator;

import java.util.List;

public class Marinara extends AbstractPizza{
    public Marinara() {
        super("Marinara", 90, List.of("🦐", "Blue mussel"));
    }
}
