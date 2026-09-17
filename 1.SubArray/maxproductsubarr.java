class MaxProduct{
	public static void main(String [] args){
		int arr [] = {2, 3, -2, 4};
		int max = arr[0];
		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
				int product = 1;
				for(int k=i; k<=j; k++){
					product *= arr[k];
				}
				if(product > max){
					max = product;
				}
			}
		}
		System.out.println(max);	
	}
}