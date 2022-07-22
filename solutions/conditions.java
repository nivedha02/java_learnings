import java.util.Arrays;
import java.util.Scanner;

//[Subtract the Product and Sum of Digits of an Integer]
 
public class conditions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        int n=input.nextInt();
        int sum=0;
        int product=1;
        while(n>0){
            int last=n%10;
            sum+=last;
            product*=last;
            n=n/10;
        }
        System.out.println( "sum=" +sum +"\n"+"product= "+product);
     }
}



//Input a number and print all the factors of that number (use loops).
public class conditions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        int n=input.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0){
                System.out.println(i+" ");
                }             
     }
  }
}



//Take integer inputs till the user enters 0 and print the sum of all numbers(HINT: while loop)

public class conditions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        int sum=0;
        int n;
        while((n=input.nextInt())!=0){
            sum+=n;
        }
        System.out.println(sum);
    }
}


//Take integer inputs till the user enters 0 and print the largest number from all.

public class conditions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        int sum=0;
        int n;
        while((n=input.nextInt())!=0){
            if(sum<n){
                sum=n;
            }
        }
        System.out.println(sum);
    }
}

//1. Factorial Program In Java [5!=1*2*3*4*5]
public class conditions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        int n=input.nextInt();
        int pro=1;
        for(int i=1;i<=n;i++){
                pro*=i;
                System.out.print(i+"*");
            }
            System.out.println(" ");
            System.out.println(pro);
        }
}


//7. Power In Java
/***power in java takes double value has input-> Math.pow(base,exponent) */

import java.lang.Math;
public class conditions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println((int)Math.pow(a,b));
    }
}

//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive 
//odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
public class conditions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        int n,neg=0,pos=0,pos_odd=0,pos_even=0;
        while ((n=input.nextInt())!=0) {
            if(n>0){
                if(n%2!=0){
                    pos_odd++;
                }
                else{
                    pos_even++;
                }
            pos++;
            }
            else{
                neg++;
            }
                        
        }
          System.out.println(neg+" "+pos+" "+pos_even+" "+pos_odd);
    }
}
