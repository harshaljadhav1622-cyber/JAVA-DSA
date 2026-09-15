class TotalSubArr{
	public static void main(String [] args){
		int arr [] = {1,2,3,4};
		int total = 0;
		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
				for(int k=i; k<=j; k++){
					continue;
				}
				total++;
			}
		}
		System.out.println("Total sub arrays are : "+total);
	}
}