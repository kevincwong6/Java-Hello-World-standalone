import java.lang.*;

class HelloWorld
{
    // --------------------------- get PID (long) value ------------------------
    public static long getPID() {
        return Long.parseLong(getPID_str());
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
            // thread to sleep for 10,000 milliseconds
            int sleep_time = 10000;
            System.out.println("Start sleeping for " + String.valueOf(sleep_time/1000) + " second(s)");
            System.out.println("My PID is : " + HelloWorld.getPID());
            Thread.sleep(sleep_time);

        } catch (Exception e) {
            System.out.println(e);
        }       
    }
}    