package github;

import java.util.*;

class in
{
	
	
	String name,address,email;
	
	public in(String name, String address, String email)
	{
		
		this.name=name;
		this.address=address;
		this.email=email;	
	}
	
}

public class phonebookApp
{
		
		static Scanner scan = new Scanner(System.in);
		
		static HashMap<Integer,in> d1 = new HashMap<Integer,in>();
	
	
	public static void insert()
	{
		
		System.out.println("Enter phone number");
		int mk=scan.nextInt();
		int ln=0;
		if(d1.containsKey(mk))
		{
			System.out.println("The Phone number is already taken");
			ln=-1;
		}
		else
		{
			 ln=mk;
		}
				
				while(ln!=-1)
				{
				System.out.println("Enter name");
				String m =scan.next();
				
				System.out.println("Enter address");
				String x=scan.next();
				
				System.out.println("Enter email");
				String y=scan.next();
				
				
				in d2 = new in(m, x, y);
				
				d1.put(ln, d2);
				System.out.println("\n Record is inserted successfully");
				break;
				}
		
	}


	public static void display()
	{
		int i=1;
		System.out.println("\n \t \t \t Contacts");
		
		for(Map.Entry<Integer, in> b : d1.entrySet())
		{		
			int a = b.getKey();
			in a2 = b.getValue();
						
			System.out.println("\n" + i+"." + " "+ a + " " + a2.name + " " + a2.address + " " + a2.email);
			i++;
		}
	}
	