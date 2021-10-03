import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("data.txt");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(file));
        String data = buffer.readLine();
        System.out.println(data);
//        Scanner scanner = new Scanner(file);
//        try {
//            while (scanner.hasNextLine()) {
//                System.out.println(scanner.nextLine());
//            }
//        } finally {
//            try {
//                scanner.close();
//                file.close();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }

        FileOutputStream out = new FileOutputStream("newData.txt");
        out.write(data.getBytes(StandardCharsets.UTF_8));
        out.close();
        System.out.println("success!!!");

    }

}
