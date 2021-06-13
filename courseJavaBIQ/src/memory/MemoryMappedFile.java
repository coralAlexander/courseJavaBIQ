package memory;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class MemoryMappedFile {

    public static final int SIZE = 50000;

    public static void main(String[] args) throws IOException {

        try (FileChannel channel = new RandomAccessFile("file.bin", "rw").getChannel();
             Scanner scanner = new Scanner(System.in)) {

            // Map the file region from position -> position + SIZE
            MappedByteBuffer out = channel.map(FileChannel.MapMode.READ_WRITE, 0, SIZE);

            System.out.println("Writing to file.bin...");
            // Fill file region with 'A's
            for (int i = 0; i < SIZE; i++) {
                out.put((byte) 'A');
            }
            System.out.println("Click ENTER to terminate...");
            scanner.nextLine();
        }
    }
}
