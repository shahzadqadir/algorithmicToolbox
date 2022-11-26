public class PrimitiveCalculator{
    public int count = 0;
    
    public int counter(int number){
        if (number <= 1) return 0;
        if (number % 5 == 0){
            number -= 1;
            count++;
        }
        if (number % 3 == 0){
            count ++;
            //number -= number/3;
            number /= 3;
        }
        else if (number % 2 == 0){
            count ++;
            //number -= number/2;
            number /= 2;
        } else {
            number -= 1;
            count++;
        }
        
        //number -= 1;
        //count++;
        System.out.println(number);
        counter(number);        
        
        return count;
    }
    
    public void test(){
        int num = 96234;
        System.out.println("Number of operations required: " + counter(num));
    }
}