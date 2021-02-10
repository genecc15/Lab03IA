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
import java.util.Stack;

/**
 *
 * @author Génesis Cortez
 */
public class DFS {
     public static<T> Optional<Node<T>> search(T value, Node<T> start){
        Stack<Node<T>> stack = new Stack<>();
        stack.add(start);
        
        Node<T> currentNode;
        Set<Node<T>> closed = new HashSet<>();
        
        while(!stack.isEmpty()){
            currentNode = stack.pop();
            System.out.println("Visitando el nodo: " + currentNode.getValue());
            stack.push(currentNode);
            
            //Verificar si se encuentra en meta
            if(currentNode.getValue().equals(value)){
                
                return Optional.of(currentNode);
            }else{
                closed.add(currentNode);
                stack.addAll(currentNode.getNeighbors());
                stack.removeAll(closed);
            }
        }
        return Optional.empty();
    }
}
