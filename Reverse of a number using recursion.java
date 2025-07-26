public class Main {
    public static void main(String[] args) {
      System.out.println(Reverse(12345));
  }
  static int rev=0;
  static int Reverse(int n){
    if (n==0) return 0;
    rev=rev*10+n%10;
    Reverse(n/10);
    return rev;
  }
}