package com.nenix;

import com.filesystem.File;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("\t\tWelcome to Java Virtual Operating System (JVOS)!\n\n");
        System.out.println("Connecting filesystem [WAIT]\n");
        final int max_file = 100000;
        File fileSystem = new File(max_file);
        System.out.println("FileSystem Connected! [OK]\n");
        System.out.println("Creating shell proccess [WAIT]\n");
        System.out.println("Loaded all functions! [OK]\n\n");
    }
}