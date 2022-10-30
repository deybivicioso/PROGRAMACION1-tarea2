import java.util.Scanner;

import javax.tools.Diagnostic;

public class persona {
    private String nombre;
    private String apellido;
    private int edad;
    private Boolean casado;
    private String numeroDocumentoIdentidad;

    public persona() {
        nombre = "";
        apellido = "";
        edad = 0;
        casado = false;
        numeroDocumentoIdentidad = "";

    }

    // metodos para persona 1//
    public String identificacion() { // metodo getter, accion 1
        System.out.println("acciones de la persona 1");
        System.out.print("");
        nombre = "jose";
        return "tu nombre es " + nombre;
    }

    public void indetificacion(String respuestaIdentificacion, String respuestaNum) { // metodo setter, accion2

        nombre = respuestaIdentificacion;

        numeroDocumentoIdentidad = respuestaNum;
        System.out.println(" bienvenio a nestcafe CxA ");
    }

    public String indentificacion1() {// metodo getter del M.setter (indentificacion)
        return "bienvenido tu nombre es " + nombre + " y " + " tu numero de ID " + numeroDocumentoIdentidad;
    }

    public void edadRetiro() { // metodo setter,accion3
        edad = 35;

    }

    public String edadRetiro1() {// metodo getter del M.setter (edadRetiro)
        return "si tu edad es " + edad + " deberias ir al doctor mas seguido " + " ATT: recursos humano";
    }

    // metodo para la persona 2//
    public String casandra() {// getter, accion1
        System.out.println("acciones de la persona 2");
        System.out.print("");
        nombre = "mi nombre es casandra soy la secretaria de esta empresa";
        return nombre;
    }

    public String horaDeDescanso() { // getter, accion2
        System.out.println("¿tu nombre es casandra?");
        System.out.println("responde si o no ");
        Scanner delivery = new Scanner(System.in);
        nombre = delivery.nextLine();
        return "si eres casandra es hora de almozar, si no lo eres sigue trabajando";
    }

    public String matrimonio() { // getter, accion3
        System.out.println("estas casada casandra?");
        System.out.println("responde si o no");
        Scanner delivery = new Scanner(System.in);
        casado = Boolean.parseBoolean(delivery.nextLine());
        return "si estas casada en hora buena, si no estas casada sigue buscando al hombre ideal";
    }

    // metodo para la persona 3//
    
    public String javier() {// gette, accion1
        System.out.println("acciones de la persona 3");
        System.out.println("");
        nombre = "javier";
        apellido = "gonzolio";
        return nombre + apellido + " pertenece a la empresa agrimedia";
    }

    public String cargo() {// getter, accion2
        numeroDocumentoIdentidad = "00245200";
        return "tu " + numeroDocumentoIdentidad + " revela que eres un alto cargo de la empresa";
    }

    public String sueldo() {// getter,accion3
        nombre = "javier";
        apellido = "gonzolio";
        return "segun la base de datos " + nombre + "" + apellido + " tiene un sueldo neto de 175,000,000";
    }

    // metodo para la persona 4//
    public String maritza() {// getter, accion1
        System.out.println("acciones de la persona 4");
        System.out.println("");
        casado = true;
        return "¿maritza esta casada con un actor de cine? " + casado;
    }

    public String multaTrafico() {// getter, accion2
        System.out.println("¿porta su numero Documento de Identidad?");
        System.out.println("responda si o no");
        Scanner delivery = new Scanner(System.in);
        numeroDocumentoIdentidad = delivery.nextLine();
        System.out.print("si porta con su documento de indentida no sera multada");
        System.out.println("pero...");
       return "si no porta con su documento de identidad sera multada";
    }
    public String años(){//getter, accion3
        System.out.println("¿cual es su edad bella dama?");
        Scanner delivery = new Scanner(System.in);
        edad=delivery.nextInt();
        return "con esa edad "+edad +" aun se es joven para vivir";   
    }

