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
import java.util.Stack;

/**
 *
 * @author Génesis Cortez
 */
public class BFS {
    public static<T> Optional<Node<T>> search(T value, Node<T> start){
        Queue<Node<T>> queue = new ArrayDeque<>();
        queue.add(start);
        Stack<Node<T>> stack = new Stack<>();
        
        Node<T> currentNode;
        Set<Node<T>> closed = new HashSet<>();
        
        while(!queue.isEmpty()){
//            for(Node<T> t: queue){
//                System.out.println(t.toString());
//            }
//            System.out.println("Cuanto te pagaban");
            currentNode = queue.remove();
            System.out.println("Visitando el nodo: " + currentNode.getValue());
            stack.push(currentNode);
            
            //Verificar si se encuentra en meta
            if(currentNode.getValue().equals(value)){
                //System.out.println("Para quien trabajas");
                for(Node<T> t: stack)
                {
                    Queue<Node<T>> temp = new ArrayDeque<>();
                    temp.addAll(currentNode.getNeighbors());
                }
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
