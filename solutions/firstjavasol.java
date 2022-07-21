import java.util.Scanner;

/****
## Write Java programs for the following:

1. Write a program to print whether a number is even or odd, also take
input from the user.
2. Take name as input and print a greeting message for that particular name.
3. Write a program to input principal, time, and rate (P, T, R) from the user and
find Simple Interest.
4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
(Use if conditions)
5. Take 2 numbers as input and print the largest number.
6. Input currency in rupees and output in USD.
7. To calculate Fibonacci Series up to n numbers.
8. To find out whether the given String is Palindrome or not.
9. To find Armstrong Number between two given number.*/

// 1.Write a program to print whether a number is even or odd, also take
input from the user.
import java.util.Scanner;
public class firstjavasol {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        if(number%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}


//2. Take name as input and print a greeting message for that particular name.
import java.util.Scanner;
public class firstjavasol{
    public static void main(String[] args) {
    System.out.println("Enter your name");
    Scanner input=new Scanner(System.in);
    String name=input.next();
    System.out.println("Greetings "+name);
    }
}


// 3. Write a program to input principal, time, and rate (P, T, R) from the user andfind Simple Interest.
public class firstjavasol {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter 3 numbers: ");
        int p=input.nextInt();//prinicpal value
        int n=input.nextInt();//number bet 1 to 12
        float r=input.nextFloat();//rate of interest
        System.out.println(p*n*r/100);

    }
    
}

//4. Take in two numbers and an operator (+, -, *, /) and calculate the value.(Use if conditions)

public class firstjavasol {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 2 numbers: ");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("enter operater");
        char op=input.next().charAt(0);
        if(op=='+'){
            
            System.out.println(a+b);
        }
        else if (op=='-'){
           System.out.println(a-b);
        }
        else if(op=='*'){
            System.out.println(a*b);
    }
        else if(op=='/'){
            System.out.println(a/b);
        }
        else if(op=='%'){
            System.out.println(a%b);
        }
    
    }
}


//5. Take 2 numbers as input and print the largest number.
public class firstjavasol {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a=input.nextInt();
        int b=input.nextInt();
        if(a>b){
            System.out.printf("%d is largest",a);
        }
        else if(a==b){
            System.out.println("both are equal");

        }
        else{
            System.out.printf("%d is largest",b);
        }
    }
}

//6. Input currency in rupees and output in USD.

public class firstjavasol {   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter inr");
        int rup=input.nextInt();
        System.out.println(rup*0.013);
    }
}

//7. To calculate Fibonacci Series up to n numbers.
public class firstjavasol{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number:  ");
        int n1=0,n2=1,n3;
        int N=input.nextInt();
        System.out.print(n1+","+n2);
        for(int i=2;i<N;i++){
            n3=n1+n2;
            System.out.print(","+n3);
            n1=n2;
            n2=n3;
        }
        
    }
}

//8. To find out whether the given String is Palindrome or not.
public class firstjavasol {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a string: ");
        String str=input.next();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);
        if(str.compareTo(rev)==0){
            System.out.println("palindrome");
        }
       else{
        System.out.println("not a palindrome");
       }
    }
}


// 9. To find Armstrong Number between two given number.
public class firstjavasol {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 2 numbers: ");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println(Armstrong(a));
        System.out.println(Armstrong(b)); 

    }

    static String Armstrong(int m){
        int sum=0;
        int org=m;
        while(m>0){
        int last=m%10;
        sum=sum+last*last*last;
        m =m/10;
        }
        //return(sum);
        if(sum==org){
            return(sum+ " amstrong");
        }
        else{
            return(sum+ " not an amstrong");
        }
    }
}
