public class Main {
    public static void main(String[] args) {
      System.out.println(countSum(10));
  }
  static int countSum(int n){
    if (n==0)return 0;
    return n+countSum(n-1);
  }
}