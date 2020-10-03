package Greedy;

public class LemonadeChange {


    public static void main(String[] args) {
            int arr[]={5,5,10,10,20};
        System.out.println(change(arr));
    }
    public static boolean change(int[] bills){
    int count_5=0,count_10=0;
    int n =bills.length;

for(int i=0;i<n;i++) {

    if (bills[i] == 5) {
        count_5++;
    } else if (bills[i] == 10) {
        if (count_5 >= 1) {
            count_5--;
            count_10++;
        } else return false;
    } else {
        if (count_10 >= 1 && count_5 >= 1) {
            count_10--;
            count_5--;
        } else if (count_5 >= 3) {
            count_5 -= 3;
        } else {
            return false;
        }
    }
}
        return true;

    }
}




