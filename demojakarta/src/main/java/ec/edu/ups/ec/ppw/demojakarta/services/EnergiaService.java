package ec.edu.ups.ec.ppw.demojakarta.services;


import ec.edu.ups.ec.ppw.demojakarta.model.Cliente;
import jakarta.ejb.Stateless;

@Stateless
public class EnergiaService {
	
	 public Cliente getUserData() {
	        
	        Cliente cliente = new Cliente();
	        cliente.setCedula("1234567891");
	        cliente.setNombre("Juan Perez");
	        cliente.setDireccion("Ricaurte");
	        cliente.setConsumo("1234.56");
	        cliente.setDebt("789.00");
	        return cliente;
	    }

}
