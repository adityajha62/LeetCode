package Tree;

import java.util.ArrayDeque;
import java.util.Queue;

//using a delimiter
public class levelbylevelI {
    public static void main(String[] args) {
        BT t= new BT();
        t.insert(t.root,5);
        t.insert(t.root,4);
        t.insert(t.root,6);
        t.insert(t.root,3);
        t.insert(t.root,2);
        t.insert(t.root,7);
        lbl(t.root);
    }
    public static void lbl(TN curr){
        Queue<TN> q = new ArrayDeque<>();
        q.add(curr);
        q.offer(null);
        while(!q.isEmpty()){
        TN pres=q.poll();
        if(pres==null){
            System.out.println("");
            q.add(null);
        }
        else{
            if(pres.left!=null) q.add(pres.left);
            if(pres.right!=null) q.add(pres.right);
            System.out.print(pres.val+" ");

        }

        }
    }
}
