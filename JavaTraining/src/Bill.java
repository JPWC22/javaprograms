import java.util.Scanner;

class Collectstring {	
	Scanner sc = new Scanner(System.in);
	String information;
	String Name() {
		System.out.println("Please enter your name: ");
		information = sc.next();
		return information;
	}	
	String Email() {
		System.out.println("Please enter your email: ");
		information = sc.next();
		return information;
	}
}
class Menuitems {
	String item;
	int price;
	int priceWqty;
	String item(int num) {
		
		if (num ==1) {	
			item = "   Coffee  ";
		}
		if (num ==2) {
			item = "   Javachip";
		}
		if (num ==3) {
			item = "   Espresso";
		}
		if (num ==4) {
			item = "   Latte   ";
		}
		return item;
	}
	int price(int num) {
		
		if (num ==1) {
			price = 20;
		}
		if (num ==2) {
			price = 50;
		}
		if (num ==3) {
			price = 40;	
		}
		if (num ==4) {
			price = 30;
			}
		return price;
	}
	int priceWqty(int itemPrice, int qty) {
		priceWqty = itemPrice * qty;
		return priceWqty;
	}
		
}

class Printing {
	
	void menu() {
		System.out.println("_____________________________________________________");
		System.out.println("1. Coffee                                   $20      ");
		System.out.println("2. Javachip                                 $50      ");
		System.out.println("3. Espresso                                 $40      ");
		System.out.println("4. Latte                                    $30      ");
		System.out.println("_____________________________________________________");
	}
	void topReceipt(String name, String email) {
		System.out.println("Name: "+ name);
		System.out.println("Email: "+ email);
		System.out.println("****************************************************************************");
		System.out.println("____________________________________________________________________________");
		System.out.printf("     *Item*       ");
		System.out.printf("    *Price*       ");
		System.out.printf("      *Qty*           ");
		System.out.println("*Subtotal*");	
	}
	void receipt(String item, int price, int qty, int subtotal) {
		System.out.println(item+"            "+price+"                  "+ qty +"                   "+subtotal);	
	}
	void bottomReceipt(int grandTotal) {
		System.out.println("____________________________________________________________________________");
		System.out.println("Grand total:                                                  " + grandTotal);
		System.out.println("____________________________________________________________________________");
		System.out.println("____________________________________________________________________________");
		System.out.println();
		System.out.println("                           Do come again!                        ");
	}
	
}

class storingArray {

	void orderCalculate() {


		
		
		
	}
	
}


public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collectstring cs = new Collectstring();
		String name = cs.Name();
		String email = cs.Email();
		Printing p = new Printing();
		p.menu();
		
		
		int i=1;
		int j=1;
		int menuitems[] = new int[5];
		int qtyNum[] = new int[5];
		int subTotal[] = new int[5];
		int grandTotal=0;
		Scanner sc = new Scanner(System.in);
		
		
		int Continue = 1;

		while (Continue == 1) {
			System.out.println("Enter order of interest:  ");
			int order = sc.nextInt();
			menuitems[i] = order;
			i++;
			System.out.println("Enter quanity of order:  ");
			int qty = sc.nextInt();
			qtyNum[j] = qty;
			j++;
			System.out.println("Do you want to order more? (y/n)  ");
			String yesno = sc.next();
			if (yesno.endsWith("n")) {
				Continue = 2;
			}

		}
		Menuitems m = new Menuitems();
		for (int k = 1; k < i; k++) {
			int price1 = m.price(menuitems[k]);
			subTotal[k] = price1*qtyNum[k];
		}
		for (int k = 1; k < i; k++) {
			grandTotal = grandTotal + subTotal[k];
		}
		
		p.topReceipt(name, email);
		
		for(int k = 1; k< i; k++) {
			String item1 =m.item(menuitems[k]);
			int price1 = m.price(menuitems[k]);
			p.receipt(item1, price1, qtyNum[k], subTotal[k]);
		}
			p.bottomReceipt(grandTotal);
		

	}

}
