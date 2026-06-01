package test;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String str = "programming";
		char ch = ' ';
		
		for (int i=0;i<str.length();i++) {
			boolean isDuplicate = false;
			for(int j=0;j<i;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					isDuplicate = true;
					break;
				
				}
			}
			if (isDuplicate) {
				ch = str.charAt(i);
                System.out.print(ch + " ");
            }
		}

	}

}

//in this code if isDuplicate is !isDuplicate it will print unique character
//in this code if isDuplicate is isDuplicate it will print repeated character
