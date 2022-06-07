package ejercicio06;

public class ClienteControlador {

    private Cliente cliente[];

    private int contador;

    public ClienteControlador(int size)
    {
        this.cliente = new Cliente[size];

        this.contador =  0;
    }

    public void agregar(String nombres, int dni)
    {
        this.cliente[this.contador] = new Cliente(nombres, dni);

        this.contador++;
    }

    public Cliente buscar(String nombres)
    {
        int i;

        for(i=0; i<this.contador; i++)
        {
            if(this.cliente[i].getNombres().eguals(nombres))
            {
                break;
            }
        }
        if(i == this.contador)
        {
            return null;
        } else {
            return this.cliente;
        }
    }


    public Cliente[] listar()
    {
        return this.cliente;
    }

    public void listar2()
    {
        for(int i=0; i<this.contador; i++)
        {
            System.out.println(this);[i].getNombres();
        }
    }

}
