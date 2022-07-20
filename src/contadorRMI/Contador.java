package contadorRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Contador extends UnicastRemoteObject implements Counter{
	private int contador;
	
	public Contador(int valorInicial) throws RemoteException{
		this.contador = valorInicial;
	}
	
	public int getValue() {
		return this.contador;
	}
	
	public int nextValue() {
		return this.contador = this.contador+1;
	}
}
