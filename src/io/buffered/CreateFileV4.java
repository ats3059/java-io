package io.buffered;

import java.io.FileOutputStream;
import java.io.IOException;

import static io.buffered.BufferedConst.FILE_NAME;
import static io.buffered.BufferedConst.FILE_SIZE;

public class CreateFileV4 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        long startTime = System.currentTimeMillis();

        byte[] buffer = new byte[FILE_SIZE];

        for (int i = 0; i < FILE_SIZE; ) {
            buffer[i] = 1;
        }

        fos.write(buffer);
        fos.close();

        long endTime = System.currentTimeMillis();
        System.out.println("FileCreated : " + FILE_NAME);
        System.out.println("FileSize  : " + FILE_SIZE / 1024 / 1024 + "MB" );
        System.out.println("Time taken : " + (endTime - startTime) + "ms");


    }
}
