public class PrintSlowThread extends Thread {
    private String msg, tab;
  
    public PrintSlowThread(String s, String t) {
      this.msg = s;
      this.tab = t;
    }
  
    public void run() {
      Ex1.printSlow(this.msg, this.tab);
    }
  }
  