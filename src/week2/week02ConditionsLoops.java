package week2;

public class week02ConditionsLoops {
	
	public static void main(String[] args) {
		
		//
		// BOOLEANS and CONDITIONALS:
		//
		
		// 1. Variable Declaration:
		//		a. Create a variable named age and assign it a value of 14
//		System.out.println("Section 1");
//		int age = 14;
		
		
		// 2. Print a Boolean Expression:
		//		a. Print the boolean expression age >= 16 to the console and note the results.
		//		a. Change the value of age to 18 and print again.
//		System.out.println("Section 2");
//		System.out.println(age>=16);
//		age = 17;
//		System.out.println(age>=16);
//		boolean hasLicense = true;
//		
				


		
		// 3. Can you drive?
		//		a. Using a conditional, print one of the following:
		//				i. "You can drive" if age is greater than or equal to 16
		//				ii. "You cannot drive" otherwise
	//	System.out.println("Section 3");
		//if (age >= 16 && hasLicense) {
		//System.out.println("You can drive");
		//}	else {
			//	System.out.println("You cannot drive");
		//}
	
		//		a. Change the value of age and rerun to see the result
	

		
		// 4. Update Solution to Question 3 as follows:
		//		a. Add a new variable called hasLicense before the conditional. done
		//		b. Change the boolean expression in the conditional to additionally 
		//				include the need for hasLicense to be true. done
		//		c. Try changing the values of age and hasLicense and note the different results.

		// 5. Milk?
		//		a. Create two new variables - costOfMilk and thirstLevel
		//		b. Create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50 
		//				or if thirstLevel is greater than 6 and prints "No Thanks" otherwise.
		//		c. Change the values and note the different results.
		//System.out.println("Section 4 and 5");
		//	double costOfMilk = 3.15;
			//int thirstLevel = 5;
		//	if (costOfMilk < 2 || thirstLevel > 6) {
			//	System.out.println("Milk Please");
		//	} else {
			//	System.out.println("No Thanks");
//}

	
		
		// 6. Cookie Distribution: 
		//			Note:  You will evenly distribute all of the cookies to the children 
		//					and as the adult you get to keep the remaining cookies for yourself.
		//
		//		a. Create two variables called numberOfCookies and numberOfChildren.
		//		b. Initialize the two variables to integer values.
		//		b. Use a conditional to print the following based on the following conditions:
		//				i. If there are 0 cookies remaining, print "Sad Face"
		//				ii. If there are less than 2 cookies, print "Yes!"
		//				iii. If there are less than 5 cookies, print "Whoohoooo!"
		//				iv. If there are 5 or more cookies, print "Jackpot!"
//	System.out.println("Section 6");
//int numberOfCookies = 31;
//int numberOfChildren = 3;

//if (numberOfCookies % numberOfChildren >5) {
//	System.out.println("Jackpot");
//	} else if (numberOfCookies % numberOfChildren > 2) { 
//		System.out.println("Woohoo");
//		} else if (numberOfCookies % numberOfChildren >0) { 
//			System.out.println("Yes!!!");
//		} else {
//		System.out.println("Sad Face");
//		}
//
				
		// 7.  Loyalty Member Program:
		//		a. Create a variable called loyaltyMemberStatus and assign the value "SILVER"
		//		b. Create a variable called loyaltyMemberDiscount and assign the value 0.0
		//		c. Using a switch, set the value of loyaltyMemberDiscount based on 
		//				the following loyaltyMemberStatus scale: 
		//				i. "SILVER" is 0.10
		//				ii. "GOLD" is 0.15
		//				iii. "PLATINUM" is 0.25
	
	//	String loyaltyMemberStatus = "SILVER";
	///	double loyaltyMemberDiscount = 0.1;
	//			switch (loyaltyMemberStatus) {
	//				case "Silver":
	//					loyaltyMemberDiscount=0.1;
	//				break;
	//				case "GOLD":
	//					loyaltyMemberDiscount=0.15;
	//				break;
	//				case "PLATINUM":
	//					loyaltyMemberDiscount=0.25;
	//					break;
						
					
	//			}
	//			System.out.println(loyaltyMemberStatus);
	//			System.out.println(loyaltyMemberDiscount);
	//	double billTotal = 650.87;
	//	double adjustedTotal = billTotal-loyaltyMemberDiscount*billTotal;
		
	//	System.out.println(adjustedTotal);

		
		// 8. Using the Loyalty Member Program variables from Question 7, do the following:
		//		a. Create a variable called billTotal and assign a value
		//		b. Create a variable called adjustedTotal and assign it the billTotal minus 
		//				the loyaltyMemberDiscount percent of the billTotal
		//		c. If the adjustedBillTotal is greater than $500 upgrade the 
		//				loyaltyMemberStatus from SILVER to GOLD or from GOLD to PLATINUM
	
//if (adjustedTotal >= 500) {
//	if (loyaltyMemberStatus == "SILVER") {
//		loyaltyMemberStatus = "GOLD";
//	} else if (loyaltyMemberStatus == "GOLD" ) {
//		loyaltyMemberStatus = "PLATINUM";
//		
///	}
//}
//	System.out.println("New Loyalty Status: " + loyaltyMemberStatus);

		
		// 9. Login -- username & password:
		//		a. Create two variables, username and password
		//		b. Create a conditional that prints one of the following:
		//				i. "login successful" if the username is "Tommy123" and the password is "12345"
		//				ii. "access denied" otherwise
//		String username = "SKHaggerty";
//		String password = "password123";
//				
//		if (username.equals("SKHaggerty") && password.equals("password123")) {
//			System.out.println("login successful" );	
//		}else { 
//			System.out.println("access denied" );
///		}
//		break;
//		//
		// LOOPS:
		//
		
	       }
		// 10. Write a for loop that prints each number from 0 to 9

