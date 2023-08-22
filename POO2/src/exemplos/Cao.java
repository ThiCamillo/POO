package exemplos;

public class Cao {

  String nome;
  String raca;
  double peso;

  void falar(){
    if(peso > 60) {
      System.out.println("Woof, Woof, Woof");
    }else{
      if(peso < 15){
      System.out.println("Yip, Yip, Yip");
      }else{
        System.out.println("Ruff, Ruff, Ruff");
      }
    }
  }
}
