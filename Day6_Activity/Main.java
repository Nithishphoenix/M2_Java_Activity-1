import java.io.*;
import java.lang.*;
import java.util.*;
  
// Class 1
// A class to represent a student.
class Player {
    int runs;
    String name;
  
    // Constructor
    public Player(int runs, String name)
    {
        // This keyword refers to current object itself
        this.runs = runs;
        this.name = name;
        
    }
  
    // Used to print student details in main()
    public String toString()
    {
        return this.runs + " " + this.name;
    }
}
  
// Class 2
// Helper class extending Compatator interface
class Sortbyrun implements Comparator<Player> {
    // Used for sorting in ascending order of
    // RUNS
    public int compare(Player a, Player b)
    {
        return a.runs - b.runs;
    }
}
  
// Class 3
// Main class
class Main {
  
    // Main driver method
    public static void main(String[] args)
    {
        Player[] arr
            = { new Player(400, "virat"),
                new Player(352, "rohit"),
                new Player(200, "dhoni") };
  
        System.out.println("Unsorted");
  
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
  
        // Sorting on basic as per class 1 created
        // (user-defined)
        Arrays.sort(arr, new Sortbyrun());
  
        System.out.println("\nSorted by runs");
  
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}