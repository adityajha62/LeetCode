package Heap;

import java.util.Arrays;

public class Heap { //array based implementation
//for parent-i,left and right children are 2i+1 and 2i+2

    int lastElement=0;
    int [] array;

    Heap(int c){
        int capacity=c;
        array= new int[capacity];
    }


    void insert(int data){
        array[lastElement]=data;
        SiftUp(array,lastElement);
        lastElement++;
    }

    int min(){
        if(lastElement>0)
    return array[0];
        else return -1;
    }

    void SiftUp(int arr[],int ele){
        if(ele==0)
            return;
            else{
                while(ele>0) {
                    int parent = (ele - 1) / 2;
                    if(arr[ele]<arr[parent]){
                        swap(arr,ele,parent);
                    }
                    else break;
                }
            }
        }


    void swap(int a[],int one,int two){
        int temp=a[one];
        a[one]=a[two];
        a[two]=temp;
    }

    void display(){
        for (int i = 0; i <lastElement ; i++) {
            System.out.print(array[i]+" , ");
            }
        System.out.println();
        System.out.println("**********");
    }

    void deletemin(){
        array[0]=array[lastElement-1];
        lastElement--;
        Heapify(array,0,lastElement);
    }

    void Heapify(int[] arr,int root,int size){
        int least=root;
        int l = 2*least+1;
        int r = 2*least+2;

        if(l<size && arr[l]<arr[least]){
            least=l;
        }
        if(r<size && arr[r]<arr[least]){
            least =r;
        }
        if(least!=root) {
            swap(array, least, root);
            Heapify(arr, least, size);
        }
    }

    public static void main(String[] args) {
        Heap heapy = new Heap(5);
        heapy.insert(3);
        heapy.insert(2);
        heapy.insert(1);
        heapy.insert(34);
        heapy.insert(7);
        System.out.println(heapy.min());
        heapy.display();
        heapy.deletemin();
        System.out.println(heapy.min());
        heapy.display();

    }
}
