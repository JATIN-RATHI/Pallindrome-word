package checkpallindromeword;
import java.util.Scanner;
public class CheckPallindromeWord {
public static void main(String[] args) {
System.out.println("Enter any name");
Scanner input = new Scanner(System.in);
String name=input.next().toUpperCase();
String rev="";
for(int b=name.length()-1;b>=0;b--)
{
rev=rev+name.charAt(b);
}
System.out.println("Inverse is\n"+rev);
if(name.compareTo(rev)==0)
    {    System.out.println("Pallindrome word");    }
else{    System.out.println("Not a Pallindrome");   }
}   }