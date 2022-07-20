package contadorRMI;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class Cliente {

	public static void main(String[] args) throws Exception {
		String objName = "rmi://localhost:1099/Cont";
		Counter cont = (Counter) Naming.lookup(objName);
		//System.out.println("O novo valor do contador e:" +  cont.nextValue());
		
		for(int i = 0; i < 10; i++) {
			System.out.println(cont.nextValue());
		}
	}

}
