package com.training;
/**.
 * 
 * @author mliao
 *
 */

public class Application {

  /** .
  * boo
  * @param args sdf
  */
  public static void main(String[] args) {

    Greeting greet = new Greeting() ;

    System.out.println(greet.getMessage()) ;
    
    Class clsLoader = greet.getClass().getClassLoader().getClass();

    System.out.println("My Cloass Loader" + clsLoader);
    
    String s = new String("Hello");
    
//    Class clsLoader2 = s.getClass().getClassLoader().getClass();
    
//    System.out.println("My Class Loader" + clsLoader2);
    
  }
  
}
