import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Covid {
    public static void main(String[] args) throws IOException {

        // check command-line arguments
        if (args.length != 1) {
            System.out.println("Usage: java covid <filename>");
            System.exit(1);
        }

        // For file input
        String fileName;
        FileInputStream inputFileNameStream = null;
        Scanner inputFileNameScanner = null;

        // Open the input file
        inputFileNameStream = new FileInputStream(args[0]);
        inputFileNameScanner = new Scanner(inputFileNameStream); //

        // ignore first line
        inputFileNameScanner.nextLine();

        // Create a Scanner object for keyboard input
        Scanner sc = new Scanner(System.in);

        // Get the country and variant from the user
        System.out.println("Country: ");
        String country = sc.nextLine();


        // Create an ArrayList to store the COVID data
        ArrayList<COVIDData> covidList = new ArrayList<COVIDData>();

        // Read the file line by line
        while (inputFileNameScanner.hasNext()) {
            String line = inputFileNameScanner.nextLine();
            String[] parts = line.split(","); // split the string into multiple parts

            // Check if the country match
            if (parts[1].equals(country)) {
                // Date,Country/Region,Confirmed,Deaths,Recovered,Active,New cases,New deaths,New recovered,WHO Region
                // TODO: Create a new COVIDData object
                COVIDData d = new COVIDData();
                d.setDate(parts[0]);
                d.setCountry(parts[1]);
                d.setConfirmed(Integer.parseInt(parts[2]));
                d.setDeaths(Integer.parseInt(parts[3]));
                d.setRecovered(Integer.parseInt(parts[4]));
                d.setActive(Integer.parseInt(parts[5]));
                d.setNewCases(Integer.parseInt(parts[6]));
                d.setNewDeaths(Integer.parseInt(parts[7]));
                d.setNewRecovered(Integer.parseInt(parts[8]));
                d.setWhoRegion(parts[9]);
                covidList.add(d); // add the data onto the ArrayList
            }
        }
        inputFileNameStream.close(); // because I care

        // TODO: Sort the COVID data
        Collections.sort(covidList);

        // Print the COVID data
        for (COVIDData data : covidList) {
            System.out.println(data);
        }
    }
}