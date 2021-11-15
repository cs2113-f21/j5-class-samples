import java.util.*;

public class Ex1 {
  public static Random rand = new Random();

  public static void printSlow(String s, String t) {
    for (int i = 0; i < s.length(); i++) {
      try {
        Thread.sleep(rand.nextInt(1000));
      } catch (Exception e) {}
      System.out.println(t + s.charAt(i));
    }
  }

  public static void main(String[] args) {
    String s = "Mississippi";
    Thread t = new PrintSlowThread(s, "   ");

    t.start();
    //wait for this thread to finish 
    //before running the next thread

    while(t.isAlive());
    printSlow(s, " ");
  }
}