	//	for (int i = 0; i<=9; i++) {
	//		System.out.println(i);
	//	}
		
		// 11. Write a for loop that prints each number from 10 to 0 backwards

	//	for (int i=10; i>=0; i--) {
	//		System.out.println(i);
	//	}
		
		// 12. Write a for loop that prints every other number from 0 to 100

	//	for (int i=0; i<=100; i++) {
	//		if (i % 2 == 0) {
	//		System.out.println(i);	
	//		}
			
	//	}
		
		// 13. Write a for loop that iterates from 0 to 100 and prints 
		//			"EVEN" if the number is even and "ODD" if it's odd

//	for (int i=0; i<=100; i++) {
//		if (i % 2 == 0) {
//			System.out.println(i + "even");	
///		} else {
//		System.out.println(i + "odd");
//	}
	
//	}

	
	
		// 14. Write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
		//			within the loop, divide each number by 3 and print the remainder to the console.

	//	int x = 100 {
	//			
	//		while (x > 0) {
	//			System.out.println(x + " " + (x%3));
	//			x--;
	//			
	//		}
			

		
	
//break;
	
	 do {
         sumResult += numToAdd;
         howManyTimes--;
     } while (howManyTimes > 0);

     System.out.println(sumResult);
    
     
     
		if(userNumber > 10 && userNumber < 100){
    		do {
    		    System.out.println(userNumber);
    		    userNumber--;
    		} while ( userNumber >= 10 );
		    
		} else{
		    System.out.println("Your number is not a value that is more than 10 and less than 100.");
		}
    
		
		
		 if (countDown <= 10 && countDown >= 3) {
	            while (countDown >= 1) {
	                System.out.println(countDown + "...");
	                countDown--;
	            }
	        }
	        System.out.println("We have lift off!");
	  
	        
	        
	        
	        int counter = wordLength;
			do {
			    System.out.println(userWord);
			    if ( wordLength < 5 ) {
			        break;
			    } 
			    counter--;
			} while ( counter > 0 );
		
			
			
			
			 for ( int i = 0; i < userWord.length(); i++ ) {
		            longString += userWord;
		        }
		        
		        System.out.println(longString);
		  
		    }
		}
			
			