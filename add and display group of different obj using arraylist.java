import java.util.ArrayList;
class Main{
  public static void main(String []args){
    ArrayList<Object>objectList=new ArrayList<>();
  objectList.add(42);
  objectList.add("hello");
  objectList.add(3.14);
  objectList.add(true);
  for(Object obj:objectList){
    System.out.println(obj);
  }
  }
}