public class Main {
    public static void main(String[] args) {
      System.out.print(countNum(1234));
  }
  static int countNum(int n){
    int c=0;
    if (n==0)return 1;
    c++;
    return c+countNum(n/10-1);
    
  }
}