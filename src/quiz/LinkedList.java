/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;

/**
 *
 * @author borisperezg
 */
public class LinkedList {

    private Node head;

    public void add(int val) {
        Node n = new Node(val); // Crear un nuevo nodo con el valor dado

        if (head == null) { // Si la lista está vacía, el nuevo nodo es la cabeza
            head = n;
            return;
        }

        Node p = head; // Apuntador para recorrer la lista
        while (p.getNext() != null) { // Avanza hasta el último nodo
            p = p.getNext();
        }

        p.setNext(n); // Agrega el nuevo nodo al final de la lista
    }
    
    public void print(){
        Node p = head;
        while(p!=null){
            System.out.print(p.getData()+"-");
            p = p.getNext();
        }
        System.out.println("\n");
    }
    
    public void deleteRepeatedNode(int val){
        
    }

}
