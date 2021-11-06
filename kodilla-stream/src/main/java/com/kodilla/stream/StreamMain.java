package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;


public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier textToEdt = new PoemBeautifier();
        textToEdt.beautify("Tekst", "Xxx.", ".xxX",
                (text, start, end) -> start + text + end);
        textToEdt.beautify("Tekst", "", "",
                (text, start, end) -> start + text.toUpperCase() + end);
        textToEdt.beautify("Tekst", "|____", "____|",
                (text, start, end) -> start + text.toUpperCase() + end);
    }
}