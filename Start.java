import java.util.Scanner;



public class Start{
  public static void main(String[] args) {






    System.out.println("**************");
    System.out.println("Start");
    System.out.println("Stupid Quiz");
    System.out.println("please number 1");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    Correct correct = new Correct(num);

    System.out.println("**************");

        Kaitou01 kaitou = new Kaitou01();

    for(int nowQuizNum =0; nowQuizNum<3;nowQuizNum++){

    Mondai modai = new Mondai(nowQuizNum);

    Scanner scanner2 = new Scanner(System.in);
    int a = scanner2.nextInt();




    kaitou.Kaitou(a,nowQuizNum);



  }

    System.out.println("**************");

  //  count = kaitou.count();

    if(kaitou.count() == 3){
    System.out.println("your Geneus!!");
  }else{
        System.out.println("TOTAL");
        System.out.println(kaitou.count());
        System.out.println("your Stupid");


}
  }
}

 class Correct{

  int num=0;

  public Correct(int x){

   num = x;

        if(num == 1){
          System.out.println("ok!");

        }else{
          System.out.println("false");


        }
    }



}

class Mondai{

  int nowQuizNum=0;

public Mondai(int y){

   nowQuizNum = y;

    switch(nowQuizNum){

  case 0:

  System.out.println("4+3=");

  break;

  case 1:

  System.out.println("5+3=");

  break;


  case 2:

  System.out.println("6+3=");

  break;

}
}
}


class Kaitou01{

   private int count;

  public int Kaitou(int a,int b){

        switch(b){

        case 0:
        answer(a,7);
        break;

        case 1:
        answer(a,8);
        break;

        case 2:
        answer(a,9);
        break;

      }
    return 0;}
    public void answer(int a,int ans){



      if(a == ans){
        System.out.println("true");
        this.count =this.count +1;
      }
      else{
        System.out.println("false");


      }

      }

       int count(){
        return this.count;
      }








      }
