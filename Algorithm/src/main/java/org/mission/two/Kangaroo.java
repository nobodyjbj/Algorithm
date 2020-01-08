package org.mission.two;

public class Kangaroo {
    private static final String YES = "YES";
    private static final String NO = "NO";

    public String moveOfTwoKangaroos(int x1, int v1, int x2, int v2) {
        return theSamePointOfKangaroosMove(x1, v1, x2, v2);
    }

    private String theSamePointOfKangaroosMove(int x1, int v1, int x2, int v2) {
        while (condition(x1, x2)) {
            if (x1 == x2)
                return YES;

            x1 += v1;
            x2 += v2;
        }

        return NO;
    }

    private boolean condition(int x1, int x2) {
        return x1 <= x2;
    }
}
