class SubarrgivenSum{
	public static void main(String [] args){
		int arr [] = {1, 4, 20, 3, 10, 5};
		int target = 33;
		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
				int sum = 0;
				StringBuffer str = new StringBuffer("");
				for(int k=i; k<=j; k++){
					sum += arr[k];	
					str.append(arr[k]);
					str.append(" ");
				}
				if(target == sum){	
					System.out.println(str);
				}
			}
		}
	}
}