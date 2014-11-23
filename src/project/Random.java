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
public class Random {

    public int length;
    public int amount;
    public int type;

    Random() {
    }

    // This constructor for GUI
    public Random(int length, int amount, int type) {
        this.length = length;
        this.amount = amount;
        this.type = type;
    }

    public void Input() {
        Scanner scan = new Scanner(System.in);
        boolean okay = true;
        while (okay) {
            System.out.print("Enter length : ");
            length = scan.nextInt();
            if (length < 6) {
                System.out.println("This number isn't correct.");
            } else {
                okay = false;
            }
        }
        System.out.print("Enter amount password : ");
        amount = scan.nextInt();
        System.out.println("Choose type password : ");
        System.out.println("1.Character only");
        System.out.println("2.Number    only");
        System.out.println("3.Character and Number");

        do {
            System.out.print("Do you want type : ");
            type = scan.nextInt();
            if (0 < type && type < 4) {
                break;
            } else {
                System.out.println("Please choose type password again.");
            }
        } while (true);
        this.compilePass();
    }

    public void compilePass() {
        GenRandom gr = new GenRandom(amount);
        for (int count = 0; count < amount; count++) {
            for (int l = 0; l < length; l++) {
                if (type == 1) {
                    gr.randomChar(count);
                } else if (type == 2) {
                    gr.randomNo(count);
                } else {
                    int r = (int) (Math.random() * 10) % 2;
                    if (r == 0) {
                        gr.randomChar(count);
                    } else {
                        gr.randomNo(count);
                    }
                }
            }
        }
        gr.output(amount);
    }

    // This method for GUI
    public String[] compilePassForGUI() {
        GenRandom gr = new GenRandom(amount);
        for (int count = 0; count < amount; count++) {
            for (int l = 0; l < length; l++) {
                if (type == 1) {
                    gr.randomChar(count);
                } else if (type == 2) {
                    gr.randomNo(count);
                } else {
                    int r = (int) (Math.random() * 10) % 2;
                    if (r == 0) {
                        gr.randomChar(count);
                    } else {
                        gr.randomNo(count);
                    }
                }
            }
        }
        return gr.pass;
    }
}
