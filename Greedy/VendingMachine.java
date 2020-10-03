package Greedy;

import java.util.*;

public class VendingMachine {
    public static void main(String[] args) {
        HashMap<Integer,Integer> codes = new HashMap<>();
        codes.put(1,10);
        codes.put(2,15);
        codes.put(3,25);
        codes.put(4,45);
        codes.put(5,70);
        codes.put(6,250);
        codes.put(7,350);

        HashMap<Integer,Integer> count = new HashMap<>();

        count.put(1,30);
        count.put(2,30);
        count.put(5,30);
        count.put(10,30);
        count.put(20,30);
        count.put(50,30);
        count.put(100,30);
        count.put(500,30);
        count.put(2000,30);


        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int code = sc.nextInt();
            int money=sc.nextInt();

            int cost=codes.get(code);
            int change=money-cost;
            System.out.println(answer(count,change));
        }

        StringBuilder sb = new StringBuilder();
       Object[] keys = count.keySet().toArray();
       Arrays.sort(keys);

        for(Object val : keys){
            sb.append(val);
            sb.append("=");
            sb.append(count.get(val)+" ");
        }
        int k = sb.length();
        sb.delete(k-1,k);
        System.out.println(sb.toString());
    }


    public static String answer(HashMap<Integer,Integer>count,int change){
        if(change<0) return "0";
        if(change==0) return "1";
        int denomination[] =new int[]{1,2,5,10,20,50,100,500,2000};
        int len = denomination.length;
        HashMap<Integer,Integer> curr = new HashMap<>();
        for(int i =len-1;change>0&&i>=0;i--){
            if(denomination[i]<=change){

                change-=denomination[i];
                count.put(denomination[i],count.get(denomination[i])-1);
                if(curr.containsKey(denomination[i])){
                    curr.put(denomination[i],1+curr.get(denomination[i]));
                }
                else{
                    curr.put(denomination[i],1);
                }
                i++;
            }

        }
        StringBuilder sb = new StringBuilder();
        Object [] keys = curr.keySet().toArray();
        Arrays.sort(keys);
        for(Object val : keys){
            sb.append(val);
            sb.append("=");
            sb.append(curr.get(val)+" ");
        }
        int k = sb.length();
        sb.delete(k-1,k);
        return sb.toString();
    }
}
