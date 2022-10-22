package cg.app.mediatech.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "client")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientEntity implements Serializable {
	
	public ClientEntity() {}

	@Id
	@GeneratedValue
	private Long idLong;
	
	@Column(nullable = false, name = "nom")
	private String nomString;
	
	@Column(nullable = false, name = "prenom")
	private String prenString;
	
	@Column(name = "tel")
	private String phoneString;

	/**
	 * @param nomString
	 * @param prenString
	 * @param phoneString
	 */
	public ClientEntity(String nomString, String prenString, String phoneString) {
		super();
		this.nomString = nomString;
		this.prenString = prenString;
		this.phoneString = phoneString;
	}

	public String getNomString() {
		return nomString;
	}

	public void setNomString(String nomString) {
		this.nomString = nomString;
	}

	public String getPrenString() {
		return prenString;
	}

	public void setPrenString(String prenString) {
		this.prenString = prenString;
	}

	public String getPhoneString() {
		return phoneString;
	}

	public void setPhoneString(String phoneString) {
		this.phoneString = phoneString;
	}

	@Override
	public String toString() {
		return "ClientEntity [idLong=" + idLong + ", nomString=" + nomString + ", prenString=" + prenString
				+ ", phoneString=" + phoneString + "]";
	}
	
	
	
}
