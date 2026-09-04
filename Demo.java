public class Demo {
  public static void main (String args[]){
    //AUTIBOXING 
//  int x =10;
//  Integer y = x;  // abb ye working hai. // THIS IS CALLED AUTOBOXING
//     Integer y = Integer.valueOf(x); // this is in new java 
//  ye optional hai. 


// System.out.println(y);   // Y APNE AAP INTEGER ME CONVERT HO GAYA. // UNBOXING 
// System.out.println(x); // AUTOBOXING 


  //UNBOXING 

//  int a = new Integer(20); // THIS WILL BE REMOVED IN NEW VERSION UPDATE OF JAVA. 
//  int b = a ; 

// Integer a = 20; //Autoboxing 
// int b = a;  //Unboxing 

// System.out.println(a);    //UNBOXING 
// System.out.println(b);  

// REMEMBER 
// WHEN Integer (Wrapper class) se int (primitive) me convert hoti hai tho ye called UNBOXING 
// WHEN int (primitive) se Integer (Wrapper class) me convert hoti hai tho ye called AUTOBOXING


// tho kab kab ye unboxing aur autoboxing apply hoti hai.

// 1. Assignment statements mein (upper bataya hai)
// 2. Method arguments mein
// 3.Arithmetic operations mein 

// Integer x = 50;  // print 50 hoga  (2nd point prove ho gaya) // unbox bhi hoga auto box bhi hoga 
// printInteger(x); 

// Integer a =10;
// Integer b = 20; 
// int sum = a+b; // andar se compiler ne a.intValue() + b.intValue() karke sum diya hai.
// System.out.println (sum);

Integer x = null;  // isse null pointer exception aayega. vo bhi runtime pe error exception ayega. 
int y = x; 
System.out.println(y);  
printInteger(y);
// humne ye dhyan rakhna chaiye ki hum asi koi bhi cheez na kare jisse humko null pointer exception aaye. 
  
  }

  static void printInteger(int x)
  { 
    System.out.println(x); 
  }
}