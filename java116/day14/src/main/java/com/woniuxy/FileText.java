package com.woniuxy;

import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileText {
    public static void main(String[] args) throws IOException {

        //如果给的是文件夹，那file就是目录，如果给的是具体的文件，那file就是文件
        File file = new File("D：\\text01\\text.txt");
        file.createNewFile();

    }
}
