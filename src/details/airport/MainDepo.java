package details.airport;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import details.AssignedBags;
import details.BagManagementImpl;
import details.Client;
import details.Size;


public class MainDepo {

	static int depo;
    public int time;
     
	
	public static void main(String[] args) {
		
		BagManagementImpl chirie = new BagManagementImpl();
		
		//Implementare CRUD:
		
		Collection<Client> passengers = new ArrayList<Client> ();
        
        System.out.println ("Welcome to the Warehouse System.");
        System.out.println ("Please enter your name: ");
        try (Scanner scanner = new Scanner (System.in);
				Scanner scannerString = new Scanner (System.in)) {
			String name = scanner.nextLine ();
			System.out.println ("Hello, " + name);

			do {
			    System.out.println ("0. Assign Bag or Bags");
			    System.out.println ("1. Store your luggage");
			    System.out.println ("2. Take your Bag/Bags safety");
			    System.out.println ("Enter your Choise : ");
			    depo = scanner.nextInt ();

			    switch (depo) {
			        case 0:
			            System.out.println ("Please enter the position (ex: 1-9A or 1-9B ) you wish to deposit you bags. Enter q to exit.");

			            AssignedBags.AssignBags ();
			            break;
			        case 1:
			            System.out.println ("Enter a access key : ");
			            int passengerID = scanner.nextInt ();
			            System.out.println ("Enter your full name : ");
			            String nameOwner = scannerString.nextLine ();
			            System.out.println ("Enter your color bag : ");
			            String bagColor = scannerString.nextLine ();
			            System.out.println ("Enter weight Bag/Kg : ");
			            int weightBag = scanner.nextInt ();
			            System.out.println ("Enter Bag type : ");
			            System.out.println (Size.small.name ());
			            System.out.println (Size.medium.name ());
			            System.out.println (Size.big.name ());

			            String sizeBage = scannerString.nextLine ();

			            // FOr enum... convert string to enum
			            Size type = Size.valueOf (sizeBage);
			            break;

			        case 2:
			            System.out.println (passengers);
			            System.out.println ("Please, put your access key : ");
			            int passID = scanner.nextInt ();
			            System.out.println ("Welcome back!");
			            System.out.println ("How long did the luggage stay? (in minutes)");
			            int Time = scanner.nextInt ();
			           chirie.chirieBagaj(Time);
			            break;
			    }
			} while (depo <= 2);
		}

    }
	


}
