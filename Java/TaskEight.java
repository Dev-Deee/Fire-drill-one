public class TaskEight{
public static void main(String[]args){
 int multipleOfNumber = 1;
for(int number = 1; number <= 10; number++){
    if(number % 4 == 0)
    multipleOfNumber = number + (number * number) + (number * number * number) + (number * number * number *number) + (number * number * number * number *number);
         System.out.print(multipleOfNumber);
  }

}
}
