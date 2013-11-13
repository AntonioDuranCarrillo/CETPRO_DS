
package modelo;

import java.math.BigInteger;
import java.util.Set;


/**
 *
 * @author Luis_Antonio
 */
public class Modulo {
	
	private BigInteger Codigo;

	public BigInteger getCodigo() {
		// begin-user-code
		return Codigo;
		// end-user-code
	}

	public void setCodigo(BigInteger Codigo) {
		// begin-user-code
		this.Codigo = Codigo;
		// end-user-code
	}

	private String nombre;

	public String getNombre() {
		// begin-user-code
		return nombre;
		// end-user-code
	}

	public void setNombre(String nombre) {
		// begin-user-code
		this.nombre = nombre;
		// end-user-code
	}

	private Set<Capacidad_Terminal> capacidad_Terminal;

	public Set<Capacidad_Terminal> getCapacidad_Terminal() {
		// begin-user-code
		return capacidad_Terminal;
		// end-user-code
	}

	public void setCapacidad_Terminal(Set<Capacidad_Terminal> capacidad_Terminal) {
		// begin-user-code
		this.capacidad_Terminal = capacidad_Terminal;
		// end-user-code
	}

	private Set<Grupo> grupo;

        public Set<Grupo> getGrupo() {
		// begin-user-code
		return grupo;
		// end-user-code
	}
	
	public void setGrupo(Set<Grupo> grupo) {
		// begin-user-code
		this.grupo = grupo;
		// end-user-code
	}

	private Especialidad especialidad;

	public Especialidad getEspecialidad() {
		// begin-user-code
		return especialidad;
		// end-user-code
	}

	public void setEspecialidad(Especialidad especialidad) {
		// begin-user-code
		this.especialidad = especialidad;
		// end-user-code
	}
}