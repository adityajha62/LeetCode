package Tree;

public class TN {
    int val;
    TN left;
    TN right;

    public TN(int data) {
        val = data;
    }

}
     class BT{
        TN root;
        public  TN insert(TN curr,int data){
            if(curr==null){
                TN node= new TN(data);
                curr=node;
                if(root==null)
                root=curr;
                return node;
            }
            else{
                if(data<curr.val)
                    curr.left=insert(curr.left,data);
                else
                    curr.right=insert(curr.right,data);
            }
            return curr;

        }


        public void inorder(TN curr){
            if(curr!=null){
                inorder(curr.left);
                System.out.println(curr.val);
                inorder(curr.right);
            }
        }

         public static void main(String[] args) {
            BT t1= new BT();
            t1.insert(t1.root,35);
             t1.insert(t1.root,31);
             t1.insert(t1.root,23);
             t1.insert(t1.root,73);
             t1.insert(t1.root,783);
             t1.insert(t1.root,3);
             t1.inorder(t1.root);




         }
}
