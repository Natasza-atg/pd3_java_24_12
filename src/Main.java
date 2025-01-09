import java.io.*;
public class Main {
        public static void main(String[] args) {
            String inputFile = "input.txt";
            String outputFile = "output.txt";

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    line = line.replace(" ", "-");
                    writer.write(line);
                    writer.newLine();
                }

                System.out.println("Zamiana się udała");
            } catch (IOException e) {
                System.err.println("Wystąpił błąd podczas kopiowania pliku: " + e.getMessage());
            }
        }
}