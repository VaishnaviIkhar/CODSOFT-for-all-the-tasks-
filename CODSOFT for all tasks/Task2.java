import java.util.*;
class Task2
{
public static void main(String args[])
{
int English,Marathi,Maths,Hindi,History;
double sum,percentage;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks in English");
English=sc.nextInt();
System.out.println("Enter the marks in Marathi");
Marathi=sc.nextInt();
System.out.println("Enter the marks in Maths");
Maths=sc.nextInt();
System.out.println("Enter the marks in Hindi");
Hindi=sc.nextInt();
System.out.println("Enter the marks in History");
History=sc.nextInt();
sum=English+Marathi+Maths+Hindi+History;
System.out.println("The total marks is:"+sum);
percentage=sum*100/500;
System.out.println("The percentage of student is"+percentage);
if(percentage>=90 && percentage<=100)
{
System.out.println("Congratulation,you got A+ grade");
}
else if(percentage<90 && percentage>80)
{
System.out.println("You got A grade");
}
else if(percentage<=80 && percentage>60)
{
System.out.println("You got B grade");
}
else if(percentage<=60 && percentage>40)
{
System.out.println("you got C grade");
}
else if(percentage>=40 && percentage<35)
{
System.out.println("You got D grade");
}
else
{
System.out.println("you really need to concentrate on your study");
}
}
}