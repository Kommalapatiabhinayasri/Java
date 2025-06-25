class TCBF{
  public static void main(String []args){
    try{
      int result=divideByZero();
      System.out.println("Result: "+result);
    }
    catch(ArithmeticException e){  
      System.err.println("an Arithmetic Exception occurred :" +e.getMessage());
    }
    finally{
      System.out.println("this is the finally block");
    }
  }
  public static int divideByZero(){
    int numerator=10;
    int denominator=0;
    return numerator/denominator;
  }
}