import java.util.Arrays;
import java.util.Scanner;
 
// Program to validate IPv4 address in Java 8 and above
public class Main
{
    public static boolean isValidInet4Address(String ip)
    {
        
 
        try {
            
        if ( ip == null || ip.isEmpty() ) {
            return false;
        }

        String[] parts = ip.split( "\\." );
        if ( parts.length != 4 ) {
            return false;
        }

        for ( String s : parts ) {
            int i = Integer.parseInt( s );
            if ( (i < 0) || (i > 255) ) {
                return false;
            }
        }
        if ( ip.endsWith(".") ) {
            return false;
        }

        return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
 
    public static void main(String[] args)
    {
        // an IPv4 address
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter IP address ");
        final String INET4ADDRESS = sc.nextLine();
        
        String binary[]= INET4ADDRESS.split("\\.");
        
 
        // Validate an IPv4 address
        if (isValidInet4Address(INET4ADDRESS)) {
            System.out.println("The IP address " + INET4ADDRESS + " is valid");
        }
        if (isValidInet4Address(INET4ADDRESS)) {
            System.out.print("The IP address " + INET4ADDRESS + " in Binary is ");
            for (String string : binary){
                int octet = Integer.parseInt(string);
                String binaryOctet = Integer.toBinaryString(octet);
                System.out.print(binaryOctet+".");
            }
        }
        else {
            System.out.print("The IP address " + INET4ADDRESS + " isn't valid");
        }
    }
}