import java.util.Scanner;

public class MyHotel {

	public static void main(String[] args)
	{
		int choice,ch1;
		int total=0;
		int q=0;
		char ans;
		String itemorder="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Shreyash Hotel");
		do
		{
			System.out.println("1:Starters\n2:Main Course\n3:Deserts\n4:Drink\n");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
					System.out.println("Starters:");
					System.out.println("1:French frices        40Rs.\n");
					System.out.println("2:noodles              50Rs.\n");
					System.out.println("3:Veg spring roll      60Rs.\n");
					System.out.println("4: chilli panner       70Rs.\n");
					System.out.println("4: Manchurian          80Rs.\n");
					ch1=sc.nextInt();
						switch(ch1)
						{
						case 1:
							total=total+50;
							q=q+1;
							itemorder+="French frices\n";
							break;
						case 2:
							total=total+60;
							itemorder+="noodles  \n";
							q=q+1;
							break;
						case 3:
							total=total+70;
							itemorder+="Veg spring roll\n";
							q=q+1;
							break;
						case 4:
							total=total+80;
							itemorder+="chilli panner \n";
							q=q+1;
							break;
						case 5:
							total=total+90;
							itemorder+="Manchurian \n";
							q=q+1;
							break;
						default:
							System.out.println("invalid choice ");
							break;
						}
					break;
			case 2:
				System.out.println("Main course:");
				System.out.println("1:veg thali      		120Rs.");
				System.out.println("2:non-veg thali      	130Rs.");
				System.out.println("3:special veg thali         200Rs.");
				System.out.println("4:special non-veg thali     210Rs.");
				ch1=sc.nextInt();
				switch(ch1)
				{
					case 1:
						total=total+100;
						q=q+1;
						itemorder+="veg thali\n";
						break;
					case 2:
						total=total+120;
						q=q+1;
						itemorder+="non-veg thali\n";
						break;
					case 3:
						total=total+180;
						q=q+1;
						itemorder+="spcial veg thali\n";
						break;
					case 4:
						total=total+220;
						q=q+1;
						itemorder+="special non-veg thali\n";
						break;
					default:
						System.out.println(" invalid choice ");
						break;
				}
				break;
			case 3:
				System.out.println("Deserts:");
				System.out.println("1:strawberry cake       15Rs.");
				System.out.println("2:Cupcake      	    20Rs.");
				System.out.println("3:Chocolates            40Rs.");
				System.out.println("4:Ice cream     	    80Rs.");
				ch1=sc.nextInt();
				switch(ch1)
				{
					case 1:
						total=total+40;
						q=q+1;
						itemorder+="strawberry cake\n";
						break;
					case 2:
						total=total+50;
						q=q+1;
						itemorder+="Cupcake\n";
						break;
					case 3:
						total=total+60;
						q=q+1;
						itemorder+="Chocolates\n";
						break;
					case 4:
						total=total+70;
						q=q+1;
						itemorder+="Ice cream\n";
						break;
					default:
						System.out.println("invalid choice ");
						break;
				}
				break;
			case 4:
				System.out.println("Drinks:");
				System.out.println("1:Fizz     	          30Rs.");
				System.out.println("2:mojito     	  40Rs.");
				System.out.println("3:IChill    	  20Rs.\n");
				System.out.println("4:Lemon juice         50Rs.");
				ch1=sc.nextInt();
				switch(ch1)
				{
					case 1:
						total=total+50;
						q=q+1;
						itemorder+="Mocktel\n";
						break;
					case 2:
						total=total+60;
						q=q+1;
						itemorder+="mojito\n";
						break;
					case 3:
						total=total+70;
						q=q+1;
						itemorder+="IChill\n";
						break;
					case 4:
						total=total+80;
						q=q+1;
						itemorder+="Lemon juice\n";
						break;
					default:
						System.out.println(" invalid choice");
						break;
				}
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			
			System.out.println("Do you want to add any other item Y/N\n");
			ans=sc.next().charAt(0);
		}
		while(ans=='Y'||ans=='y');
		
		System.out.println(" ------ Your Bill ------------:");
		System.out.println("Order item are:\n"+itemorder);
		System.out.println(" total Quantity is:"+q);
		System.out.println("Total amount="+total);
		System.out.println("Thanks for coming\nVisit again ");
	}

}