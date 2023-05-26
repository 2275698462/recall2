package com.illusion.file.homework;

import java.io.File;
import java.io.IOException;

public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:\\io\\hello.txt");
        //创建一个与file同目录下的另外一个文件，文件名为haha.txt
        File file2 = new File(file1.getParent(), "haha.txt");
        boolean b1 = file2.createNewFile();
        if (b1){
            System.out.println("创建成功");
        }
        //file2.delete();删除目录
    }
}
