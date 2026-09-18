class SmallestSubarr{
	public static void main(String [] args){
		int arr [] = {2, 3, 1, 2, 4, 3};
		int kth = 7;

		StringBuffer str = new StringBuffer();
		int minLen = 0;
		boolean found = false;

		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
				int sum = 0;
				StringBuffer temp = new StringBuffer();

				for(int k=i; k<=j; k++){
					temp.append(arr[k]);
					temp.append(" ");
					sum += arr[k];
				}

				int len = j - i + 1;

				if(sum >= kth && (!found || len < minLen)){
					str = temp;
					minLen = len;
					found = true;
				}
			}
		}

		System.out.println(str);
	}
}