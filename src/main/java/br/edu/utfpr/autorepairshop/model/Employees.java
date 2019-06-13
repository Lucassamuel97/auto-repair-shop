package br.edu.utfpr.autorepairshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
public class Employees {
	@Id
	@Column(name = "id_employee")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmployee;

	@JoinColumn(name = "id_credentials")
	@OneToOne
	private Credentials idCredentials;

	@Column(name = "id_workshop")
	private Long idWorkshop;

	@JoinColumn(name = "id_adress")
	@OneToOne
	private Adress idAdress;

	private String name;
	private String telephone;

	public Employees(Long idEmployee, Credentials idCredentials, Long idWorkshop, Adress idAdress, String name,
			String telephone) {
		this.idEmployee = idEmployee;
		this.idCredentials = idCredentials;
		this.idWorkshop = idWorkshop;
		this.idAdress = idAdress;
		this.name = name;
		this.telephone = telephone;
	}
}
