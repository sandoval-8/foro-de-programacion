package principal.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Transient;

@Entity
public class Clase implements Serializable {

	private static final long serialVersionUID = 1182325609637974054L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	public String titulo;

	public String presentacion;

	public String desarrollo;
	
	@Lob
	@Column(length=10000000, columnDefinition="MEDIUMBLOB")
	public byte[] imagen;
	
	@Transient
	public String foto;

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Clase(String titulo, String presentacion, String desarrollo, byte[] imagen) {
		this.titulo = titulo;
		this.presentacion = presentacion;
		this.desarrollo = desarrollo;
		this.imagen = imagen;
	}

	public Clase(String titulo, String presentacion) {
		this.titulo = titulo;
		this.presentacion = presentacion;
	}

	public Clase() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public String getDesarrollo() {
		return desarrollo;
	}

	public void setDesarrollo(String desarrollo) {
		this.desarrollo = desarrollo;
	}
	
	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

}
