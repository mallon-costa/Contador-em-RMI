package contadorRMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


public class Servidor implements CounterServer{

	public static Contador createCounter(int initValue) throws RemoteException {
		Contador novoContador = new Contador(initValue);
		return novoContador;
	}
	
	public static void main(String[] args) {
		try {
			Counter cont = Servidor.createCounter(10);
			String objName = "rmi://localhost/Cont";
			System.out.println("Registrando o objeto no RMIRegistry...");
			LocateRegistry.createRegistry(1099);
			Naming.rebind(objName, cont);
			System.out.println("Aguardando Clientes!");
			
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
