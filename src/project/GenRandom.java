/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

/**
 *
 * @author Administrator
 */
public class GenRandom extends Generate{
    public GenRandom(int amount){
        this.pass = new String[amount];
        for(int i = 0;i < amount;i++){
            pass[i] = "";
        }
    }
    
    @Override
    void randomNo(int count) { // random Number
        int c = (int) (Math.random() * 10) % 10;
        pass[count] += Integer.toString(c);
    }

    @Override
    void randomChar(int count) { // random Character 
        int r = (int) (Math.random() * 10) % 2;
        switch (r) {
            case 0: { // random Lower letter
                int c = (int) (Math.random() * 100) % 26;
                char a = (char) ('a' + c);
                pass[count] += a;
            }
            break;
            case 1: { // random Upper letter
                int c = (int) (Math.random() * 100) % 26;
                char a = (char) ('A' + c);
                pass[count] += a;
            }
            break;
        }
    }
    
    public void output(int amount){
        for(int i = 0;i < amount;i++){
            System.out.println(pass[i]);
        }
    }
    
}
