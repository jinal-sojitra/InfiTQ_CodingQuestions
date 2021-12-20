/*
Problem Statement: Given "," seperated string, each term contains <empName>:<empNo> make a password by finding max digit in empNo and add that place char of empName to password.
if not possible then add "X". 

input: "Robert:36787,Tina:68721,Jo:56389"
output: "tiX"

*/

import java.util.Scanner;

/**
 *
 * @author Jinal Sojitra
 */
public class PasswordGenerator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arr=s.split(",",0);
        StringBuilder pass=new StringBuilder();
        for(String i:arr){
            String[] emp=i.split(":",0);
            
            String empName=emp[0];
            String empNo=emp[1];
            
            int nameLen=empName.length();
            int noLen=empNo.length();
            
            int max=-1;
            for(int j=0;j<noLen;j++){
                int d=empNo.charAt(j)-'0';
                max=(d>max && d<=nameLen)?d:max;
            }
            if(max==-1){
                pass.append("X");
            }
            else{
                pass.append(String.valueOf(empName.charAt(max-1)));
            }
        }
        
        System.out.println(pass);
    }
}
