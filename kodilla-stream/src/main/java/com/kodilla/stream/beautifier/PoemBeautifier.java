package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String textToDecorate, String start, String end, PoemDecorator text){
        String result = text.decorate(textToDecorate, start, end);
        System.out.println(result);
    }
}