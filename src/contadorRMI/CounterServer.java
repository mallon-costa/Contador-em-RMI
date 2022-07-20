package contadorRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CounterServer extends Remote{
	// Cria um contador com o valor inicial especificado com parâmetro.
	// Retorna uma referencia com a qual o contador pode ser acessado remotamente.
	public static Contador createCounter(int initValue) throws RemoteException {
		return null;
	}
}
