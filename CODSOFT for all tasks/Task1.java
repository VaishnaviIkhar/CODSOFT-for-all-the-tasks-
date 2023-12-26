import java.util.*;
class Task1
{
public void userChoice()
{
int a;
Scanner sc=new Scanner(System.in);

for(int i=1;i<=3;i++)
{
System.out.println("enter your choice:"+i);
a=sc.nextInt();
if(a>0 && a<30)
{
System.out.println("you are very Far from the number");
double c=a*100/55;
System.out.println("your score is:"+c);
}
else if(a>=30 && a<55)
{
System.out.println("you are very near to the number");
double c=a*100/55;
System.out.println("your score is:"+c);
}
else if(a>55 && a<=80)
{
System.out.println("you goes away from the number");
int d=100-a;
int c=d*100/55;
System.out.println("Your score is:"+c);
}
else if(a>80 && a<=100)
{
System.out.println("you go far away from the number");
int d=100-a;
int c=d*100/55;
System.out.println("your score is:"+c);
}
else
{
System.out.println("Congratulations,you win the game");
System.out.println("you score is 100 out of 100");
break;
}
}
}
public static void main(String args[])
{
Task1 t1=new Task1();
t1.userChoice();
Scanner sc=new Scanner(System.in);
System.out.println("you want to play this game again Y or N");
char x=sc.next().charAt(0);
if(x=='Y')
{
t1.userChoice();
}
else
{
System.out.println("Thank you,for playing this game with me");
}
}
}
