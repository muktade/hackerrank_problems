package test.hacker.basicjava.md5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solve {
    public static String MD5(String ab) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(ab.getBytes(StandardCharsets.UTF_8), 0, ab.length());
        return new BigInteger(1, md.digest()).toString(16);
    }

    public static String Decrypt(String md5) throws IOException {
        String code = "MD5";
        URL md5Online = new URL("https://www.md5online.org/api.php?d=1&p=" + code + "&h=" + md5);
        BufferedReader in = new BufferedReader(new InputStreamReader(md5Online.openStream()));
        String result = "";
        String inputLine;
        while ((inputLine=in.readLine())!=null){
            result =result+inputLine;
        }
        in.close();
        return result;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        Scanner sc = new Scanner(System.in);
        String r = MD5(sc.next());
        System.out.println(r);
        System.out.println("----------------------");
        System.out.println(Decrypt(r));
    }
}
