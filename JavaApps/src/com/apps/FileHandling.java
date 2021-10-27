package com.apps;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class FileHandling {
    public static void main(String[] args) {
        try {
//            LoadFile("files.txt");
            LoadFile("file.txt");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void LoadFile(String fileName) throws IOException {
        Path file = FileSystems.getDefault().getPath("", fileName);
        List<String> lines = Files.readAllLines(file);
//        for (int i = 0; i < lines.size(); i++)
//            System.out.println(lines.get(i));
//        for (String line: lines) {
//            System.out.println(line);
//        }
//        lines.forEach((line) -> System.out.println(line));
        lines.forEach(System.out::println);
    }
}