class SubarrmaxSum{
	public static void main(String [] args){
		int arr [] = {2, -1, 3, -4, 5, 2};
		StringBuffer temp = new StringBuffer("");
		int max = arr[0];
		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
				int sum = 0;
				StringBuffer str = new StringBuffer("");
				for(int k=i; k<=j; k++){
					sum += arr[k];
					str.append(arr[k]);
					str.append(" ");
				}	
				if(sum > max){
					max = sum;		
					temp = str;
				}
			}
		}
		System.out.println(temp);
	}
}