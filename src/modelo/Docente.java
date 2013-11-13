
package modelo;

import java.math.BigInteger;
import java.util.Set;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author alumno
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Docente {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer cod_docente;

	/** 
	 * /**
	 *  * @return el cod_docente
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getCod_docente() {
		// begin-user-code
		return cod_docente;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param cod_docente el cod_docente a establecer
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setCod_docente(Integer cod_docente) {
		// begin-user-code
		this.cod_docente = cod_docente;
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
	private String apellidos;

	/** 
	 * /**
	 *  * @return el apellidos
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getApellidos() {
		// begin-user-code
		return apellidos;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param apellidos el apellidos a establecer
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setApellidos(String apellidos) {
		// begin-user-code
		this.apellidos = apellidos;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private BigInteger dni;

	/** 
	 * /**
	 *  * @return el dni
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public BigInteger getDni() {
		// begin-user-code
		return dni;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param dni el dni a establecer
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setDni(BigInteger dni) {
		// begin-user-code
		this.dni = dni;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String direccion;

	/** 
	 * /**
	 *  * @return el direccion
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getDireccion() {
		// begin-user-code
		return direccion;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param direccion el direccion a establecer
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setDireccion(String direccion) {
		// begin-user-code
		this.direccion = direccion;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Set<Grupo> grupo;

	/** 
	 * /**
	 *  * @return el grupo
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Set<Grupo> getGrupo() {
		// begin-user-code
		return grupo;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param grupo el grupo a establecer
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setGrupo(Set<Grupo> grupo) {
		// begin-user-code
		this.grupo = grupo;
		// end-user-code
	}
}