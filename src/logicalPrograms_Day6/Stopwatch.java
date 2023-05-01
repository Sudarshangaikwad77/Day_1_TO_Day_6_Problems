package logicalPrograms_Day6;
import java.util.Scanner;
public class Stopwatch
{
    private long startTime;
    private long endTime;
    private boolean running;

    public void start() {
        if (!running) {
            startTime = System.currentTimeMillis();
            System.out.println("Stopwatch started.");
            running = true;
        } else {
            System.out.println("Stopwatch is already running.");
        }
    }

    public void stop() {
        if (running) {
            endTime = System.currentTimeMillis();
            System.out.println("Stopwatch stopped.");
            running = false;
        } else {
            System.out.println("Stopwatch is not running.");
        }
    }

    public void printElapsedTime() {
        if (!running) {
            long elapsedTime = endTime - startTime;
            System.out.println("Elapsed time: " + elapsedTime + " milliseconds.");
        } else {
            System.out.println("Stopwatch is still running. Please stop it to get the elapsed time.");
        }
    }

    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("1. Start");
            System.out.println("2. Stop");
            System.out.println("3. Print Elapsed Time");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    stopwatch.start();
                    break;
                case 2:
                    stopwatch.stop();
                    break;
                case 3:
                    stopwatch.printElapsedTime();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}

