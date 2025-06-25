import java.util.*;
 class abhi{
   String a,b;
   void hobbies(){
     System.out.println(a+"\n"+b);
   }
 }
 class chandu extends abhi{
   String name;
   void follow(){
     System.out.println(name);
   }
 } 
public class Main{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    chandu child=new chandu();
    child.a=sc.nextLine();
    child.b=sc.nextLine();
    child.name=sc.nextLine();
    child.follow();
    child.hobbies();
  }
}