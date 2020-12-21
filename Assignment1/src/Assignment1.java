import java.util.*;
public class Assignment1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System .in);
		
		System.out.print("Enter your name : ");
		String name = input.nextLine();
		
		System.out.print("Enter your IC : ");
		String IC = input.nextLine();
		
		System.out.print("Enter your No. H/P : ");
		String hp = input.next();
		
		String brandA = "Faber Castle";
		String typeA = "ballpoint pen";
		String colourA = "Blue, Black, Red";
		String widthsA = "0.5mm & 0.7mm";
		String priceA = "RM1.31 / pcs";
		
		System.out.println("The brand of product: " + brandA);
		System.out.println("The type of product: " + typeA);
		System.out.println("The colour of product: " + colourA);
		System.out.println("The witdh of product: " + widthsA);
		System.out.println("The price of product: " + priceA);
		System.out.println();
		
		String brandB = "Pilot G2";
		String typeB = "gel ball pen";
		String colourB = "Blue, Black, Red";
		String widthsB = "0.5mm & 0.7mm & 1.0mm";
		String priceB = "RM3.40 / pcs";
		
		System.out.println("The brand of product: " + brandB);
		System.out.println("The type of product: " + typeB);
		System.out.println("The colour of product: " + colourB);
		System.out.println("The witdh of product: " + widthsB);
		System.out.println("The price of product: " + priceB);
		System.out.println();
		
		String brandC = "Zhi Xin";
		String typeC = "gel ink pen";
		String colourC = "Blue, Black, Red";
		String widthsC = "0.7mm";
		String priceC = "RM 0.80 / pcs";
		
		System.out.println("The brand of product: " + brandC);
		System.out.println("The type of product: " + typeC);
		System.out.println("The colour of product: " + colourC);
		System.out.println("The witdh of product: " + widthsC);
		System.out.println("The price of product: " + priceC);
		System.out.println();
		
		System.out.print("Enter brand of first item: ");
		int branditem1 = input.nextInt();
		System.out.print("Enter price of first item: RM");
		int priceitem1 = input.nextInt();
		System.out.print("Enter colour of first item: ");
		int colouritem1 = input.nextInt();
		System.out.print("Enter quantity of first item: ");
		int qtyitem1 = input.nextInt();
		System.out.println();
		
		System.out.print("Enter brand of sec item: ");
		int branditem2 = input.nextInt();
		System.out.print("Enter price of sec item: RM");
		int priceitem2 = input.nextInt();
		System.out.print("Enter colour of sec item: ");
		int colouritem2 = input.nextInt();
		System.out.print("Enter quantity of sec item: ");
		int qtyitem2 = input.nextInt();
		System.out.println();
		
		System.out.print("Enter brand of third item: ");
		int branditem3 = input.nextInt();
		System.out.print("Enter price of third item: RM");
		int priceitem3 = input.nextInt();
		System.out.print("Enter colour of third item: ");
		int colouritem3 = input.nextInt();
		System.out.print("Enter quantity of third item: ");
		int qtyitem3 = input.nextInt();
		System.out.println();
		
		System.out.print("Enter brand of fourth item: ");
		int branditem4 = input.nextInt();
		System.out.print("Enter price of fourth item: RM");
		int priceitem4 = input.nextInt();
		System.out.print("Enter colour of fourth item: ");
		int colouritem4 = input.nextInt();
		System.out.print("Enter quantity of fourth item: ");
		int qtyitem4 = input.nextInt();
		System.out.println();
		
		System.out.print("Enter brand of fifth item: ");
		int branditem5 = input.nextInt();
		System.out.print("Enter price of fifth item: RM");
		int priceitem5 = input.nextInt();
		System.out.print("Enter colour of fifth item: ");
		int colouritem5 = input.nextInt();
		System.out.print("Enter quantity of fifth item: ");
		int qtyitem5 = input.nextInt();
		System.out.println();
		
		int ttlpriceitem1 = priceitem1 * qtyitem1;
		int ttlpriceitem2 = priceitem2 * qtyitem2;
		int ttlpriceitem3 = priceitem3 * qtyitem3;
		int ttlpriceitem4 = priceitem4 * qtyitem4;
		int ttlpriceitem5 = priceitem5 * qtyitem5;
		double ttlprice5items = ttlpriceitem1 + ttlpriceitem2 + ttlpriceitem3 + ttlpriceitem4 + ttlpriceitem5;
		
		double discount = 0;
		if(ttlprice5items >= 50) {
			discount =  ttlprice5items * 10/100;
		}
		
		else if(ttlprice5items < 50) {
			discount = ttlprice5items * 5/100;
		}
		
		System.out.println("Name :" + name);
		System.out.println("NO. IC :" + IC);
		System.out.println("H/P : " + hp);
		System.out.println("Total price : RM" + ttlprice5items);
		System.out.println("Discount received: RM" + discount);
		System.out.println("Price to be paid: RM" + (ttlprice5items - discount ));
		System.out.println();
	}
}

