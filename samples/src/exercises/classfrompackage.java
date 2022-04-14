package exercises;
import java.util.*;
public class classfrompackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Secondclass sc = new Secondclass();
          Scanner s = new Scanner(System.in);
          System.out.println("enter a number ");
         int y = s.nextInt();
         sc.CheckEven(y);
        // y = Integer.MIN_VALUE;
         //System.out.println(Math.abs(y));
          s.close();
	}

}
