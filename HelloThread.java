public class HelloThread extends Thread{

    int idx;
    public HelloThread(int i){
        super();
        idx=i;
    }

    public void run(){ //entry point for a thread, like main
        System.out.println("Hello, Thread - " + idx);
    }

    public static void main(String args[]){
        for(int i=0;i<10;i++){
            Thread th  = new HelloThread(i);
            th.start(); //start's thread and runs run()
            //th.run();
        }
        System.out.println("Hello, Main");
    }


}