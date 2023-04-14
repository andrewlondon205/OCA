package c1;


import java.nio.file.Files;
import java.nio.file.Paths;
//import java.nio.file.*; an alternative way to import Files and Path classes
//import java.nio.*;  NO GOOD – a wildcard only matches class names, not "file.*Files"
//import java.nio.*.*; NO GOOD – you can only have one wildcard, and it must be at the end. A wildcard does not look for classes recursively.
//import java.nio.files.Paths.*  NO GOOD – you cannot import methods, only class names

public class InputImport {

    public void read(Files files) {
        Paths.get("name");
    }
}
