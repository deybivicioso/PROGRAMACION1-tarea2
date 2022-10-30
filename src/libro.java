public class libro {
    private String nombreLibro;
    private String autor;
    private int IDLibro;
    public libro(){
        nombreLibro="";
        autor="";
        IDLibro=0;
    }
    public libro(String nombreLibro,String autor, int IDLibro) {
        this.nombreLibro=nombreLibro;
        this.autor=autor;
        this.IDLibro=IDLibro;
    }
    public void prestamo(){ //setter del metodo prestamo
        this.nombreLibro=nombreLibro;
        this.autor=autor;
    }
    public String prestamo1(){//getter del metodo prestamo
        System.out.println("este libro "+this.nombreLibro);
        System.out.println("del autor "+this.autor);
        return"no esta disponible en nuestra biblioteca, vuelva mañana\n";
        
    }
    public void devolucion (){//setter del metodo devolucion
        this.nombreLibro=nombreLibro;
        this.autor=autor;
        this.IDLibro=IDLibro;
    }
    public String devolucion1(){//getter del metodo devolucion
        System.out.println("el libro "+this.nombreLibro+" con el codigo "+this.IDLibro);
        System.out.println("se encuentra en su propiedad, por favor devolverlo");
        return "si no de vuelve el libro "+this.nombreLibro+" del auto "+this.autor+" estara en problemas con la ley";
    }
    
}
