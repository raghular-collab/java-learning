public class PrintUnique {

    public static void main(String[] args){
        String str = "programming";
        String ch = "";

        for(int i =0;i<str.length();i++){
            int count = 0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                ch = ch + str.charAt(i);
                

            }
        }
            System.out.println(ch + " ");

    }
    
}
