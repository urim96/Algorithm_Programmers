class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
		int a = 0;
		String[] arr = polynomial.split(" ");
		 
		    for(int i = 0; i < arr.length; i=i+2) {
			 if(arr[i].equals("x")) {
				 x++;
			 }
			 else if(arr[i].contains("x")) {
				 String[] arr2 = arr[i].split("x");
				 x = x + (Integer.parseInt(arr2[0]));
			 }else {
				a = a + Integer.parseInt(arr[i]);
			 }
		 }
		 String xx = String.valueOf(x);
		 String aa = String.valueOf(a);
		 if(x > 0 && a > 0) {
			 if(x == 1) {
				 answer = "x" + " " + "+" + " " + aa;
			 }else {
				 answer = xx + "x" + " " + "+" + " " + aa;
			 }
		 }else if(x > 0 && a <= 0) {
			 if(x == 1) {
				 answer = "x";
			 }else {
				 answer = xx + "x";
			 }
		 }else if(x <= 0 && a > 0) {
			 answer = aa;
		 }
        
        return answer;
    }
}