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
        }
        System.out.print("Enter ID : ");
        String id = scan.nextLine();
        if (id.indexOf(" ") != -1) {
            String[] n = id.split(" ");
            for (String n1 : n) {
                ID += n1;
            }
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
        GenIndex gi = new GenIndex(Name,ID,amount);
        for(int count = 0;count < amount ;count++){
            for(int l = 0;l < length;l++){
                if(type == 1){
                    gi.randomChar(count);
                }else if(type == 2){
                    gi.randomNo(count);
                }else{
                    int r = (int) (Math.random() * 10) % 2;
                    if(r == 0){
                        gi.randomChar(count);
                    }else{
                        gi.randomNo(count);
                    }
                }
            }
        }
        gi.output(amount);
    }

}
