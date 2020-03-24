

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class MyClient {

	private static RMIInterface look_up;

	public static void main(String[] args) 
		throws MalformedURLException, RemoteException, NotBoundException {
		// Query to Remote Object Regsistry to get a reference to the server
		// that has the remote method
		look_up = (RMIInterface) Naming.lookup("//localhost:5000/MyServer");

		// Ask the user input into the console a message to echo
		System.out.print("Enter a message: ");
		
		// Take the input and assign it to a string variable
		String input = System.console().readLine();
			
		// Call the remote method, echo, using the reference to the
		// server obtained from the Remote Object Registry
		String response = look_up.echo(input);

        // Output the response for the remote method back to the user
		System.out.print(response + "\n");
	}

}
