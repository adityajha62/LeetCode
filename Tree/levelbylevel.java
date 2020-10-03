package Tree;
//level by level printing  : 2 queue method
import java.util.ArrayDeque;
import java.util.Queue;

public class levelbylevel {
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
        Queue<TN> q1 = new ArrayDeque<>();
        Queue<TN> q2 = new ArrayDeque<>();

        q1.add(curr);

        while(!q1.isEmpty() || !q2.isEmpty()){
            while(!q1.isEmpty()){
                TN pres=q1.poll();
                if(pres.left!=null)
                    q2.add(pres.left);
                    if(pres.right!=null)
                        q2.add(pres.right);
                System.out.print(pres.val+" ");
                }
            System.out.println(" ");
            while(!q2.isEmpty()){
                TN pres=q2.poll();
                if(pres.left!=null)
                    q1.add(pres.left);
                if(pres.right!=null)
                    q1.add(pres.right);
                System.out.print(pres.val+" ");
            }
            System.out.println(" ");
            }
        }
    }

