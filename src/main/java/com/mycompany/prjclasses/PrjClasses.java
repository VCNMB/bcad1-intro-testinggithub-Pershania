/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses;

/**
 *
 * @author lab_services_student
 */
public class PrjClasses {

    public static void main(String[] args) {
      newClass nc = new newClass(); // creating an object of newClass
        
       nc.helloClass(); // have to usevariable name nc to communicate wit the class
       
       System.out.println(nc.strSecondClassVar); // output variable from 2nd class
    }
}