package javaprograms;

public class Programs {
	
	//To find largest and smallest numbers
	
	public static void main(String[] args) {
		int a []= {50,20,40,30,10};
		
		for (int i =0;i<a.length; i++) {//i=0
			for(int j=i+1;j<a.length;j++) {//j=1
				if (a[i]>a[j]) {
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
					
				}
			}
			System.out.println(a[i]);
		}
		for (int x: a) {
			
		}
	}

}
