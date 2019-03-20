/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopila;

/**
 *
 * @author educacionit
 */
public class Pila {
    
    void m1() {
        System.out.println("antes de llamar a m2");
        m2();
        System.out.println("despues de llamar a m2");
    }
    
    void m2() {
        System.out.println("antes de llamar a m3");
        m3();
        System.out.println("despues de llamar a m3");
    }
    
    void m3() {
        System.out.println("antes de llamar a m4");
        m4();
        System.out.println("despues de llamar a m4");        
    }
    
    void m4() {
        System.out.println("antes de llamar a m5");
        m5();
        System.out.println("despues de llamar a m5");
    }
    
    void m5() {
        System.out.println("antes de llamar a m6");
        m6();
        System.out.println("despues de llamar a m6");
    }
    
    void m6() {
        System.out.println("llegue a m6");
        m6();
    }