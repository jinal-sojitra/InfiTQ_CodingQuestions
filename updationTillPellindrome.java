Problem Statement: update given no. x by adding reverse of x untill x becomes pellindrome. if x becomes pellindrome then stop updation and print value of x.
ex. input: x=95 , output: x=1111
ex.2 input: x=15 , output: x=66
ex.3 input: x=142 , output: x=383
ex.4 input: x=1335 , output: x=6666

import java.util.Scanner;

/**
 *
 * @author Jinal Sojitra
 */
public class InfiTQPellindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        
        do{
            x=x+rev(x);
        }while(x!=rev(x));
        
        System.out.println(x);
    }
    
    static int rev(int x){
        int rev=0;
        while(x>0){
            int d=x%10;
            x/=10;
            rev=rev*10+d;
        }
        return rev;
    }
}
