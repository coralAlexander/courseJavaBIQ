package memory;

import jmm.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GCExample {

    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(runner(), 1, 10, TimeUnit.SECONDS);
    }

    private static Runnable runner() {
        return new Runnable() {
            private int count = 0;

            @Override
            public void run() {
                long startTime = Utils.now();
                final List<StringBox> messages = new ArrayList<>();
                for (int i = 0; i < 10_000_000; i++) {
                    StringBox sb = new StringBox("prefix_" + i);
                    messages.add(sb);
                }
                System.out.println("count = " + count + ". Took: " + Utils.elapsedFrom(startTime));
                if (++count == 1000) {
                    System.exit(0);
                }
            }
        };
    }
}
