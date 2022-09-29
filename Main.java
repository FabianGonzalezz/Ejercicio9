public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNombre("Carlos");
        cliente.setEdad(19);
        cliente.setTelefono(135389489);
        cliente.setCredito(100);


        System.out.println("El cliente: " + cliente.getNombre() + " de " + cliente.getEdad() + " años, de telefono: " +
                cliente.getTelefono() + " tiene el siguiente credito: " + cliente.getCredito());


        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Jose");
        trabajador.setEdad(40);
        trabajador.setTelefono(62342352);
        trabajador.setSalario(600);

        System.out.println("El trabajador: " + trabajador.getNombre() + " de " + trabajador.getEdad() + " años, de telefono: " +
                trabajador.getTelefono() + " tiene el siguiente salario: " + trabajador.getSalario());


    }
}

class Persona{
    private String nombre;
    private int edad;
    private int telefono;


    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return this.telefono;
    }



}

class Cliente extends Persona{
    private int credito;

    public void setCredito(int credito){
        this.credito = credito;
    }

    public int getCredito(){
        return this.credito;
    }


}

class Trabajador extends Persona{
    private int salario;


    public void setSalario(int salario){
        this.salario = salario;
    }

    public int getSalario(){
        return this.salario;
    }


}