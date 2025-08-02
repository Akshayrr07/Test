import java.io.*;
import java.util.*;

public class BuggedStudentProcessor {
    public static void main(String[] args) {
        try {
            List<String> lines = readFile("students.txt");
            List<Student> students = parseData(lines);
            capitalizeNames(students);
            double avg = calculateAverage(students);
            Student topper = findTopper(students);
            saveSummary("summary.txt", students, avg, topper);
            System.out.println("Processing finished.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static List<String> readFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null)
            lines.add(line);
        reader.close();
        return lines;
    }

    static List<Student> parseData(List<String> lines) {
        List<Student> students = new ArrayList<>();
        for (String line : lines) {
            String[] parts = line.split(",");
            if (parts.length != 3)
                continue;
            String name = parts[0];
            int age = Integer.parseInt(parts[1]); // ❌ May fail
            double score = Double.parseDouble(parts[2]); // ❌ May fail
            students.add(new Student(name, age, score));
        }
        return students;
    }

    static void capitalizeNames(List<Student> list) {
        for (Student s : list) {
            s.name.toUpperCase(); // ❌ Doesn’t modify in place
        }
    }

    static double calculateAverage(List<Student> list) {
        double total = 0;
        for (Student s : list)
            total += s.score;
        return total / list.size(); // ❌ May throw divide-by-zero
    }

    static Student findTopper(List<Student> list) {
        Student top = null;
        for (Student s : list) {
            if (s.score > top.score)  // ❌ top may be null
                top = s;
        }
        return top;
    }

    static void saveSummary(String file, List<Student> list, double avg, Student top) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write("Student Summary\n");
        writer.write("------------------\n");
        for (Student s : list)
            writer.write(s.name + " | Age: " + s.age + " | Score: " + s.score + "\n");
        writer.write("\nAverage Score: " + avg + "\n");
        writer.write("Topper: " + top.name + " with " + top.score + "\n");
        writer.close();
    }
}

class Student {
    String name;
    int age;
    double score;

    Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
