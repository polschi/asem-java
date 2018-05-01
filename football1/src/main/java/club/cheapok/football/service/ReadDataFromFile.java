package club.cheapok.football.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ReadDataFromFile {
    public static void main(String[] args) {
        URL resource = ClassLoader.getSystemClassLoader().getResource("");
//        readMyStream(resource);
//        readMyStream(ClassLoader.getSystemResource("text/someText.txt"));
        URL resource1 = ReadDataFromFile.class.getResource("");
        readMyStream(resource1);

    }

    private static void readMyStream(final URL resource) {

        try (InputStream inputStream = resource.openStream();) {
            int readInfo;
            while ((readInfo = inputStream.read()) != -1) {
                System.out.print((char) readInfo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
