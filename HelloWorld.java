import java.lang.*;

class HelloWorld
{
    // --------------------------- get PID (long) value ------------------------
    public static long getPID() {
        return Long.parseLong(getPID_str());
    }

    // --------------------------- show_memory --------------------------------
    public static void show_memory() throws Exception {
        final int mb = 1048576; // 1024*1024

        // Getting the runtime reference from system
        Runtime runtime = Runtime.getRuntime();

        System.out.println("##### Heap utilization statistics [MB] #####");

        // used memory
        System.out.println("Used  Memory:" + (runtime.totalMemory() - runtime.freeMemory()) / mb);

        // free memory
        System.out.println("Free  Memory:" + runtime.freeMemory() / mb);

        // total available memory
        System.out.println("Total Memory:" + runtime.totalMemory() / mb);

        // Maximum available memory
        System.out.println("Max   Memory:" + runtime.maxMemory() / mb);
    }

    // ------------------------- get PID (String) value ----------------------
    public static String getPID_str() {
        String processName = java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
        return processName.split("@")[0];
    }

    public static void main(String args[])
    {
        System.out.println("Hello, World");
        try {
            // thread to sleep for 1,000,000 milliseconds
            int sleep_time = 1000000;
            System.out.println("Start sleeping for " + String.valueOf(sleep_time/1000) + " second(s)");
            System.out.println("My PID is : " + HelloWorld.getPID());
            // USAGE: java -Xms2048m -Xmx4096m
            show_memory();
            Thread.sleep(sleep_time);

        } catch (Exception e) {
            System.out.println(e);
        }       
    }
}    