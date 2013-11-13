
package modelo;


import java.math.BigInteger;
import java.util.Date;
import java.util.Set;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author alumno
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Grupo {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private BigInteger num_grupo;

	/** 
	 * /**
	 *  * @return el num_grupo
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public BigInteger getNum_grupo() {
		// begin-user-code
		return num_grupo;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param num_grupo el num_grupo a establecer
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setNum_grupo(BigInteger num_grupo) {
		// begin-user-code
		this.num_grupo = num_grupo;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Date fecha_inicio;

	/** 
	 * /**
	 *  * @return el fecha_inicio
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Date getFecha_inicio() {
		// begin-user-code
		return fecha_inicio;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param fecha_inicio el fecha_inicio a establecer
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setFecha_inicio(Date fecha_inicio) {
		// begin-user-code
		this.fecha_inicio = fecha_inicio;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Date Fecha_termino;

	/** 
	 * /**
	 *  * @return el Fecha_termino
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Date getFecha_termino() {
		// begin-user-code
		return Fecha_termino;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param Fecha_termino el Fecha_termino a establecer
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setFecha_termino(Date Fecha_termino) {
		// begin-user-code
		this.Fecha_termino = Fecha_termino;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer Cant_max_alumnos;

	/** 
	 * /**
	 *  * @return el Cant_max_alumnos
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getCant_max_alumnos() {
		// begin-user-code
		return Cant_max_alumnos;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param Cant_max_alumnos el Cant_max_alumnos a establecer
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setCant_max_alumnos(Integer Cant_max_alumnos) {
		// begin-user-code
		this.Cant_max_alumnos = Cant_max_alumnos;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Set<Matricula> matricula;

	/** 
	 * /**
	 *  * @return el matricula
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Set<Matricula> getMatricula() {
		// begin-user-code
		return matricula;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param matricula el matricula a establecer
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setMatricula(Set<Matricula> matricula) {
		// begin-user-code
		this.matricula = matricula;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Docente docente;

	/** 
	 * /**
	 *  * @return el docente
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Docente getDocente() {
		// begin-user-code
		return docente;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param docente el docente a establecer
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setDocente(Docente docente) {
		// begin-user-code
		this.docente = docente;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Horario horario;

	/** 
	 * /**
	 *  * @return el horario
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Horario getHorario() {
		// begin-user-code
		return horario;
		// end-user-code
	}

	/** 
	 * /**
	 *  * @param horario el horario a establecer
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setHorario(Horario horario) {
		// begin-user-code
		this.horario = horario;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Modulo modulo;

	/** 
	 * /**
	 *  * @return el modulo
	 * 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Modulo getModulo() {
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
	public void setModulo(Modulo modulo) {
		// begin-user-code
		this.modulo = modulo;
		// end-user-code
	}
}