class LongestWithK{
	public static void main(String [] args){
		int arr [] = {10, 5, 2, 7, 1, 9};
		int target = 15;
		StringBuffer temp = new StringBuffer("");
		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){ 
				int sum = 0;
				StringBuffer str = new StringBuffer("");
				for(int k=i; k<=j; k++){
					sum += arr[k];
					str.append(arr[k]);
				}
				if(str.length() > temp.length() && sum==target){
					temp = str;
				}
			}
		}
		System.out.println(temp);
	}
}