/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Name & ID");
        System.out.println("2. Random");
        System.out.print("Enter 1 or 2 : ");
        int n = sc.nextInt();
        if(n == 1){
            NameandID ni = new NameandID();
            ni.Input();
        }else if(n == 2){
            Random r = new Random();
            r.Input();
        }
        
    }
    
}
