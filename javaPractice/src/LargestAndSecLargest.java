
public class LargestAndSecLargest {

	public static void main(String[] args) {
		int[] a= {1,-2,32,-65,87,9,-3,86,-987,76};
		int max=a[0];
		int sec_max=a[0];
		int sec_small=a[0];
		int small=a[0];
		
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				sec_max=max;
				max=a[i];
			}
			else if(a[i]>sec_max) {
				sec_max=a[i];
				
				
				
			}
			else if(a[i]<small) {
				sec_small=small;
				small=a[i]
;			}
		
			
		}
		System.out.println("max value is:  "+max);
		System.out.println("sec max value is :  "+sec_max);
		System.out.println("sec small value is :  "+ sec_small);
		System.out.println("small value is :  "+small);
		

	}

}
