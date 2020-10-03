package Greedy;
import java.util.*;
public class AssignCookies {
    public static void main(String[] args) {
        int g[]={10,9,8,7};
        int s[]={5,6,7,8};
        System.out.println(counter(g,s));
    }
    public static int counter(int[]g,int[]s){
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        for(int i=0,j=0;i<s.length;i++){
            if(j<g.length&&s[i]>=g[j]){
                count++;
                j++;
            }
        }


        return count;


    }
}
