/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finals_enrollment;

import java.util.ArrayList;
import javax.swing.Timer;

/**
 *
 * @author aname
 */
public class Finals_enrollment {
    // professors
    public static ArrayList<String> username = new ArrayList<String>();
    public static ArrayList<String> name = new ArrayList<String>();
    public static ArrayList<String> password = new ArrayList<String>();
    public static String previousFrame = "";
    
    // new student
    public static ArrayList<String> username1 = new ArrayList<String>();
    public static ArrayList<String> name1 = new ArrayList<String>();
    public static ArrayList<String> password1 = new ArrayList<String>();
    
    //ATTEMPTS & TIMER
    public static int adminAttempts = 3;
    public static Timer adminTimer;
    public static int studentAttempts = 3;
    public static Timer studentTimer;
    public static int professorAttempts = 3;
    public static Timer professorTimer;
    

    
    
     
  

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
