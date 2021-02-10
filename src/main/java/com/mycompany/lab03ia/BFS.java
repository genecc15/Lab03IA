/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab03ia;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Optional;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Génesis Cortez
 */
public class BFS {
    public static<T> Optional<Node<T>> search(T value, Node<T> start){
        Queue<Node<T>> queue = new ArrayDeque<>();
        Queue<Node<T>> FinalQ = new ArrayDeque<>();
        Queue<Node<T>> FinalQue = new ArrayDeque<>();
        Stack<Node<T>> stack = new Stack<>();
        
        Queue<Node<T>> Salva = new ArrayDeque<>();
        queue.add(start);
        //Node<T> GuardarNodo;
        
        Node<T> currentNode;
        Node<T> Temp;
        Node<T> Temp2;
        Set<Node<T>> closed = new HashSet<>();
        
        while(!queue.isEmpty()){
            //Node<T>[] Holi = (Node<T>[]) queue.toArray();
            FinalQ.add(queue.peek());
            currentNode = queue.remove();
            System.out.println("Visitando el nodo: " + currentNode.getValue());
            
            //Verificar si se encuentra en meta
            if(currentNode.getValue().equals(value)){
                //System.out.println("Para quien trabajas");
            System.out.println("Prueba: " + FinalQ.toString());
                for (int i = 0; i < 1; i++) {
                    //FinalQue.add(FinalQ.remove());
                    stack.add(FinalQ.remove());
                }
//                for (int i = 0; i < FinalQ.size(); i++) {
//                     stack.push(FinalQ.remove());
//                }

//Ingeeeee llevaba una lógica pero me quedé sin tiempo, sorry :( 
                for(int i = 0; i< 2; i++)
                {
                    Temp = FinalQ.remove();
                    Temp2 = stack.peek();
                    if (Temp.IsNeighbors(Temp2)) {
                        stack.add(Temp);
                    }
                    else
                    {
                        
                    }
                }
                
            System.out.println("Prueba2: " + stack.toString());
            System.out.println("Prueba3: " + Salva.toString());
                return Optional.of(currentNode);
            }else{
                closed.add(currentNode);
                queue.addAll(currentNode.getNeighbors());
                queue.removeAll(closed);
            }
        }
        return Optional.empty();
    }
}
