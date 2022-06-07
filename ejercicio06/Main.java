package ejercicio06;

public class Main {

    public static void main(String[] args)
    {
        ClienteControlador clienteControlador = new ClienteControlador(3);

        //System.out.println(clienteControlador);

        clienteControlador.agregar("Isac Newton", 646548);
        clienteControlador.agregar("Jhon Von newman", 312465);
        clienteControlador.agregar("Simon Laplace", 125487);

       for(Cliente cliente: clienteControlador.listar())
       {
           System.out.println("Cliente: "+cliente);
       }

    }

}
