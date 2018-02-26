import java.util.Scanner;

class count{
  public static void main(String[] args) {

    count();
  }

   static void count(){

   int i = 0;

   int sum =0;



   while(i<10){
     i++;


      System.out.println("PLease number 5 end");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    sum = sum + num;


    if(num == 5){
      break;
    }else if(sum == 10){
      break;
    }



    }
}

}
