public class SetFourProblemThree {
    public static void main(String[] args){
        int sum = 0;
       for (int num = 11111; num <= 99999; num ++)
       {
        String digit = String.valueOf(num);
        for(int digits = 0; digits < 5; digits ++)
        {
            sum += Character.getNumericValue(digit.charAt(digits));
        }
        if (num % sum == 0)
        {
            //smallest = true;
            System.out.println(num);
            return;
        }
        sum = 0;
       }
    }
    
}
