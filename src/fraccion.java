import java.util.Scanner;

public class fraccion {
    private int numerador;
    private int denominador;
    private int numerador1;
    private int denominador1;
    private int resultado;
    private int resultado1;
    private int resultado2;

    public fraccion() {
        numerador = 1;
        denominador = 1;
        numerador1 = 1;
        denominador1 = 1;
        resultado = 0;
        resultado1 = 0;
        resultado2 = 0;
    }

    public fraccion(int numerador, int denominador, int numerador1, int denominador1) {
        this.numerador = numerador;
        this.denominador = denominador;
        this.numerador1 = numerador1;
        this.denominador1 = denominador1;
    }

    public void sumaFracciones() {// setter del metodo sumafracciones
        this.numerador = numerador;
        this.denominador = denominador;
        this.numerador1 = numerador1;
        this.denominador1 = denominador1;
    }

    public String sumaFracciones1() {// getter del metodo sumafracciones
        System.out.println("ingresa un numerador");
        Scanner delivery = new Scanner(System.in);
        this.numerador = delivery.nextInt();
        System.out.println("ingrese un denominado");
        delivery = new Scanner(System.in);
        this.denominador = delivery.nextInt();
        System.out.println("ingresa un numerador");
        delivery = new Scanner(System.in);
        this.numerador1 = delivery.nextInt();
        System.out.println("ingrese un denominado");
        delivery = new Scanner(System.in);
        this.denominador1 = delivery.nextInt();
        resultado = numerador * denominador1;
        resultado1 = denominador * numerador1;
        resultado2 = resultado + resultado1;
        resultado = denominador * denominador1;
        return resultado2 + "/" + resultado;
    }

    public void restaFracciones() {// setter del metodo restafracciones
        this.numerador = numerador;
        this.denominador = denominador;
        this.numerador1 = numerador1;
        this.denominador1 = denominador1;
    }

    public String restaFracciones1() {// setter del metodo restafracciones
        System.out.println("ingresa un numerador");
        Scanner delivery = new Scanner(System.in);
        this.numerador = delivery.nextInt();
        System.out.println("ingrese un denominado");
        delivery = new Scanner(System.in);
        this.denominador = delivery.nextInt();
        System.out.println("ingresa un numerador");
        delivery = new Scanner(System.in);
        this.numerador1 = delivery.nextInt();
        System.out.println("ingrese un denominado");
        delivery = new Scanner(System.in);
        this.denominador1 = delivery.nextInt();
        resultado = numerador * denominador1;
        resultado1 = denominador * numerador1;
        resultado2 = resultado - resultado1;
        resultado = denominador * denominador1;
        return resultado2 + "/" + resultado;

    }

    public void multiplicacionFracciones() {//settter del metodo multiplicacionFracciones
        this.numerador = numerador;
        this.denominador = denominador;
        this.numerador1 = numerador1;
        this.denominador1 = denominador1;
    }

    public String multiplicacionFracciones1() {//getter del metodo multiplicacionFracciones
        System.out.println("ingrese un numerador");
        Scanner delivery = new Scanner(System.in);
        this.numerador = delivery.nextInt();
        System.out.println("ingrese un denominador");
        delivery = new Scanner(System.in);
        this.denominador = delivery.nextInt();
        System.out.println("ingrese un numerador");
        delivery = new Scanner(System.in);
        this.numerador1 = delivery.nextInt();
        System.out.println("ingrese un denominador");
        delivery = new Scanner(System.in);
        this.denominador1=delivery.nextInt();
        resultado=numerador*numerador1;
        resultado1=denominador*denominador1;
        return resultado+"/"+resultado1;
    }
    public void divisionFracciones() {// setter del metodo divisionfracciones
        this.numerador = numerador;
        this.denominador = denominador;
        this.numerador1 = numerador1;
        this.denominador1 = denominador1;
    }
    public String divisionFracciones1() {// getter del metodo divisionfracciones
        System.out.println("ingresa un numerador");
        Scanner delivery = new Scanner(System.in);
        this.numerador = delivery.nextInt();
        System.out.println("ingrese un denominado");
        delivery = new Scanner(System.in);
        this.denominador = delivery.nextInt();
        System.out.println("ingresa un numerador");
        delivery = new Scanner(System.in);
        this.numerador1 = delivery.nextInt();
        System.out.println("ingrese un denominado");
        delivery = new Scanner(System.in);
        this.denominador1 = delivery.nextInt();
        resultado = numerador * denominador1;
        resultado1 = denominador * numerador1;
        return resultado+"/"+resultado1; 
     }  


}
