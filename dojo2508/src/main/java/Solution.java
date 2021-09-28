import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {
    public static String passwordCracker(String hash) {
        StringBuilder sb = new StringBuilder();
        BigInteger hashCode;
        BigInteger bigi = new BigInteger(hash, 16);
        for (int i = 'a'; i <= 'z'; i++) {
            sb.append((char) i);
            hashCode = getSHA1Binary(sb.toString());
            if ((hashCode ^ bigi) == 0)
            for (int j = 'a'; j <= 'z'; j++) {
                sb.append((char) j);
                hashCode = getSHA1Binary(sb.toString());

                for (int k = 'a'; k <= 'z'; k++) {
                    sb.append((char) k);
                    hashCode = getSHA1Binary(sb.toString());

                    for (int m = 'a'; m <= 'z'; m++) {
                        sb.append((char) m);
                        hashCode = getSHA1Binary(sb.toString());
                        for (int n = 'a'; n <= 'z'; n++) {
                            sb.append((char) n);
                            hashCode = getSHA1Binary(sb.toString());

                            sb.deleteCharAt(4);
                        }
                        sb.deleteCharAt(3);
                    }
                    sb.deleteCharAt(2);
                }
                sb.deleteCharAt(1);
            }
            sb.deleteCharAt(0);
        }
        return "";
    }
    public static String passwordCracker2(String hash) {
        StringBuilder sb = new StringBuilder();
        String hashCode;
        for (int i = 'a'; i <= 'z'; i++) {
            sb.append((char) i);
            hashCode = getSHA1(sb.toString());
            if (hashCode.equals(hash)) {
                return sb.toString();
            }
            for (int j = 'a'; j <= 'z'; j++) {
                sb.append((char) j);
                hashCode = getSHA1(sb.toString());
                if (hashCode.equals(hash)) {
                    return sb.toString();
                }
                for (int k = 'a'; k <= 'z'; k++) {
                    sb.append((char) k);
                    hashCode = getSHA1(sb.toString());
                    if (hashCode.equals(hash)) {
                        return sb.toString();
                    }
                    for (int m = 'a'; m <= 'z'; m++) {
                        sb.append((char) m);
                        hashCode = getSHA1(sb.toString());
                        if (hashCode.equals(hash)) {
                            return sb.toString();
                        }
                        for (int n = 'a'; n <= 'z'; n++) {
                            sb.append((char) n);
                            hashCode = getSHA1(sb.toString());
                            if (hashCode.equals(hash)) {
                                return sb.toString();
                            }
                            sb.deleteCharAt(4);
                        }
                        sb.deleteCharAt(3);
                    }
                    sb.deleteCharAt(2);
                }
                sb.deleteCharAt(1);
            }
            sb.deleteCharAt(0);
        }
        return "";
    }

    // GeeksForGeeks method
    public static String getSHA1(String input) {
        try {
            // getInstance() method is called with algorithm SHA-1
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            // digest() method is called
            // to calculate message digest of the input string
            // returned as array of byte
            byte[] messageDigest = md.digest(input.getBytes());
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
            // Convert message digest into hex value
            String hashtext = no.toString(16);
            // Add preceding 0s to make it 32 bit
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            // return the HashText
            return hashtext;
        }
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static BigInteger getSHA1Binary(String input) {
        try {
            // getInstance() method is called with algorithm SHA-1
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            // digest() method is called
            // to calculate message digest of the input string
            // returned as array of byte
            byte[] messageDigest = md.digest(input.getBytes());
            // Convert byte array into signum representation
            // return the HashText
            return new BigInteger(1, messageDigest);
        }
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        //System.out.println(getSHA1("code"));
        //System.out.println(passwordCracker("e6fb06210fafc02fd7479ddbed2d042cc3a5155e"));
        //System.out.println(passwordCracker("a94a8fe5ccb19ba61c4c0873d391e987982fbbd3"));
        //System.out.println(passwordCracker(getSHA1("zzzzz"))); // 25s

        //Integer.parseInt(binary, 2);
        long x = 16;
        long y = 17;
        System.out.println(x ^ y);
    }
}