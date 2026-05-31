package calculator_servelet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

public class calculator extends HttpServlet {

    // The 'service' method handles requests from the browser (GET or POST)
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // Get the value of 'num1' from the request and convert it from String to int
        int num1 = Integer.parseInt(request.getParameter("num1"));

        // Get the value of 'num2' from the request and convert it from String to int
        int num2 = Integer.parseInt(request.getParameter("num2"));

        // Calculate the sum of the two numbers
        int sum = num1 + num2;

        // Calculate the product (multiplication) of the two numbers
        int product = num1 * num2;

        // Get the PrintWriter object to send output back to the browser
        PrintWriter output = response.getWriter();

        // Print the sum and product results to the browser
        output.println("The Answer: " + sum + "\nThe Product: " + product);
    }
}