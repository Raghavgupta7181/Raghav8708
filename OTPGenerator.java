import java.util.Random;
import java.util.HashSet;
import java.util.Set;
public class OTPGenerator {
    public static String generate6DigitOTP(Random r){
        int num = r.nextInt(900000) + 100000; // ensures 6-digit, leading zeros avoided
        return Integer.toString(num);
    }
    public static boolean generateUniqueOTPs(int times){
        Random r = new Random();
        Set<String> set = new HashSet<>();
        for(int i=0;i<times;i++){
            String otp = generate6DigitOTP(r);
            set.add(otp);
            System.out.println("OTP "+(i+1)+": "+otp);
        }
        return set.size()==times;
    }
    public static void main(String[] args){
        System.out.println("Generating 10 OTPs and checking uniqueness:");
        boolean unique = generateUniqueOTPs(10);
        System.out.println("All unique? "+unique);
    }
}
