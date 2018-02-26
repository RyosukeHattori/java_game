import java.util.*;


 class zyannkenn{
  public static void main(String[] args) {

    List<Player>player = new ArrayList<>();

    player.add(new Player(0,1,22,"Ryosuke"));
    player.add(new Player(1,2,21,"Mai"));

    for(int i = 0;i<2;i++){

    System.out.println("number"+i);
    System.out.println(player.get(i).P_name());
    System.out.println(player.get(i).P_sex() + "."+player.get(0).P_old()+"old");
    System.out.println("********************************");

  }
  Scanner s = new Scanner(System.in);
  System.out.print("please select Player.");
  int p_number;
  p_number = Integer.parseInt(s.next());

  System.out.println("you select==>"+player.get(p_number).P_name());

  Game game = new Game();

  for(int k=0;k<3;k++){



  Random c_sel = new Random();

  int c = c_sel.nextInt(3);

  System.out.print("select\n 0.gu,1.choki,2.per==>");
  int p_sel;
  p_sel = Integer.parseInt(s.next());

  System.out.println("CP selected==>"+c);
  System.out.println(game.select(p_sel,c));

}

System.out.println("you win total"+game.count()+"times") ;






  }
}



class Player{
  private int sex;
  private int old;
  private String name;
  private int num;

  public Player(int num,int sex,int old,String name){
    this.sex = sex;
    this.old = old;
    this.name = name;
    this.num = num;
  }

  public String P_name(){
    return this.name;
  }

  public String P_sex(){

    String male = "male";
    String female ="female";

    if(this.sex==1){
    return male;
  }else{
    return female;
  }
}

  public int P_old(){
    return this.old;
  }

  public int P_num(){
    return this.num;
  }

  }

class Game{
  private int gu =0;
  private int cho = 1;
  private int per =2;
  private String win ="win";
  private String lose ="lose";
  private String draw ="draw";
  private int count;


  public String select(int p, int c){
    if(p==c){

      return this.draw;
    }else if(p==0 && c ==1){
      this.count +=1;
      return this.win;
    }else if(p==1 && c ==2){
      this.count +=1;
      return this.win;
    }else if(p==2&&c==0){
      this.count +=1;
      return this.win;
    }else{
      return this.lose;
    }
  }

  public int count(){
    return this.count;
  }
}
