public class changeInt{
    public static void main(String[] args){
        int MyNum = 18;
        MyNum = 20;
        System.out.print(MyNum);
    }
}
/*
 If you don't want others (or yourself) to overwrite existing values, 
 use the keyword (this will declare the variable as "final" or "constant",
  which means unchangeable and read-only):final 
 */
/*
public class Main {
  public static void main(String[] args) {
    final int myNum = 15;
    myNum = 20; // will generate an error
    System.out.println(myNum);
  }
}
 */ 
// RESULTS:
/*
Main.java:4: error: cannot assign a value to final variable myNum
    myNum = 20;
         ^
1 error
 */