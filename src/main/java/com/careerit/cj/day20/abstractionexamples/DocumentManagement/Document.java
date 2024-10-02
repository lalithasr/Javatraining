package com.careerit.cj.day20.abstractionexamples.DocumentManagement;


    abstract class Document {
        protected String title;
        public Document(String title){
            this.title = title;
        }
        public abstract void open();
        public abstract void save();
        public abstract void close();
    }

