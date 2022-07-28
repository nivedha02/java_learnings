import java.util.Scanner;

/* 
[Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.]
(https://www.java67.com/2019/05/how-to-find-largest-and-smallest-of-three-numbers-in-java.html)*/

public class methods {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number: ");
        int n1=in.nextInt();
        int n2=in.nextInt();
        int n3=in.nextInt();
        maximum(n1,n2,n3);
        minimum(n1,n2,n3);
    }

    static void maximum(int first,int second,int third){
        int maxi=first;
        if(first<second){
            if(second>third){
            maxi=second;
            }
            else{
            maxi=third;
            }
            
            }
            System.out.println("maximum"+" "+maxi);
        }
        
        static void minimum(int first,int second,int third){
            int mini=first;
            if(first>second){
                if(second<third){
                mini=second;
                }
                else{
                mini=third;
                }
                
                }
                System.out.println("minimum"+" "+mini);
            }
            
    }



/****
[Write a program that will ask the user to enter his/her marks (out of 100). 
Define a method that will display grades according to the marks entered as below:]
(https://www.techcrashcourse.com/2017/02/java-program-to-calculate-grade-of-students.html) <br/>
<pre> 
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail 
</pre> **/


public class methods {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER NO.OF SUBJECTS: ");
        int sub=input.nextInt();
        //System.out.print(sub);
        float sumi=0;
        for(int i=1;i<sub+1;i++){
            int marks=input.nextInt();
            sumi += marks;
        }
        System.out.println("total marks: "+sumi);
        float per=(sumi)/(300)*100;
        System.out.println("percentage: "+per);
        grade(per);
        
    }

    static void grade(float number){
        switch((int)number/10){
            case 9:
              System.out.println("Grade is AA");
              break;
            case 8:
              System.out.println("Grade is AB");
              break;
            case 7:
              System.out.println("Grade is BB");
              break;
            case 6:
              System.out.println("Grade is BC");
              break;
            case 5:
              System.out.println("Grade is CD");
              break;
            case 4:
              System.out.println("Grade is DD");
              break;
            default:
              System.out.println("Grade is fail");
              break;
        }
    }
}
    