    // metodo para la persona 5//
    public String autorizacion(){//getter, primera accion de persona5
        Scanner delivery=new Scanner(System.in);
        System.out.println("acciones de la persona 5");
        System.out.print("");
        System.out.println("¿cual es tu nombre?");
        nombre=delivery.nextLine();
        return "bienvenio"+nombre;
    }
    public String accesoPC (){//getter, seguna accion de persona5
        System.out.println("ingresa tu nombre");
        Scanner delivery=new Scanner(System.in);
        nombre=delivery.nextLine();
        System.out.println("ingresa tu apellido");
        delivery=new Scanner(System.in);
        apellido=delivery.nextLine();
        System.out.println("ingresa tu numero de documento de identidad");
        delivery=new Scanner(System.in);
        numeroDocumentoIdentidad=delivery.nextLine();
        System.out.println("su nombre de usuario es "+nombre+" y su apellido mas su numero de identidad es "+apellido+numeroDocumentoIdentidad); 
        return"feliicitaciones puede acceder a su cuenta de escritorio ";
    }
    public String divorcioSebastian(){//getter, tercera accion de persona5
        nombre="sebastian";
        numeroDocumentoIdentidad="8549";
        casado=false;
        System.out.println("señor "+nombre+" su numero de registro "+numeroDocumentoIdentidad+" indica que esta divorciado");
        return "su matrimonio es "+casado;
    }
    //metodo para persona6
    public String inicioViaje(){ //getter, primera accion de persona6
        System.out.println("acciones de la persona 6");
        System.out.println("");
        System.out.println("ingrese su nombre");
        Scanner delivery=new Scanner(System.in);
        nombre=delivery.nextLine();
        System.out.println("¿esta listo para este viaje?");
        System.out.println("responda si o no");
        delivery=new Scanner(System.in);
        nombre=delivery.nextLine();
        if (nombre=="si"){
            return "puedes iniciar tu viaje";
        }
        else{
            return "lo sentimos no puedes iniciar tu viaje";
        }        
    }
    public String contratiempo() {//getter, segunda accion de persona6
        System.out.println("¿portas tu ID?");
        System.out.println("¿si o no?");
        Scanner delivery=new Scanner(System.in);
        numeroDocumentoIdentidad=delivery.nextLine();
        while(numeroDocumentoIdentidad=="no"){
            System.out.println("debes volver a tu casa a buscar tu ID");
            System.out.println("¿ya tienes tu ID, si o no?");
            delivery=new Scanner(System.in);
            numeroDocumentoIdentidad=delivery.nextLine();     
        }
        return "ya puedes continuar con tu viajes";  
    }
    public String viajeFeliz(){//getter, tercera accion persona6
        System.out.println("¿cual es su nombre?");
        Scanner delivery=new Scanner(System.in);
        nombre=delivery.nextLine();
        System.out.println("¿cual es su ID?");
        delivery=new Scanner(System.in);
        numeroDocumentoIdentidad=delivery.nextLine();
        if (nombre=="feliz"){
            System.out.println("los voletos de avion no estan con ese nombre");
            System.out.println("si no es feliz, puede retirarse");
            System.out.println("cual es su nombre");
            delivery=new Scanner(System.in);
            nombre=delivery.nextLine();
        }
        return "usted es feliz, tenga buen viaje";
    }

    //metodo para persona7
    public String puedoVotar (){//getter, primera accion de persona7
        System.out.println("acciones de la persona 7");
        System.out.println("");
        numeroDocumentoIdentidad="89566";
        return "su ID de identidad es "+ numeroDocumentoIdentidad+ " puede votar ";
    }
    public String pareja(){//getter, segunda accion de persona7
        nombre="josefina mejia";
        edad=24;
        return nombre+" usted aun es joven tan solo tiene "+edad+" años";
    }
    public String bajoArrestro(){//getter, tercera accion de persona7
        System.out.println("ingrese su numero de ID");
        Scanner delivery=new Scanner(System.in);
        numeroDocumentoIdentidad=delivery.nextLine();
        if (numeroDocumentoIdentidad=="8956"){
            return"su ID no coincide con el que buscamos";
        }
        else{
            return"su ID coincide con el que buscamos, queda bajo arrestro";
        }
    }

}