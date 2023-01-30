public class ClaseCapicua {
    public static void main (String[] args) {
        int n =55;
        System.out.println(esCapicua(n)); 

   
        public static boolean esCapicua(int x) {
    
            boolean capicua = false;

            if (n<10) 
		        {capicua = true;}
		
		    if ((n>=10) && (n<100))
	        	{if ((n /10) == (n%10))
		    	{capicua = true;}
	        	}
		
		        if ((n>=100) && (n<1000))
		         {if ((n/100) == (n%10))
			        {capicua =true;}
		        }
		
		       if ((n>=1000) && (n<10000))
		         {if (((n/1000) ==(n%10)) && (((n/100)%10) == ((n/10)%10)))
		    	{capicua =true;}
		        }
		
		        if (n >=10000)
		            {if (((n/10000) == (n %10)) && ((((n/ 1000)% 10)) == ((n/ 10)% 10))) 
		        	{capicua = true;}
	            	}
		
		            if (capicua)
		    {System.out.println("El numero es capicua.");}
		
		        else 
		        {System.out.println("El numero no es capicua.");}
		
                return capicua;

	        }
    }
}

