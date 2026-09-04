public class Demo2 {
  public static void main(String args[])
  {
    Integer x = 200; 
    Integer y = 200;
  //   System.out.println(x==y);
   
  // System.out.println(x.intValue() ==  y.intValue()); // True ayega  

  // Main a==b directly nhi kar sakta hu. Ye galt hai. 
  // iska matlab ye hai ki kya a & b same reference ko point kar rahe hai ?? 
 System.out.println(x.equals(y));  // True ayega 

  }
}
