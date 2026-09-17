class Equal0and1{
	public static void main(String [] args){
		int arr [] = {0, 0, 1, 0, 0, 0, 1, 1};
		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
				int zero = 0;
				int one = 0;
				StringBuffer str = new StringBuffer();
				for(int k=i; k<=j; k++){
					if(arr[k]==0){
						zero++;
					}else{
						one++;
					}
					str.append(arr[k]);
				}
				if(zero==one){
					System.out.println(str);
				}
			}
		}
	}
}