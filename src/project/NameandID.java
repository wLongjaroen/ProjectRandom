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
public class NameandID {

    public int length;
    public int amount;
    public int type;
    public String Name = "";
    public String ID = "";

    public NameandID() {
    }

    // This constructor for GUI
    public NameandID(int length, int amount, String name, String ID) {
        this.length = length;
        this.amount = amount;
        this.Name = name;
        this.ID = ID;
    }

    public void Input() {
        Scanner scan = new Scanner(System.in);
        boolean okay = true;
        System.out.print("Enter Name : ");
        String name = scan.nextLine();
        if (name.indexOf(" ") != -1) {
            String[] n = name.split(" ");
            for (String n1 : n) {
                Name += n1;
            }
        } else {
            Name = name;
        }
        System.out.print("Enter ID : ");
        String id = scan.nextLine();
        if (id.indexOf(" ") != -1) {
            String[] n = id.split(" ");
            for (String n1 : n) {
                ID += n1;
            }
        } else {
            ID = id;
        }
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
        this.compilePass();
    }

    public void compilePass() {
        GenIndex gi = new GenIndex(Name, ID, amount);
        for (int count = 0; count < amount; count++) {
            for (int l = 0; l < length; l++) {

                int r = (int) (Math.random() * 10) % 2;
                if (r == 0) {
                    gi.randomChar(count);
                } else {
                    gi.randomNo(count);
                }

            }
        }
        gi.output(amount);
    }

    // This method for GUI
    public String[] compilePassForGUI() {
        GenIndex gi = new GenIndex(Name, ID, amount);
        for (int count = 0; count < amount; count++) {
            for (int l = 0; l < length; l++) {

                int r = (int) (Math.random() * 10) % 2;
                if (r == 0) {
                    gi.randomChar(count);
                } else {
                    gi.randomNo(count);
                }

            }
        }
        return gi.pass;
    }
}
