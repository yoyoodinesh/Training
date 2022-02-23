import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class fixbugsofapplication {

	public static void main(String[] args) {
		
			
	        System.out.println("\n**************\n");
	        System.out.println("\tWelcome to product \n");
	        System.out.println("**************");
	        optionsSelection();

	    }
	    private static void optionsSelection() {
	        String[] arr = {"1. I wish to review my product",
	                "2. I wish to add my product",
	                "3. I wish to delete my product",
	                "4. I wish to sort the product",
	                "5. I wish to search for a particular product",
	                "6. Close the application"
	        };
	        int[] arr1 = {1,2,3,4,5,6};
	        int  slen = arr1.length;
	        for(int i=0; i<slen;i++){
	            System.out.println(arr[i]);
	            
	        }
	        ArrayList<Integer> arrlist = new ArrayList<Integer>();
	        ArrayList<Integer> product = new ArrayList<Integer>();
	        product.add(1000);
	        product.add(2300);
	        product.add(45000);
	        product.add(32000);
	        product.add(110);
	        product.addAll(arrlist);
	        System.out.println("\nEnter your choice:\t");
	        Scanner sc = new Scanner(System.in);
	        int  options =  sc.nextInt();
	        for(int j=1;j<=slen;j++){
	            if(options==j){
	                ArrayList<Integer>product1;
					switch (options){
	                    case 1:
	                        System.out.println("Your saved product are listed below: \n");
	                        System.out.println(product+"\n");
	                        optionsSelection();
	                        break;
	                    case 2:
	                        System.out.println("Enter the value to add your product: \n");
	                        int value = sc.nextInt();
	                        product.add(value);
	                        System.out.println("Your value is updated\n");
	                        product.addAll(arrlist);
	                        System.out.println(product+"\n");
	                        optionsSelection();

	                        break;
	                    case 3:
	                        System.out.println("You are about the delete all your product! \nConfirm again by selecting the same option...\n");
	                        int con_choice = sc.nextInt();
	                        if(con_choice==options){
	                        	product.clear();
	                            System.out.println(product+"\n");
	                            System.out.println("All your product are erased!\n");
	                        } else {
	                            System.out.println("Oops... try again!");
	                        }
	                        optionsSelection();
	                        break;
	                    case 4:
	                        sortproduct(product);
	                        optionsSelection();
	                        break;
	                    case 5:
	                        searchproducts(product);
	                        optionsSelection();
	                        break;
	                    case 6:
	                        closeApp();
	                        break;
	                    default:
	                        System.out.println("You have made an invalid choice!");
	                        break;
	                }
	            }
	        }

	    }
	    private static void closeApp() {
	        System.out.println("Closing your application... \nThank you!");
	            }
	    private static void searchproducts(ArrayList<Integer> arrayList) {
	        int leng = arrayList.size();
	        System.out.println("Enter the product you need to search:\t");
	        
	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        
	        for(int i=0;i<leng;i++) {
	        	if(arrayList.get(i)==input) {
	        		System.out.println("Found the product " + input + " at " + i + " position");
	        	}
	        }
	    }
	    private static void sortproduct(ArrayList<Integer> arrayList) {
	        int arrlength =  arrayList.size();
	       
	        
	        Collections.sort(arrayList);
	        System.out.println("Sorted product: ");
	        for(Integer i: arrayList) {
	        	System.out.print(i + " ");
	        }
	        
	        System.out.println("\n");
	       
	    }
	


	}
