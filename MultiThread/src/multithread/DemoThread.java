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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Yunindyo Prabowo
 */
public class DemoThread {

    /**
     * @param args the command line arguments
     */
    
    public DemoThread(){
    
}
    public static void main(String[] args) {
        // TODO code application logic here
        Thread t = Thread.currentThread();
        System.out.println("Current Thread : "+t);
        
        //Change Name Thread
        t.setName("My Thread");
        System.out.println("Thread ini Berubah Menjadi "+t);
        try{
            for (int i=5;i>0;i--){
                System.out.print(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main Thread interupted");
        }
    }
    
}

