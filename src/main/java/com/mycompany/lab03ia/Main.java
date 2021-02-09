/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab03ia;

/**
 *
 * @author Génesis Cortez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var zona1 = new Node<Integer>(1);
        var zona2 = new Node<Integer>(2);
        var zona5 = new Node<Integer>(5);
        var zona4 = new Node<Integer>(4);
        var zona9 = new Node<Integer>(9);
        var zona10 = new Node<Integer>(10);
        var zona15 = new Node<Integer>(15);
        var zona16 = new Node<Integer>(16);
        var zona13 = new Node<Integer>(13);
        var zona14 = new Node<Integer>(14);
        var zona12 = new Node<Integer>(12);
        var zona21 = new Node<Integer>(21);
        
        zona1.connect(zona2);
        zona1.connect(zona5);
        zona1.connect(zona4);
        zona1.connect(zona9);
        zona9.connect(zona13);
        zona5.connect(zona4);
        zona4.connect(zona10);
        zona4.connect(zona9);
        zona10.connect(zona14);
        zona10.connect(zona15);
        zona15.connect(zona16);
        zona14.connect(zona13);
        zona13.connect(zona12);
        zona12.connect(zona21);
        BFS.search(16, zona2);
    }
    
}
