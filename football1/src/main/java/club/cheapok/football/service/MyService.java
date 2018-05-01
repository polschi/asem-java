package club.cheapok.football.service;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyService {
    private List<String> firstName;
    private List<String> lastName;

    public void init() throws FileNotFoundException {
        String firstName = "football1/src/main/resources/firstName.txt";
        String lastName = "football1/src/main/resources/lastName.txt";
        this.firstName = new ArrayList<>();
        this.lastName = new ArrayList<>();
        Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(firstName)));
        while (scanner.hasNext()) {
            this.firstName.add(scanner.next());
        }
        scanner.close();
        scanner = new Scanner(new BufferedInputStream(new FileInputStream(lastName)));
        while (scanner.hasNext()) {
            this.lastName.add(scanner.next());
        }
        scanner.close();

    }

    public static void main(String[] args) throws FileNotFoundException {
        MyService myService = new MyService();
        myService.init();
        myService.firstName.stream().forEach(System.out::println);
        System.out.println("Number of available processors "+Runtime.getRuntime().availableProcessors());
    }
}
