import java.util.Scanner;

public class cuenta {
    private int ingreso;
    private int reintegro;
    private int transferencia;

    public cuenta() {// constructor por default
        ingreso = 0;
        reintegro = 0;
        transferencia = 0;
    }

    public cuenta(int ingreso, int reintegro, int transferencia) {
        this.ingreso = ingreso;
        this.reintegro = reintegro;
        this.transferencia = transferencia;
    }

    public void estableceIngreso(int cantidadIngreso) {// setter del metodo ingreso
        ingreso = cantidadIngreso;
    }

    public String estableceIngrso1() {//getter del metodo ingreso
        System.out.println("¿de cuanto es tu ingreso?");
        System.out.println(ingreso);
        if (ingreso > 10000) {
            return "tu ingreso es alto";
        } else {
            return "tu ingreso es algo bajo, debes buscar trabajo";
        }
    }
    public void stableceReintegro(int reintegro) {//setter del metodo estableceReintegro
        this.reintegro=reintegro;            
    }
    public String stableceReintegro1(){//getter del metodo estableceReintegro
       return "su monto es de "+ this.reintegro+" su ingreso es un monto muy alto";
    }
    public void estableceTransferencia(){//setter del metodo estableceTransferencia
        transferencia=0;
    }
    public int estableceTransferencia1(){//getter del metodo estableceTransferencia
        System.out.println("¿de cuanto es el monto de su transferencia?");
        Scanner delivery=new Scanner(System.in);
        transferencia=delivery.nextInt();
        System.out.print("tu transferencia es de "+transferencia);
        return transferencia;
    }


}
