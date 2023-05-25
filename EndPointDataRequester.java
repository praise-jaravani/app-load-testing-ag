import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

class EndPointDataRequester{

    public static void main(String[] args )throws Exception{
        Scanner input = new Scanner(System.in);

        System.out.println("HTTP Endpoint Data Retrieval!");

        loop: while (true) 
        {
            System.out.print("Enter Endpoint (e.g - http://www.example.com): ");
            String endpoint = input.next();
            System.out.print("Enter Number of Hits: ");
            int hits = input.nextInt();

            try{
             for (int index = 0; index < hits; index++){
                 long startTime = System.currentTimeMillis();
                 URL url_var = new URI(endpoint).toURL();

                 // Create HTTPURL Connection variable with open endpoint connection
                 HttpURLConnection conn = (HttpURLConnection) url_var.openConnection();

                 // Define Request headers
		         conn.setRequestMethod("GET");
                 conn.connect();

                 // Create response variables and assign responses
                 int responseCode = conn.getResponseCode();
                 long responseTime = System.currentTimeMillis() - startTime;
                 long bytesSent = conn.getContentLengthLong();

                 // Define and return output
                 String response = ("Response code = " + responseCode + "; \nResponse time = " + responseTime + "; \nResponse Bytes = " + bytesSent);
                 System.out.println("********************");
                 System.out.println(response);
                 System.out.println("********************");
                } 
            } catch (Exception nameOfException){
                System.out.println(nameOfException);
            }
            
            // Termination Condition
            System.out.print("Would you like to quit (yes,y/no,n): ");
            String options = input.next();
            
            if (options.toLowerCase().equals("yes") || options.toLowerCase().equals("y")){
                break loop;
            }
        }

    System.exit(0);
    }
};