import java.util.*;
public class EmailValidate{
	public static void main(String[] args) {
				System.out.println("Enter the email to search: ");
				Scanner scan = new Scanner(System.in);
				String name = scan.next(); 
				ArrayList <String> list = new ArrayList<String>();
				list.add("dinesh@gmail.com");
			    list.add("lakshmi@gmail.com");
			    list.add("ramya@domain.com");
			    list.add("vamsi@domain.com");
			    list.add("venky@gmail.com");
			    
			    System.out.println("Search Results: ");
			    for (String element : list) {
			       if (element.contains(name)) {
			    System.out.println(element + " " + "is present in the array!");
			              }  
			        }
			    scan.close();
			     }
			}

