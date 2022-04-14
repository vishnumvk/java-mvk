package exercises;

public class Substr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="VISHNU";
		char a[] = str.toCharArray();
		/*for (int i=0;i<a.length;i++)
		System.out.println(a[i]);*/
		
		
		for (int i=1;i<=a.length;i++) {
			System.out.printf("Substrings of length %d are :\n",i);
			for (int j=0;j<a.length+1-i;j++) {
				for(int k =j;k<j+i;k++) {
					System.out.print(a[k]);
				}
				System.out.print(" ");
				
			}
			System.out.print("\n");
			
		}

	}

}
