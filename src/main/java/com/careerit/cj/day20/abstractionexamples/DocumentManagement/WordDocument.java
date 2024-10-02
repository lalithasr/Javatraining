package com.careerit.cj.day20.abstractionexamples.DocumentManagement;

public class WordDocument extends Document {

    public WordDocument(String title) {
        super(title);
    }

    @Override
    public void open() {
        System.out.println("Opening the word document : " + title);
    }

    @Override
    public void save() {
        System.out.println("Saving the word document : " + title);
    }

    @Override
    public void close() {
        System.out.println("Closing the word document : " + title);
    }
}
