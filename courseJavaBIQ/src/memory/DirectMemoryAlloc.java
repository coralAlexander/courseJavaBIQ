package memory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;


class DirectMemoryAlloc {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting to allocate direct buffers...");

        while (true) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(500*1024*1024); // Allocate 500M
            Thread.sleep(10000);
//            cleanBufferForJdk8Only(byteBuffer); // Clean the buffer (will work only on J8 due to modules introduced in J>9
            Thread.sleep(10000);
        }
    }

    private static void cleanBufferForJdk8Only(ByteBuffer byteBuffer) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method cleanerMethod = byteBuffer.getClass().getMethod("cleaner");
        cleanerMethod.setAccessible(true);
        Object cleaner = cleanerMethod.invoke(byteBuffer);
        Method cleanMethod = cleaner.getClass().getMethod("clean");
        cleanMethod.setAccessible(true);
        cleanMethod.invoke(cleaner);
    }
}