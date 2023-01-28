package test.hacker.basicjava.sha_256;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solve {

    public static String SHA_256(String st) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(st.getBytes(StandardCharsets.UTF_8),0, st.length());
//        return new BigInteger(1,md.digest()).toString(16);
        String ans= "";
        for (byte i: md.digest()) {
            ans=ans+ String.format("%02x",i);
        }
        return ans;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        final String x = SHA_256(sc.next());
        System.out.println(x);
        String mc=sc.next();
        sc.close();
        System.out.println(x.matches(mc));
    }
}
