package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;


public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier textToEdt = new PoemBeautifier();
        textToEdt.decorate("Tekst", "Xxx.", ".xxX",
                (text, start, end) -> start + text + end);
        textToEdt.decorate("Tekst", "", "",
                (text, start, end) -> start + text.toUpperCase() + end);
        textToEdt.decorate("Tekst", "|____", "____|",
                (text, start, end) -> start + text.toUpperCase() + end);
    }
}