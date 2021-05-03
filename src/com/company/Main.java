package com.company;

public class Main {
    public static void main(String[] args) {
        var textBox1 = new TextBox();
        //textBox1.setText("This is Box 1");
        System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new TextBox();
        textBox2.setText("This is the 2nd box");
        System.out.println(textBox2.text.toUpperCase());
    }
}
