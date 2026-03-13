import java.util.Scanner;
class Traffic{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
String light=scan nextLine();
if(light=="red")
{
System.out.println("stop");
}
else if(light=="yellow")
{
System.out.println("ready");
}
else if(light=="green")
{
System.out.println("go");
}
}
}