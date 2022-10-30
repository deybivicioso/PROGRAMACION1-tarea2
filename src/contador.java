import java.util.Scanner;

public class contador {
    private int num;
    public contador(){ //constructor por defecto
        num=0;
    }
    public contador(int num){ //constructor por parametros
        this.num=num;
    }
    public void contador(){//setter del metodo contador
        this.num=num;
    }
    public String contador1(){ //getter del metodo contador,incrementa la variable this.num
        this.num=num;
        for (int i=0;i<10;i++){
          System.out.println(this.num++);
        }
       return "este fue el incremento de la propiedad this.num";
    }
    public void decrementador(){//setter del metodo decrementador
        this.num=num;
    }
    public String decrementador1(){ //getter del metodo decrementaor,decrementa la variable this.num
        this.num=num;
        System.out.println("la variable "+this.num+" sera decrementada");
        for (int i=0;i<10;i++){
          System.out.println(this.num--);
        }
       return "este fue el decremento de la propiedad this.num";
    }

}
