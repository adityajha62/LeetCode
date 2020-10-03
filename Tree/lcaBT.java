package Tree;

public class lcaBT {
    public static void main(String[] args) {
        BT t= new BT();
        t.insert(t.root,42);
        t.insert(t.root,36);
        t.insert(t.root,48);
        t.insert(t.root,32);
        t.insert(t.root,39);
        t.insert(t.root,45);
        t.insert(t.root,70);
        t.insert(t.root,40);
        int val= lca(t.root,t.root.left.left,t.root.right.left).val;
        System.out.println(val);
    }

    public static TN lca(TN root, TN n1,TN n2){
        if(root==null) return null;
        if(root==n2 || root==n1) return root;
        TN left = lca(root.left,n1,n2);
        TN right = lca(root.right,n1,n2);

        if(left!=null && right !=null){
            return root;
        }
        else if(left!=null || right !=null){
            if(left!=null) return left;
            else return right;
        }
        else return null;

    }
}
