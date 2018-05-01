package club.cheapok.football.entity;

public class ClassA {

    public static void main(String[] args) {
        String iaka = "Hello World";
        byte[] bytes = iaka.getBytes();
        System.out.println(bytes.length);
        byte aByte = bytes[0];
        int myint =  0b11111111;
//        myint = 0xff;
//        Integer integer = new Integer(aByte & 0XFF);
        System.out.println(Integer.toBinaryString(aByte & myint));

//        System.out.println((aByte&myint));

    }
    public String coolService() {
        return "this is a cool service";

    }
}
