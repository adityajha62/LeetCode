package DP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Maze_poly {
    static class Point{
        int r,c;
        Point(int row, int col){
            r=row;
            c=col;
        }
    }

    public static void main(String[] args) {
        boolean[][] maze=new boolean[][]{{true,false,true},{true,true,false},{false,true,true}};
        ArrayList<Point> paths;
        paths=getPath(maze);
        for (int i = 0; i <paths.size() ; i++) {
            System.out.println(paths.get(i).r +","+paths.get(i).c);
        }
    }
    static ArrayList<Point> getPath(boolean[][] maze){
        if(maze.length==0) return null;
        else{
            HashMap<Point,Boolean> cache = new HashMap<>();
            ArrayList<Point> path= new ArrayList<>();
            if(getPath(maze,path,cache,maze.length-1,maze[0].length-1 ))
                return path;
            else
                return  null;
        }
    }
    static boolean getPath(boolean[][] maze,ArrayList<Point> path ,HashMap<Point,Boolean> cache,int r, int c){
        if(r<0 || c<0 || !maze[r][c]) return false;
        Point p = new Point(r,c);
        if(cache.containsKey(p)) return cache.get(p);

        boolean atOrigin = r==0&&c==0;
        boolean success=false; //local variable, state var.

        if(atOrigin || getPath(maze, path, cache, r-1, c) || getPath(maze, path, cache, r, c-1)){
            path.add(p);
            success=true;  // no return
        }
        cache.put(p,success);
        return success;
        //tail recursion
    }
}
