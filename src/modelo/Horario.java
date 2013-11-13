
package modelo;


import java.util.Date;
import java.util.Set;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author alumno
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Horario {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Date Horario_inicio;

	/** 
	 * /**
	 *  * @return el Horario_inicio
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Date getHorario_inicio() {
		// begin-user-code
		return Horario_inicio;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param Horario_inicio el Horario_inicio a establecer
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setHorario_inicio(Date Horario_inicio) {
		// begin-user-code
		this.Horario_inicio = Horario_inicio;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Date Horario_termino;

	/** 
	 * /**
	 *  * @return el Horario_termino
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Date getHorario_termino() {
		// begin-user-code
		return Horario_termino;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param Horario_termino el Horario_termino a establecer
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setHorario_termino(Date Horario_termino) {
		// begin-user-code
		this.Horario_termino = Horario_termino;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Set<Dia> dia;

	/** 
	 * /**
	 *  * @return el dia
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Set<Dia> getDia() {
		// begin-user-code
		return dia;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param dia el dia a establecer
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setDia(Set<Dia> dia) {
		// begin-user-code
		this.dia = dia;
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