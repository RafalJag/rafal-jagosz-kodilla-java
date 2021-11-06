package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;


public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier text = new PoemBeautifier();
        text.beautify("Tekst", "Xxx.", ".xxX",
                (text, start, end) -> start + text + end);
        text.beautify("Tekst", "", "",
                (text, start, end) -> start + text.toUpperCase() + end);
        text.beautify("Tekst", "|____", "____|",
                (text, start, end) -> start + text.toUpperCase() + end);

    }
}