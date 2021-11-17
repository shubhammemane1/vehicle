import java.time.*;
import java.util.*;

import Vehicles.*;
public class Driver {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();  
		Scanner Sc = new Scanner(System.in);
	
		if(now.getHour()>6 && now.getHour()<12) {
			System.out.println("Good Morning !!");
		}else if(now.getHour() >=12 && now.getHour()<16) {
			System.out.println("Good Afternoon !!");
		}else if(now.getHour() >=16 && now.getHour()<23) {
			System.out.println("Good Evening !!");
		}else {
			System.out.println("Good Night");
		}
		System.out.println("");
		System.out.println("================== Welcome to the ShowRoom ===============");
		
		
		outer : while(true) {
			wait(500);
			System.out.println("");
			System.out.println("1. Enquiry");
			System.out.println("2. Contact Us");
			System.out.println("3. About Us");
			wait(500);
			System.out.print("Enter Your Choice :-");
			int menu = Sc.nextInt();
			switch (menu) {
			case 1:
				inner : while(true){
					wait(1000);
					System.out.println("");
					System.out.println("1. 2 Wheelers");
					System.out.println("2. 3 Wheelers");
					System.out.println("3. 4 Wheelers");
					System.out.println("4. 6 Wheelers");
					System.out.println("5. Exit");
					System.out.print("Enter Your Choice :-");
					int subMenu = Sc.nextInt();
					
					switch (subMenu) {
					case 1:
						wait(500);
						System.out.println("1. Cycle");
						System.out.println("2. Bike");
						wait(500);
						System.out.print("Enter Your Choice :-");
						int choice = Sc.nextInt();
						
						switch(choice)//main switch
						{
							case 1: Cycle c1 = new Cycle(100,"Atlas","Red",4000,50);
								c1.displayInfo();
//								System.out.println("Engine cc:"+c1.cc);
								break;
							case 2:Bike tv1 = new Bike(100,"Thunder","Black",150000,350);
							tv1.displayInfo();
							Bike tv2 = new Bike(200,"R15","Green",125000,320);
							tv2.displayInfo();
							Bike tv3 = new Bike(300,"Bullet","Grey",170000,300);
							tv3.displayInfo();
							Bike tv4 = new Bike(400,"KTM","R20",130000,250);
							tv4.displayInfo();
							
//							wait(100);
							break ;
						}
						break;
					case 2:
						Auto tv1 = new Auto(234,"Bajaj","Yellow-Black",150000,30);
						tv1.displayInfo();
						break;
					case 3:
						wait(500);
						System.out.println("1. Disel");
						System.out.println("2. Petrol");
						System.out.println("3. Electrical");
						wait(500);
						System.out.print("Enter Your Choice :-");
						int choice1 = Sc.nextInt();
						
						switch(choice1)//main switch
						{
							case 1: FourWheeler d1 = new Disel(3456,"Innova","White",1000000,6);
							d1.displayInfo();
	                        System.out.println("No. of gears:"+d1.gears);
	                        FourWheeler d2 = new Disel(2376,"Swift","Red",800000,7);
							d2.displayInfo();
	                        System.out.println("No. of gears:"+d2.gears);

	                        System.out.println("=============================");
	                        Disel d21 = (Disel)d2;
	                        d21.setDiselRate(87.32f);
	                        System.out.println("Current Disel rate: "+d21.getDiselRate()+" RS/L");
							break;
							case 2:FourWheeler p1 = new Petrol(3456,"Nano","yellow",100000,6);
	                        p1.displayInfo();
	                        System.out.println("No. of gears:"+p1.gears);
	                        System.out.println("=============================");
	                        FourWheeler p2 = new Petrol(2376,"Fortuner","Black",800000,7);
	                        p2.displayInfo();
	                        System.out.println("No. of gears:"+p2.gears);

	                        System.out.println("- - - - - - - - - - - - - - -");
	                        Petrol p21 = (Petrol)p2;
	                        p21.setPetrolRate(107.03f);
	                        System.out.println("Current Disel rate: "+p21.getPetrolRate()+" RS/L");
	                        break;
							case 3 :Electrical e1 = new Electrical(3456,"Tesla","Silver",10000000,6);
	                        e1.displayInfo();
	                        System.out.println("No. of gears:"+e1.gears);

	                        System.out.println("=============================");
	                        Electrical e11 = (Electrical)e1;
	                        e11.setElectRate(20.50f);
	                        System.out.println("Current Disel rate: "+e11.getElectRate()+" RS/U");
	                        break;
						}
						break;
//						
					case 4:
						wait(500);
						System.out.println("1. Bus");
							System.out.println("2. Truck");
							wait(500);
							System.out.print("Enter Your Choice :-");
				            choice = Sc.nextInt();
				            switch (choice) {
			                case 1: Bus b1 = new Bus(987, "Tata", "Red",2000000, 360);
			                        b1.displayInfo();
			                        System.out.println("POwer"+b1.power+"HP");
			                        System.out.println("=============================");
			                        break;

			                case 2: Truck t1 = new Truck(987, "Bharat Benz", "White",3500000, 540);
			                        t1.displayInfo();
			                        System.out.println("POwer: "+t1.power+" HP");
			                        System.out.println("=============================");
			                        break;
			            
			                default: System.out.println("Invalid Input");
			                    break;
			            }
						break ;
					case 5: System.out.println("====================================="); 
						continue outer;
						
					default: System.out.println("Invalid choice! Please make a valid choice. \n\n");
						continue inner;

					}
				}
//				break;
			case 2:System.out.println("Call Us On Whatsapp : +91 7710807968");
						
				continue outer;
						
			case 3:
				System.out.println("");
				System.out.println("");
				System.out.println("WE BRINGS TO ITS CUSTOMERS INTERNATIONAL STANDARDS OF SALES & SERVICES ACROSS EACH OF THE BRANDS WE REPRESENT.\nWE COMMENCED OPERATIONS IN NOVEMBER 2021. SINCE THEN WE HAVE INVESTED SUBSTANTIAL AMOUNTS IN ESTABLISHING BEST IN CLASS FACILITIES ACROSS THE BREADTH OF OUR OPERATIONS.");
				System.out.println("");
				System.out.println("");
				wait(1500);
				continue outer;

			default:System.out.println("Please select Valid Number");
			continue outer;
			}
		}
	}
	
	public static void wait(int ms)
	{
	    try
	    {
	        Thread.sleep(ms);
	    }
	    catch(InterruptedException ex)
	    {
	        Thread.currentThread().interrupt();
	    }
	}
}
