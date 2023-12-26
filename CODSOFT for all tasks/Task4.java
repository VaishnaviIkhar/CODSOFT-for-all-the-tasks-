import java.util.*;
class Selection
{
public void display()
{
System.out.println("1.Dollar to rupee");
System.out.println("2.Dollar to Euro");
System.out.println("3.Dollar to Yen");
System.out.println("4.Dollar to Pound");

System.out.println("5.rupee to Dollar");
System.out.println("6.rupee to Euro");
System.out.println("7.rupee to Yen");
System.out.println("8.rupee to Pound");

System.out.println("9.Euro to Dollar");
System.out.println("10.Euro to rupee");
System.out.println("11.Euro to Yen");
System.out.println("12.Euro to Pound");

System.out.println("13.Yen to Dollar");
System.out.println("14.Yen to rupee");
System.out.println("15.Yen to Euro");
System.out.println("16.Yen to Pound");

System.out.println("17.Pound to Dollar");
System.out.println("18.Pound to rupee");
System.out.println("19.Pound to Euro");
System.out.println("20.Pound to Yen");
}
}
class Task4 extends Selection
{
public static void main(String args[])
{
Task4 t1=new Task4();
System.out.println("Choose the number from below which you want to convert");
t1.display();
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println("enter the amount which you want to convert");
int c=sc.nextInt();
switch(a)
{
case 1:
double v=83.38*c;
System.out.println(c+"$="+v+"₹");
break;
case 2:
double b=0.93*c;
System.out.println(c+"$="+b+"€");
break;
case 3:
double d=142.12*c;
System.out.println(c+"$="+d+"¥");
break;
case 4:
double e=0.80*c;
System.out.println(c+"$="+e+"£");
break;
case 5:
double f=0.012*c;
System.out.println(c+"₹="+f+"$");
break;
case 6:
double g=0.011*c;
System.out.println(c+"₹="+g+"€");
break;
case 7:
double h=1.75*c;
System.out.println(c+"₹="+h+"¥");
break;
case 8:
double i=0.0095*c;
System.out.println(c+"₹="+i+"£");
break;
case 9:
double j=1.08*c;
System.out.println(c+"€="+j+"$");
break;
case 10:
double k=89.93*c;
System.out.println(c+"€="+k+"₹");
break;
case 11:
double l=156.91*c;
System.out.println(c+"€="+l+"¥");
break;
case 12:
double m=0.86*c;
System.out.println(c+"€="+m+"£");
break;
case 13:
double n=0.0069*c;
System.out.println(c+"¥="+n+"$");
break;
case 14:
double o=0.57*c;
System.out.println(c+"¥="+o+"₹");
break;
case 15:
double p=0.0064*c;
System.out.println(c+"¥="+p+"€");
break;
case 16:
double q=0.0055*c;
System.out.println(c+"¥="+q+"£");
break;
case 17:
double s=1.26*c;
System.out.println(c+"£="+s+"$");
break;
case 18:
double t=104.76*c;
System.out.println(c+"£="+t+"₹");
break;
case 19:
double u=1.16*c;
System.out.println(c+"£="+u+"€");
break;
case 20:
double w=182.90*c;
System.out.println(c+"£="+w+"¥");
break;
default:
System.out.println("Please choose valid option");
}
}
}