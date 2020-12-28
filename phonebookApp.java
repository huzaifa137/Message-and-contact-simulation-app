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
	

public static void search()
	{
		
		System.out.println("\n Enter the phonenumber you need to  search");
		
			
			int hd=scan.nextInt();
			
			if(d1.containsKey(hd))
			{
				System.out.println("\n The phonenumber is present in the phonebook");
				
			}
			
			else
			{
				System.out.println("The phonenumber is not available");
			}
				
		}

public static void delete()
	{
		
		System.out.println("Enter the phone number to be deleted");
		int n=scan.nextInt();
		
		if(d1.containsKey(n))
		{
			d1.remove(n);
			System.out.println(n + " has been deleted from the phone book");
		}
		else
		{
		
		System.out.println("The desired number is not found in the phone book");
		
		}

	}


	public static void main(String[] args) {

		System.out.println("\n \t \t \t Welcome to phone book app");
			
		int ct;
		System.out.println("\n Do you want to you use phonebook app,enter YES or NO for next step");
		String nm =scan.nextLine();
			
		if(nm.equalsIgnoreCase("YES") || nm.equalsIgnoreCase("Y"))
		{
			
			do {
				System.out.println("\n \t Menu"
						+ "\n1.create a new contact"
						+ "\n2.Display list of contacts"
						+ "\n3.Search contact"
						+ "\n4.Delete contact "
						+ "\n5.exit");
				
				System.out.println("\n please make a selection from the above");
				 ct=scan.nextInt();
				 
				 switch(ct)
					{
					case 1:
						insert();
						break;
						
					case 2:
						display();
						break;
						
					case 3:
						search();
						break;
					
					case 4:
						delete();
						break;
						
					default :
						System.out.println("Thank you for using Huzaifa Technologies");
						break;
					}
			}while(ct!=5);
		}
		else
		{
			System.out.println("please select yes or 'Y 'if you need to use phone book");
			System.out.println("Thank you");
		}
	}	
			
}
	