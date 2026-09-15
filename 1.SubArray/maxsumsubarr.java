class MaxSumSubArr{
	public static void main(String [] args){
		int arr [] = {2,-1,3,-2};	
		int max = 0;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				int sum = 0;
				for(int k=i; k<=j; k++){
					sum += arr[k];
				}
				if(sum > max){
					max = sum;
				}
			}
		}
		System.out.println("Maximum sum of sub array is : "+max);
	}
}