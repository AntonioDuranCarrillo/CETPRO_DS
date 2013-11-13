
package modelo;


import java.math.BigInteger;
import java.util.Set;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author alumno
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Especialidad {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private BigInteger Codigo;

	/** 
	 * /**
	 *  * @return el Codigo
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public BigInteger getCodigo() {
		// begin-user-code
		return Codigo;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param Codigo el Codigo a establecer
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setCodigo(BigInteger Codigo) {
		// begin-user-code
		this.Codigo = Codigo;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String nombre;

	/** 
	 * /**
	 *  * @return el nombre
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getNombre() {
		// begin-user-code
		return nombre;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param nombre el nombre a establecer
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setNombre(String nombre) {
		// begin-user-code
		this.nombre = nombre;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer Ciclo;

	/** 
	 * /**
	 *  * @return el Ciclo
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getCiclo() {
		// begin-user-code
		return Ciclo;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param Ciclo el Ciclo a establecer
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setCiclo(Integer Ciclo) {
		// begin-user-code
		this.Ciclo = Ciclo;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Set<Modulo> modulo;

	/** 
	 * /**
	 *  * @return el modulo
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Set<Modulo> getModulo() {
		// begin-user-code
		return modulo;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param modulo el modulo a establecer
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setModulo(Set<Modulo> modulo) {
		// begin-user-code
		this.modulo = modulo;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Programacion_Curricular programacion_curricular;

	/** 
	 * /**
	 *  * @return el programacion_curricular
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Programacion_Curricular getProgramacion_curricular() {
		// begin-user-code
		return programacion_curricular;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param programacion_curricular el programacion_curricular a establecer
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setProgramacion_curricular(
			Programacion_Curricular programacion_curricular) {
		// begin-user-code
		this.programacion_curricular = programacion_curricular;
		// end-user-code
	}
}