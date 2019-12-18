package repl;

public class HWMethodsWithReturnThunderBlazz {
    public boolean getThunderBlazz(boolean available, boolean gift, int ingredient1, int ingredient2, int ingredient3) {
        if (available == true || gift == true || (ingredient1 == 1 && ingredient2 == 2 && ingredient3 == 3) ||
                (ingredient1 == 3 && ingredient2 == 1 && ingredient3 == 2)){
            return true;
        }
        return false;
    }
}

