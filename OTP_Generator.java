given string containing numbers, make otp from it by- if no. is odd->square and add in otp, if even then ignore ,print first 4 chars, if there is less than 4 chars then print -1

ex. input: "1234567" output: "1925"
ex.2 input: "222222" output: "-1"
ex.3 input: "9744" output: "8149"


import java.util.Scanner;

/**
 *
 * @author Jinal Sojitra
 */
public class OTP_Generator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        StringBuilder otp=new StringBuilder();
        
        for(int i=0;i<n;i++){
            int d=s.charAt(i)-'0';
            if((d&1)==1){
                int sq=d*d;
                otp.append(Integer.toString(sq));
            }
        }
        String ans=otp.toString();
        if(ans.length()<4){
            System.out.println(-1);
        }
        else{
            System.out.println(ans.substring(0,4));
        }
        
    }
}
