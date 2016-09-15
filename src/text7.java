public class text7 {
    public static int reverse(int x) {
        String s=x+"";
        int length = s.length();
        char[] array = s.toCharArray();
         String reverse = "";
         int r_final=0;
         if(x<0){
              for (int i = array.length - 1; i >= 1; i--){
                reverse += array[i];
            }
              try {
            	  r_final=Integer.parseInt(reverse)*-1;
            	} catch (NumberFormatException e) {
            	    e.printStackTrace();
            	}
            
         }else{
             for (int i = array.length - 1; i >= 0; i--){
            reverse += array[i];
            }
             try {
           	  r_final=Integer.parseInt(reverse);
           	} catch (NumberFormatException e) {
           	    e.printStackTrace();
           	}
         }
        return r_final;
    }
    
    
  public static void main(String arg[]){
	  int i=reverse(96463243);
	  System.out.println(i);
  }
    
   
    
}