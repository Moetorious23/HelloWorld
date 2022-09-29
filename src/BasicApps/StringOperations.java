package BasicApps;
import java.util.Scanner;
public class StringOperations {
	public static void main(String[] args) {
		
		
		Scanner in= new Scanner (System.in);
		System.out.println("Enter 0 to view menu option:");
		Double x = in.nextDouble();
	

			if (x==0) {

				System.out.println("/........... String Operations Menu................/");
				System.out.println("Press 1 for palindrom check");
				System.out.println("Press 2 to reverse a string");
				System.out.println("Press 3 to concatenate two strings");
				System.out.println("Press 4 for string comparison");
				System.out.println("Press 5 for find length of string ");
		
				
				System.out.println("Enter a value between 1-5 to use any of the above listed operations:");
				Double t = in.nextDouble();
				
				if (t == 1) {
			        String str, rev = "";
			        System.out.println("Enter a string to check if it is a palindrome");
			        str = in.next(); // scanner won't input string with nextLine()
			        int strLen = str.length();

			        for (int i = strLen - 1; i >= 0; i--) {
			          rev = rev + str.charAt(i);
			        

			        if (str.equals(rev)) {
			          System.out.println(str + " is a palindrome");
			        } else {
			          System.out.println(str + " is not a palindrome");
			        }
			        
			      System.out.println("To continue calculation Press 1 or Press any number to exit");
			     int ht= in.nextInt();
					if (ht!= 1) {
						break;
					}
				}while (true);
			}
				
		
				
	
				
				if (t==2) {
					do {
						String ty = in.nextLine();
						System.out.println("Enter first string:");
						
						String am = in.nextLine();										//USE A STRING BUFFER , it is a class that has the reverse function. 
						StringBuffer am1 = new StringBuffer(); 							// to create a new buffer string ,can be altered, remember strings themselves are immutable
						
						 am1.append(am);      //append function is used to convert string to buffer string
						 am1.reverse();
						System.out.println("reversed string is " + am1);
						
						System.out.println("To continue operation Press 1 else Press any button to exit");
						Double h= in.nextDouble();
						if (h!= 1) {
							break;
						}
					}while (true);
				}
					
					
							
					
				
				if (t==3) {
					
					do {
						String a = in.nextLine();
						System.out.println("Enter first string:");
						
						
						
						String c= in.nextLine();
						System.out.println("Enter second string:");
						
						
						String d =in.nextLine();
						System.out.println("concatenated string is " + c+d);
						
						
						
						
						System.out.println("To continue calculation Press 1 else Press any button to exit");
						Double w= in.nextDouble();
						
						if (w!= 1) {
							break;
						}
					}while (true);
				}
				
				
				if (t==4) {
					
					do {
						String s = in.nextLine();
						System.out.println("Enter first string:");
						
						
						
						String h = in.nextLine();
						System.out.println("Enter second string:");
						
						
						String answer = in.nextLine();
						int ans = h.compareTo(answer);
						System.out.println(" Answer is " + " " +  ans + "Note: the lines are equal if 0, different if any other number shows");
						
						
						
						
						System.out.println("To continue operation Press 1 else Press any button to exit");
						Double k= in.nextDouble();
						
						if (k!= 1) {
							break;
						}
					}while (true);
				}
				
						
				
				if (t==5) {
					
					do {
						String as =in.nextLine();
						System.out.println("Enter string:");
						
						
						String g =in.nextLine();
						int len = g.length();
						System.out.println("The number of characters in the string is " + len);
						
						
						
						
						System.out.println("To continue calculation Press 1 else Press any button to exit");
						Double z= in.nextDouble();
						
						if (z!= 1) {
							break;
						}
					}while (true);
				}
				
				
				
				
			
	
}
}
}





