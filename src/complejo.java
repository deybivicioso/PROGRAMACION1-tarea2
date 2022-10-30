import java.util.Scanner;

public class complejo {
    private int real;
    private int imaginario;
    private int real1;
    private int imaginario1;
    private int resultadoR;
    private int resultadoI;
    private int resultadoF;
    private int resultadoF1;
    private int resultadoF2;
    private int resultadoF3;
    private int resultadoF4;

    public complejo() {
        real = 0;
        imaginario = 0;
        real1 = 0;
        imaginario1 = 0;
    }

    public complejo(int real, int imaginario, int real1, int imaginario1) {
        this.real = real;
        this.imaginario = imaginario;
        this.real1 = real1;
        this.imaginario1 = imaginario1;
    }

    public void sumaComplejo() {// setter del metodo sumacomplejo
        this.real = real;
        this.imaginario = imaginario;
        this.real1 = real1;
        this.imaginario1 = imaginario1;
    }

    public String sumacomplejo1() {// getter del metodo sumaComplejo
        Scanner delivery = new Scanner(System.in);
        System.out.println("ingresa un numero");
        this.real = delivery.nextInt();
        System.out.println("ingresa un numero");
        delivery = new Scanner(System.in);
        this.imaginario = delivery.nextInt();
        System.out.println("ingresa un numero");
        delivery = new Scanner(System.in);
        this.real1 = delivery.nextInt();
        System.out.println("ingresa un numero");
        delivery = new Scanner(System.in);
        this.imaginario1 = delivery.nextInt();
        resultadoR = this.real + this.real1;
        resultadoI = this.imaginario + this.imaginario1;
        return "el resultado es: " + resultadoR + "+" + resultadoI + "i";
    }

    public void restaComplejo() {// setter del metodo restacomplejo
        this.real = real;
        this.imaginario = imaginario;
        this.real1 = real1;
        this.imaginario1 = imaginario1;
    }

    public String restacomplejo1() {// getter del metodo restaComplejo
        Scanner delivery = new Scanner(System.in);
        System.out.println("ingresa un numero");
        this.real = delivery.nextInt();
        System.out.println("ingresa un numero");
        delivery = new Scanner(System.in);
        this.imaginario = delivery.nextInt();
        System.out.println("ingresa un numero");
        delivery = new Scanner(System.in);
        this.real1 = delivery.nextInt();
        System.out.println("ingresa un numero");
        delivery = new Scanner(System.in);
        this.imaginario1 = delivery.nextInt();
        resultadoR = this.real - this.real1;
        resultadoI = this.imaginario - this.imaginario1;
        return "el resultado es: " + resultadoR + "+" + resultadoI + "i";
    }

    public void multiplicacionComplejo() {// setter del metodo multiplicacionComplejos
        this.real = real;
        this.imaginario = imaginario;
        this.real1 = real1;
        this.imaginario1 = imaginario1;
    }

    public String multiplicacionComplejo1() {// getter del metodo multiplicacionComplejo
        Scanner delivery = new Scanner(System.in);
        System.out.println("ingresa un numero");
        this.real = delivery.nextInt();
        System.out.println("ingresa un numero");
        delivery = new Scanner(System.in);
        this.imaginario = delivery.nextInt();
        System.out.println("ingresa un numero");
        delivery = new Scanner(System.in);
        this.real1 = delivery.nextInt();
        System.out.println("ingresa un numero");
        delivery = new Scanner(System.in);
        this.imaginario1 = delivery.nextInt();
        resultadoR = (this.real * this.real1);
        resultadoI = (this.real * this.imaginario1);
        resultadoF = (this.imaginario * this.real1);
        resultadoF1 = (this.imaginario * this.imaginario1);
        resultadoF2 = resultadoR - resultadoF1;// esto me dara la parte real del resultao final
        resultadoF3 = resultadoI + resultadoF;// esto me dara la parte imaginaria del resultado final
        return resultadoF2 + "+" + resultadoF3 + "i";
    }
    public void divisionacionComplejo() {// setter del metodo divisionConComplejos
        this.real = real;
        this.imaginario = imaginario;
        this.real1 = real1;
        this.imaginario1 = imaginario1;
    }
    public String divisionComplejo1() {// getter del metodo divisionComplejo
        Scanner delivery = new Scanner(System.in);
        System.out.println("ingresa un numero");
        this.real = delivery.nextInt();
        System.out.println("ingresa un numero");
        delivery = new Scanner(System.in);
        this.imaginario = delivery.nextInt();
        System.out.println("ingresa un numero");
        delivery = new Scanner(System.in);
        this.real1 = delivery.nextInt();
        System.out.println("ingresa un numero");
        delivery = new Scanner(System.in);
        this.imaginario1 = delivery.nextInt();
        resultadoR = (this.real * this.real1);
        resultadoI = (this.real * this.imaginario1);
        resultadoF = (this.imaginario * this.real1);
        resultadoF1 = (this.imaginario * this.imaginario1);
        resultadoF2 = resultadoR - resultadoF1;
        resultadoF3 = resultadoI + resultadoF;
        resultadoF4=(this.real1*this.real1)+(this.imaginario1*this.imaginario1);
        return resultadoF2 +"/"+resultadoF4+ "+" + resultadoF3 +"/"+resultadoF4+ "i";
         }



}
