package ec.edu.ups.ec.ppw.demojakarta.buisness;


import ec.edu.ups.ec.ppw.demojakarta.DAO.ClienteDao;
import ec.edu.ups.ec.ppw.demojakarta.model.Cliente;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;


@Startup
@Singleton
public class Inicio {
	
	@Inject
	private ClienteDao daoCliente;
	
	@PostConstruct
	public void init() {
		
		Cliente cliente = new Cliente();
		cliente.setCedula("1234567891");
		cliente.setNombre("Henry Granda");
		cliente.setDireccion("Uncovia");
		cliente.setConsumo("1000");
		cliente.setDebt("600");
		daoCliente.insert(cliente);
		
	}
	

}
