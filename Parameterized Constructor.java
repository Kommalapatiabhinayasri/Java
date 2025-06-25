class jash{
  jash(){
    System.out.println("default constructor");
  }
  jash( int i,int j){
    System.out.println("constructor with two parameters");
  }
  jash(int i,int j,int k){
    System.out.println("constructor with three parameters");
  }
  jash(int i,String name){
    System.out.println("constructor with int and String parameters");
  }
  public static void main(String args[]){
    jash obj=new jash();
    jash obj2=new jash(12,12);
    jash obj3=new jash(1,2,13);
    jash obj4=new jash(1,"begineersbook");
  }
}