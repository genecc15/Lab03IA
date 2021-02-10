/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab03ia;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Génesis Cortez
 */
public class Node<T> {
    private T value;
    private Set<Node<T>> neighbors;
    
    public Node(T value){
    this.value = value;
    this.neighbors = new HashSet<>();
    }
    public T getValue(){
        return this.value;
    }
    public Set<Node<T>> getNeighbors(){
        return Collections.unmodifiableSet(neighbors);
    }
    
    public boolean IsNeighbors(Node<T> node){
        if(this.neighbors.contains(node)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void connect(Node<T> node){
        if(this == node) 
            throw new IllegalArgumentException("Un nodo intenta referiarse a si mismo");
        this.neighbors.add(node);
        node.neighbors.add(this);
    }
    
    public String toString(){
        return this.value.toString();
    }
}
