/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadpool;

/**
 *
 * @author Usser
 */
public class NewClass  implements Runnable {
     private int id;
    
    public NewClass(int id){
        this.id=id;
        
}
 public void run() {
        System.out.println("===============Bilangan:"+id+"======");
        try{
                Thread.sleep(5000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
        System.out.println("Bil:"+id+"====");
    }
}