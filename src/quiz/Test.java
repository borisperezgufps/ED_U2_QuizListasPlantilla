/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;

/**
 *
 * @author borisperezg
 */
public class Test {
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.add(7);
        ll.add(5);
        ll.add(2);
        ll.add(5);
        ll.add(9);
        
        ll.print();
        
        ll.deleteQuiz(5);
        
        ll.print();
    }
    
}
