package Practice;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        int ans = countWays(3, 3);
//        System.out.println(ans);
//        path("", 3, 3);
//        System.out.println(pathRet("", 3, 3));
//        System.out.println(pathRetDiagonal("", 3, 3));
        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathRestriction("",maze,0,0);
    }


    static int countWays(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = countWays(r - 1, c);
        int right = countWays(r, c - 1);

        return left + right;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p + 'R', r - 1, c);
        }
        if (c > 1) {
            path(p + 'D', r, c - 1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
            list.addAll(pathRet(p + 'R', r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRet(p + 'C', r, c - 1));
        }
        return list;
    }

    static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
            list.addAll(pathRetDiagonal(p + 'H', r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRetDiagonal(p + 'V', r, c - 1));
        }
        if (c > 1 && r > 1) {
            list.addAll(pathRetDiagonal(p + 'D', r - 1, c - 1));
        }
        return list;
    }

    static void pathRestriction(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        if (r < maze.length - 1) {
            pathRestriction(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            pathRestriction(p + 'R', maze, r, c + 1);
        }
    }
}
