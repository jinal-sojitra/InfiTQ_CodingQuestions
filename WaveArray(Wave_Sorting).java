Problem Statement: Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array, such that arr[0] <= arr[1] >= arr[2] <= arr[3] >= arr[4]....
ex. input: n=5(size of array) arr[]={1,2,3,4,5}
    Output: arr[]={1,3,2,5,4}

import java.util.Scanner;

/**
 *
 * @author Jinal Sojitra
 */
public class WaveSort_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
      
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i+=2){
            if(i>0 && arr[i]>arr[i-1]){
                swap(i-1,i,arr);
            }
            
            if(i<n-1 && arr[i]>arr[i+1]){
                swap(i,i+1,arr);
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    static void swap(int first,int second,int[] arr){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
