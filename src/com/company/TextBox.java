package com.company;

public class TextBox {
    public String text = "No text in this line was set yet";

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }

}
