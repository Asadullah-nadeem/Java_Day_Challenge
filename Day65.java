import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Day65 {

    public static void main(String[] args) throws Exception, UnknownHostException {
        System.out.println("\n" +
                " .----------------.  .----------------.  .----------------.  .----------------.  .----------------. \n" +
                "| .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |\n" +
                "| |  ____  ____  | || |  _________   | || |  _________   | || |   ______     | || |    _______   | |\n" +
                "| | |_   ||   _| | || | |  _   _  |  | || | |  _   _  |  | || |  |_   __ \\   | || |   /  ___  |  | |\n" +
                "| |   | |__| |   | || | |_/ | | \\_|  | || | |_/ | | \\_|  | || |    | |__) |  | || |  |  (__ \\_|  | |\n" +
                "| |   |  __  |   | || |     | |      | || |     | |      | || |    |  ___/   | || |   '.___`-.   | |\n" +
                "| |  _| |  | |_  | || |    _| |_     | || |    _| |_     | || |   _| |_      | || |  |`\\____) |  | |\n" +
                "| | |____||____| | || |   |_____|    | || |   |_____|    | || |  |_____|     | || |  |_______.'  | |\n" +
                "| |              | || |              | || |              | || |              | || |              | |\n" +
                "| '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |\n" +
                " '----------------'  '----------------'  '----------------'  '----------------'  '----------------' \n");
        System.out.println("\n" +
                "167 162 151 164 145  165 162 154");
        System.out.println("Print Url/HTTPs");
        Scanner a = new Scanner(System.in);
        String pp = a.nextLine();
        URL fdhg = new URL(pp);

        System.out.println("Protocol: " + fdhg.getProtocol());
        System.out.println("Port: " + fdhg.getPort());
        System.out.println("Host: " + fdhg.getHost());
        System.out.println("File: " + fdhg.getFile());
        System.out.println("Exe: " + fdhg.toExternalForm());
        HttpURLConnection hpcon = (HttpURLConnection) fdhg.openConnection();
        System.out.println(
                "Request method is " +
                        hpcon.getRequestMethod());
        System.out.println("Response Code is " +
                hpcon.getResponseCode());
        System.out.println("Response Message is " +
                hpcon.getResponseMessage());
        Map<String, List<String>>hdrMap = hpcon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("Here is the header");
        for (String k : hdrField){
            System.out.println("Key: " + k +
                    " Value: " + hdrMap.get(k));
        }

    }
}