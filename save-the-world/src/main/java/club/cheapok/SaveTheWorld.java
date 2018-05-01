package club.cheapok;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SaveTheWorld {
    public static void main(String[] args) throws FileNotFoundException {
        //D:\code\java\asem-java\reallyspeacial\save-the-world\src\main\resources
        final Scanner scanner = new Scanner(new FileInputStream(new File("target/classes/valera.txt")));

        final int testCases = scanner.nextInt();

        int defence = scanner.nextInt();
        StringBuilder program = new StringBuilder(scanner.next());
        int solution = mainAlgo(program, defence);
        if (solution == -1) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(solution);
        }
    }

    public static int mainAlgo(StringBuilder program, int defence) {
        if (!isFeasible(program, defence)) {
            return -1;
        }
        int counter = 0;

        int damage = calculateDamage(program.toString());
        while (damage > defence) {
            reduceDamage(program);
            counter++;
            damage = calculateDamage(program.toString());
            if (damage <= defence) {
                return counter;
            }
        }
        return counter;
    }

    public static boolean isFeasible(StringBuilder program, int defence) {
        long count = program.chars()
                            .parallel().filter(i -> i == 'S').count();
        return defence >= count;
    }

    public static StringBuilder reduceDamage(StringBuilder program) {

        final int indexOf = program.lastIndexOf("CS");
        if (indexOf > -1) {
            program.setCharAt(indexOf, 'S');
            program.setCharAt(indexOf + 1, 'C');
            return program;
        } else {
            return new StringBuilder("IMPOSSIBLE");
        }
    }

    public static int calculateDamage(String program) {
        int damage = 0;
        int charge = 1;
        for (int i = 0; i < program.length(); i++) {
            if (program.charAt(i) == 'S') {
                damage += charge;
            } else {
                charge *= 2;
            }
        }
        return damage;

    }
}
