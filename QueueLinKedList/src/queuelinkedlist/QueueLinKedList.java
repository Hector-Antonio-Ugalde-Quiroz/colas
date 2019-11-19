/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuelinkedlist;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Alumno
 */
public class QueueLinKedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue <String> queue = new LinkedList();
        
        queue.add("Adrian");
        queue.add("Adrianes");
        queue.add("Adriana");
        
        queue.offer("Francisco");
        System.out.println("Se elimino"+queue.remove());
        System.out.println("Frente de la cola"+queue.element());
        System.out.println("Se elimino el elemento" +queue.peek());
        
    }
    
}
