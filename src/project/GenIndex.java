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
public class GenIndex extends Generate {

    private final String Name;
    private final String ID;

    public GenIndex(String name, String id, int amount) {
        this.pass = new String[amount];
        for (int i = 0; i < amount; i++) {
            pass[i] = "";
        }
        Name = name;
        ID = id;
    }

    @Override
    void randomNo(int count) {
        int index = (int) (Math.random() * this.ID.length()) % (this.ID.length());
        char ch = ID.charAt(index);
        pass[count] += ch;
    }

    @Override
    void randomChar(int count) {
            int index = (int) (Math.random() * this.Name.length()) % (this.Name.length());
            char ch = Name.charAt(index);
            pass[count] += ch;
    }

    public void output(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println(pass[i]);
        }
    }
}
