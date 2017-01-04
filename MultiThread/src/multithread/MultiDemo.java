/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

/**
 *
 * @author Yunindyo Prabowo
 */
public class MultiDemo {
  public MultiDemo(){
      
  }  
    public static void main(String[] args) {
        new NewThread ("Satu");
        new NewThread ("Dua");
        new NewThread ("Tiga");
        
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
    }
}

class NewThread implements Runnable{
    String name;
    Thread t;
    
    NewThread (String threadName){
        name = threadName;
        t = new Thread(this,name);
        System.out.println("New Thread : "+t);
        t.start();
    }
    
    public void run(){
        try{
            for (int n=5;n>0;n--){
                System.out.println(name + " : "+n);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name+ " Interrupted.");
        }
            System.out.println(name + " existing");
    }
    
}
