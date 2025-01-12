/*Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
Hint => 
Write a method to Generate a 6-digit OTP number using Math.random() 
Create an array to save the OTP numbers generated 10 times
Write a method to ensure that the OTP numbers generated are unique. If unique return true else return false
*/




import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

class  GeneratorOTP {
  
  
  // generateOTP creating function
    public static int generateOTP() {
        Random random = new Random();
        return 100000 + random.nextInt(900000);
    }


// areOTPsUnique creating function
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            if (!otpSet.add(otp)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       //making "sc" as Scanner class object
        Scanner sc = new Scanner(System.in);
        int[] otps = new int[10];
        
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique!");
        } else {
            System.out.println("Duplicate OTPs found!");
        }
		
		sc.close();
    }
}
