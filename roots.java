import java.util.Scanner;
class roots{

public static void main(String [] args){

Scanner input = new Scanner(System.in);
double a,b,c,r;

System.out.println("Input a: ");
 a = input.nextDouble();
 
System.out.println("Input b: ");
b = input.nextDouble();

System.out.println("Input c: ");
c = input.nextDouble();

r=b*b-4.0*a*c;
double x1,x2;

if(r>0.0)
{ x1 = -b + Math.sqrt(r) / (2 * a);
  x2 = -b - Math.sqrt(r) / (2 * a);

   System.out.println("roots are : "+x1+"  &  "+x2);
}

else if(r==0.0)
{ x1 = x2=-b / (2 * a);
   System.out.println("roots are equal");
}

else if(r<0.0){ System.out.println("it has no real roots");}

}

}