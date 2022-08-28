package com.gok.mybatis_plus;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalTime;

/**
 * @author huai
 * @date 2022/8/28
 */
public class NomalTest {

    public static void main(String[] args) throws Exception {
//        测试拷贝文件(每次读入的字节数与效率高低比较) 可以输入数组长度
//        testCopyFile(1024);
//        testCopyFile(10);

//        使用data流 把一个日志文件中的字符串读入并在控制台打印出啦
        testDataStream();
    }

    private static void testDataStream() throws Exception {
//        使用data流 把一个日志文件中的字符串读入并在控制台打印出啦
        FileInputStream fileInputStream = new FileInputStream("E:\\SpringBoot\\vue\\test.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        while (dataInputStream.available() > 0) {
            System.out.println(dataInputStream.readUTF());
        }


    }

    private static void testCopyFile(int bytesLength) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("E:\\SpringBoot\\vue\\test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\SpringBoot\\vue\\copy.txt");
        byte[] bytes = new byte[bytesLength];
        LocalTime start = LocalTime.now();
        while (true) {
            int read = fileInputStream.read(bytes);
            if (read == -1) {
                break;
            }
            fileOutputStream.write(bytes, 0, read);
        }
        LocalTime end = LocalTime.now();
        System.out.println("数组长度" + bytesLength + "耗时：" + (end.getNano() - start.getNano()));
//        System.out.println("耗时：" + (end.getNano() - start.getNano())  + "纳秒");
        fileInputStream.close();
        fileOutputStream.close();
    }
}
