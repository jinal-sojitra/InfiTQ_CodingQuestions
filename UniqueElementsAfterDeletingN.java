/*
Problem Statement: Find Least no. of unique  elements after deleting n numbers of elements.

ex:
input: int: 2 String: 1,2,3,3,4,4
Output: int 2
*/

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Jinal Sojitra
 */
public class UniqueElementsAfterDeletingX {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        String[] arr=s.split(",");
        HashSet<Integer> hs=new HashSet<>();
        for(String i:arr){
            int d=Integer.parseInt(i);
            hs.add(d);
        }
        System.out.println(hs.size()-n);
    }
}
