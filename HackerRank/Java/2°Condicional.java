import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        
        if(n>=2 && n<=5 && n%2==0){
            System.out.println(n);
            System.out.println("Not Weird");}
        else if(n>=6 && n<=20 && n%2==0){
            System.out.println(n);
            System.out.println("Weird");}
            else if(n>=20 && n%2==0){
                System.out.println(n);
                System.out.println("Not Weird");
            } else {
                    System.out.println(n);
                    System.out.println("Weird");
                }
            }
            }
       
