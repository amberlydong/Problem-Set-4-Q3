public class SetFourProblemThree {
    public static void main(String[] args){
        int sum = 0;
        int number = 0;
        int posInt = 99999;
       for (int num = 99999; num >= 10000; num --)
       {
        String digit = String.valueOf(num);
        for(int digits = 0; digits < 5; digits ++)
        {
            sum += Character.getNumericValue(digit.charAt(digits));
        }
        if (num % sum == 0)
        {
            if (posInt > num / sum)
            {
                posInt = num / sum;
                number = num;
            }
            
        }
        sum = 0;
       }
       
       System.out.println("num: " + number);
       System.out.println("smallest: " + posInt);
    }
    
}
