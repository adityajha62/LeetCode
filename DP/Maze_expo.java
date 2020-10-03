package DP;

import java.util.ArrayList;
import java.util.HashSet;

public class Maze_expo {
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
            HashSet<Point> fail = new HashSet<>();
            ArrayList<Point> path= new ArrayList<>();
            if(getPath(maze,path,fail,maze.length-1,maze[0].length-1 ))
                return path;
            else
                return  null;
        }
   }
   static boolean getPath(boolean[][] maze,ArrayList<Point> path ,HashSet<Point> fail,int r, int c){
        if(r<0 || c<0 || !maze[r][c]) return false;
        Point p = new Point(r,c);
        if(fail.contains(p)) return false;

        boolean atOrigin = r==0&&c==0;

        if(atOrigin || getPath(maze, path, fail, r-1, c) || getPath(maze, path, fail, r, c-1)){
            path.add(p);
            return true;
        }
        fail.add(p);
        return false;
   }
}
