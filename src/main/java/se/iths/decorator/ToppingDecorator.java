package se.iths.decorator;

import java.util.List;

public class ToppingDecorator implements Pizza {




    @Override
    public int getCost() {
        return 0;
    }

    @Override
    public List<String> getDescription() {
        return List.of();
    }

    @Override
    public String getName() {
        return "";
    }
}
