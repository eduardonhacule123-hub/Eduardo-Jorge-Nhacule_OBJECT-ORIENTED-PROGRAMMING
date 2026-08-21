import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Create an ArrayList to store tasks
        ArrayList<String> tasks = new ArrayList<>();

        // ===== ADD TASKS =====
        System.out.println("===== ADD TASKS =====");

        // Task 1
        System.out.print("Enter Task 1: ");
        String task = "drink water";
        System.out.println(task);
        tasks.add(task);

        // Task 2
        System.out.print("Enter Task 2: ");
        task = "completing AI course";
        System.out.println(task);
        tasks.add(task);

        // Task 3
        System.out.print("Enter Task 3: ");
        task = "drink water again";
        System.out.println(task);
        tasks.add(task);

        // ===== DISPLAY TASKS =====
        System.out.println();
        System.out.println("===== TASK LIST =====");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        // ===== SAVE TASKS TO FILE =====
        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("tasks.txt")
            );

            for (String t : tasks) {
                writer.write(t);
                writer.newLine();
            }

            writer.close();

            System.out.println();
            System.out.println("Tasks saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }

        // ===== READ TASKS FROM FILE =====
        System.out.println();
        System.out.println("===== TASKS LOADED FROM FILE =====");

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("tasks.txt")
            );

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
