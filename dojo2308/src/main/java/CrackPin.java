import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CrackPin {
    public static void main(String[] args) {
        CrackPin crackPin = new CrackPin();
        System.out.println(crackPin.crack("827ccb0eea8a706c4c34a16891f84e7b"));
    }

    public String crack(String hash) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            sb.append(i);
            for (int j = 0; j < 10; j++) {
                sb.append(j);
                for (int k = 0; k < 10; k++) {
                    sb.append(k);
                    for (int l = 0; l < 10; l++) {
                        sb.append(l);
                        for (int m = 0; m < 10; m++) {
                            sb.append(m);
                            String passHash = getMd5(sb.toString());
                            if (hash.equals(passHash)) {
                                return sb.toString();
                            } else {
                                sb.deleteCharAt(4);
                            }
                        }
                        sb.deleteCharAt(3);
                    }
                    sb.deleteCharAt(2);
                }
                sb.deleteCharAt(1);
            }
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    // GeeksForGeeks method
    public static String getMd5(String input) {
        try {
            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            // digest() method is called to calculate message digest
            //  of an input digest() return array of byte
            byte[] messageDigest = md.digest(input.getBytes());
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
