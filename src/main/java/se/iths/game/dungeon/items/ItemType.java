package se.iths.game.dungeon.items;

import java.util.Objects;

public abstract class ItemType implements Item {
    @Override
    public int hashCode() {
        return Objects.hashCode(this.getClass().getName());
    }

    @Override
    public boolean equals(Object obj) {
        return this.getClass().getName().equals(obj.getClass().getName());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
