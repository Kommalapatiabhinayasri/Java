public class Main
{
  public static void main(String[] args){
    fib(0,1,6);
  }
  static void fib(int a,int b,int n){
    if(n==0)return;
    System.out.println(a+" ");
    fib(b,a+b,n-1);
  }
}