/*
 Scanner in = new Scanner(System.in);
        System.out.println("Enter 0 to view menu option:");
        Double x = in.nextDouble();

            if (x==0) {

                System.out.println("/........... String Operations Menu................/");
                System.out.println("Press 1 for palindrom check");
                System.out.println("Press 2 to reverse a string");
                System.out.println("Press 3 to concatenate two strings");
                System.out.println("Press 4 for string comparison");
                System.out.println("Press 5 for find length of string ");
            
                System.out.println("Enter a value between 1-5 to use any of the above listed operations:");
                Double t = in.nextDouble();
                    
                if(t==1) {
                    
                    String str, reverseStr = ""; 
                    System.out.println("Enter first string:");
                    str = in.nextLine();

                    int strLength = str.length();

                    for (int i = strLength - 1; i >=0; i--) {
                        reverseStr = reverseStr + str.charAt(i);
                    }

                    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
                    System.out.println(str + " is a Palindrome String.");
                    }
                    else {
                    System.out.println(str + " is not a Palindrome String.");
                    }
                }
                
                if (t==2) {
                    do {
                            String ty = in.nextLine();
                            System.out.println("Enter first string:");
                            
                            String am = in.nextLine();										//USE A STRING BUFFER , it is a class that has the reverse function. 
                            StringBuffer am1 = new StringBuffer(); 							// to create a new buffer string ,can be altered, remember strings themselves are immutable
                            
                            am1.append(am);      //append function is used to convert string to buffer string
                            am1.reverse();
                            System.out.println("reversed string is " + am1);
                            
                            System.out.println("To continue operation Press 1 else Press any button to exit");
                            Double h= in.nextDouble();
                            if (h!= 1) {
                                break;
                            }
                        }while (true);
                    }
                            
                            
                            
                        
                    
                    if (t==3) {
                        
                        do {
                            String a = in.nextLine();
                            System.out.println("Enter first string:");
                            
                            
                            
                            String c= in.nextLine();
                            System.out.println("Enter second string:");
                            
                            
                            String d =in.nextLine();
                            System.out.println("concatenated string is " + c+d);
                            
                            
                            
                            
                            System.out.println("To continue calculation Press 1 else Press any button to exit");
                            Double w= in.nextDouble();
                            
                            if (w!= 1) {
                                break;
                            }
                        }while (true);
                    }
                    
                    
                    if (t==4) {
                        
                        do {
                            String s = in.nextLine();
                            System.out.println("Enter first string:");
                            
                            
                            
                            String h = in.nextLine();
                            System.out.println("Enter second string:");
                            
                            
                            String answer = in.nextLine();
                            int ans = h.compareTo(answer);
                            System.out.println(" Answer is " + " " +  ans + "Note: the lines are equal if 0, different if any other number shows");
                            
                            
                            
                            
                            System.out.println("To continue operation Press 1 else Press any button to exit");
                            Double k= in.nextDouble();
                            
                            if (k!= 1) {
                                break;
                            }
                        }while (true);
                    }
                    
                            
                    
                    if (t==5) {
                        
                        do {
                            String as =in.nextLine();
                            System.out.println("Enter string:");
                            
                            
                            String g =in.nextLine();
                            int len = g.length();
                            System.out.println("The number of characters in the string is " + len);
                            
                            
                            
                            
                            System.out.println("To continue calculation Press 1 else Press any button to exit");
                            Double z= in.nextDouble();
                            
                            if (z!= 1) {
                                break;
                            }
                        }while (true);
                    }
                      
        }
    }
}
 */
			
/* correct answer
		int condition = 0; 
    int choice;
    Scanner scan = new Scanner(System.in);

	 do {

      System.out.println("/........... String Operations Menu................/");
      System.out.println("Press 1 for palindrom check");
      System.out.println("Press 2 to reverse a string");
      System.out.println("Press 3 to concatenate two strings");
      System.out.println("Press 4 for string comparison");
      System.out.println("Press 5 to find length of string ");

      choice = scan.nextInt();

     if (choice == 1) {
        String str, rev = "";
        System.out.println("Enter a string to check if it is a palindrome");
        str = scan.next(); // scanner won't input string with nextLine()
        int strLen = str.length();

        for (int i = strLen - 1; i >= 0; i--) {
          rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
          System.out.println(str + " is a palindrome");
        } else {
          System.out.println(str + " is not a palindrome");
        }

        System.out.println("To continue calculation Press 1 or Press any number to exit");

        condition = scan.nextInt();
     }
  
  
     if (choice==2) {
					
	    String ty = scan.nextLine();
        System.out.println("Enter first string:");

        String am = scan.nextLine();
        StringBuffer am1 = new StringBuffer();
                        
        am1.append(am);
        am1.reverse();

	    System.out.println("reversed string is " + am1);
						
	    System.out.println("To continue operation Press 1 else Press any button to exit");
                        
		condition = scan.nextInt();
    }	
				
     if (choice == 3) {

        String firstStr = scan.nextLine();
        System.out.println("Enter first string: "); 
         
         
        String secondStr = scan.nextLine();
        System.out.println("Enter second string: ");

        String thirdStr = scan.nextLine();
        String concat = firstStr + " " + secondStr;
        System.out.println("Concatenated string is: " + secondStr + thirdStr);

        System.out.println("To continue calculation please Press 1 or Press any number to exit");
        
        condition = scan.nextInt();
        
      }
		
					 

     if (choice == 4){
      
          String string1 = scan.nextLine();
          System.out.println("Enter First String: ");

          String string2 = scan.nextLine();
          System.out.println("Enter Next String: ");

          String result = scan.nextLine();
          int res = string2.compareTo(result);
          System.out.println("Result is " + " " + res); 

          System.out.println("If result = 0 (strings are equal), If result is greater then 0 (strings are not equal)");

         System.out.println("To continue operation Press 1 or else Press any button to exit");

         condition = scan.nextInt();  
          }
       

     if (choice == 5) {
         
        String strng1 = scan.nextLine();
        System.out.println("Enter string: ");

        String strng2 = scan.nextLine();
        int a= strng2.length(); 
        
        
        System.out.println("The length of this string is " +a);        
        System.out.println("To continue operation Press 1 or else Press any button to exit");

         condition = scan.nextInt();    
        }

     } while (condition == 1);
     

  
    }  
}  

 */
					
				

