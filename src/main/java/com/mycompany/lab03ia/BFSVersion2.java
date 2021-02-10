/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab03ia;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author Génesis Cortez
 */
public class BFSVersion2 {
    public static<T> Optional<Node<T>> GrapSearch(T value, Node<T> start){
    Queue<Node<T>> queue = new ArrayDeque<>();
        queue.add(start);
        
        var Error = new Node<String>("Failure");
         Node<T> currentNode;
        Set<Node<T>> closed = new HashSet<>();
        while(!queue.isEmpty()){      
            currentNode = queue.remove();
            System.out.println("Visitando el nodo: " + currentNode.getValue());
            //Verifica si es meta
            if(currentNode.getValue().equals(value)){
                
                return Optional.of(currentNode);
            }else{
                closed.add(currentNode);
                queue.addAll(currentNode.getNeighbors());
                queue.removeAll(closed);
            }
        }
        if(queue.isEmpty()){
            System.out.println(Error.getValue());
        }
        return Optional.empty();
    }
}
