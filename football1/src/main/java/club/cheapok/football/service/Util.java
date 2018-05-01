package club.cheapok.football.service;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Util {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out, true);
//        String s = br.readLine();
//        System.out.println(s.toLowerCase());
        writer.println("NICE");

        Properties properties = new Properties();
//        FileInputStream fileInputStream = new FileInputStream("football1/src/main/resources/properties/porp.conf");
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream fileInputStream = classLoader.getResourceAsStream("properties/porp.conf");
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("dbuser"));
        System.out.println(properties.getProperty("club"));


        //Careful with the ClassLoader.getSystemResource
        System.out.println(ClassLoader.getSystemResource("properties/porp.conf").getPath().substring(1));
        Path myResourcePath = Paths.get(ClassLoader.getSystemResource("properties/porp.conf").getPath().substring(1));
//        System.out.println(myResourcePath.toString());
        BufferedReader iaka = new BufferedReader(new InputStreamReader(new FileInputStream(myResourcePath.toString())));
        System.out.println(iaka.readLine());

        System.out.println("--------------getSystemClassLoader--------------------");
        System.out.println(ClassLoader.getSystemClassLoader().getResource(""));
        System.out.println(ClassLoader.getPlatformClassLoader().getResource(""));

        System.out.println("---------- getClass---------------");
        Util util = new Util();
        System.out.println(util.getClass().getResource(""));
    }
}
