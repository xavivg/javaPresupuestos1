package oop;

import tools.fichero;
import tools.InputData;

public class OOP {

    private static ListaClientes misClientes;

    private static fichero OOP;

    public static void main(String[] args) {

        OOP = new fichero("oop.xml");
        misClientes = (ListaClientes) OOP.leer();

        if (misClientes == null) {
            misClientes = new ListaClientes();
        }
        int opcion;

        do {
            mostrarMenu();
            opcion = InputData.pedirEntero("Escoge una opcion");

            switch (opcion) {
                case 1:
                        altaCliente();
                    break;
            }

        } while (opcion != 0);

    }
    private static void nuevoPresupuesto(){
        String clienteNum = cadenaNoVacia("Introduce el número del cliente");
        boolean existe = misClientes.clienteExists(clienteNum);
        String concepto = cadenaNoVacia("Concepto: ");
        int precioTotal = InputData.pedirEntero("Precio Total: ");
        Cliente cliente = misClientes.getclientebytelf(clienteNum);
    }
    
    //obten cliente
    private static void altaCliente() {
        String nombre = cadenaNoVacia("Nombre: ");
        String apellidos = cadenaNoVacia("Apellidos: ");
        String telefono = cadenaNoVacia("Telefono: ");
        String respuesta;
        boolean VIP = false;
        do {
            respuesta = InputData.pedirCadena(nombre+", es cliente VIP?");
            if (respuesta.equalsIgnoreCase("SI")) {
                VIP = true;
            } else if (respuesta.equalsIgnoreCase("NO")) {
                VIP = false;
            } else {
                System.out.println("Debes responder SI o NO");
            }
        } while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));
        Cliente p = new Cliente(nombre, apellidos, telefono, VIP);
        misClientes.altaClientes(p);
        OOP.grabar(misClientes);
        System.out.println("Usuario "+nombre+" "+apellidos+" con telefono "+telefono+", ha sido creado correctamente");
    }

    private static String cadenaNoVacia(String msg) {
        String cadena;
        do {
            cadena = InputData.pedirCadena(msg);
            if (cadena.equals("")) {
                System.out.println("No se puede dejar en blanco");
            }
        } while (cadena.equals(""));
        return cadena;
    }

    private static void mostrarMenu() {
        System.out.println("*** OOP ***");
        System.out.println("1. Alta cliente");
        System.out.println("2. Nuevo presupuesto"); //buscar cliente, si existe, se le permite crear el presupuesto, sino, a la puta wey
        System.out.println("3. Presupuestos pendientes (aceptar o rechazar)");
        System.out.println("4. Listado de presupuestos de un cliente determinado");
        System.out.println("5. Listado de presupuestos rechazados");
        System.out.println("6. Listado de clientes, donde aparezca también el total de presupuestos que tiene cada una");
        System.out.println("7. Cambiar estado presupuesto");
        System.out.println("0. Salir");
    }
}
