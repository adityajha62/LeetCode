package Math;

import java.util.LinkedList;
//linkedlist approach
public class PlusOne {
    public static void main(String[] args) {
        LinkedList<Integer> digits = new LinkedList<>();
        digits.add(9); //LSB
        digits.add(9);
        digits.add(9);
        digits.add(9); //MSB
      int count=0;
        for(int i =digits.size()-1;i>=0;i--){
        int digit=digits.get(i);
        if(digit<9){
            digits.set(i,digit+1);
            break;
        }
        else{
            digits.set(i,0);
            count++;
        }
        }
        if(count==digits.size()) {
            digits.add(0);
            digits.set(0, 1);
        }

        System.out.println(digits);

    }}
// in builts functions of linkedlist, get,set,add,size.