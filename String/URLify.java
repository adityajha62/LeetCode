package String;

import java.util.Arrays;

public class URLify {
    public static void main(String[] args) {
        String str="Mr John Smith    "; //I/O
        char[] arr= str.toCharArray();
        int truelength=13;//I/O   //size of the name part with spaces
        int letters=0;
        for(int i =arr.length-1;i>=0;i--){
            if(arr[i]!= ' '){
                letters++;
            }
        }
        int spaces=truelength-letters;
        int index= truelength+2*spaces;   //index tracks the editable part. where data entry to be done
        for (int i =truelength-1;i>=0;i--){
            if(arr[i] == ' '){             // i inspects the element exhaustively
                arr[index-1]='0';
                arr[index-2]='2';
                arr[index-3]='%';
                index-=3;
            }
            else{
                arr[index-1]=arr[i];
                index--;
            }
        }
        String str1 = new String(arr);
        System.out.println(str1);

    }
}
