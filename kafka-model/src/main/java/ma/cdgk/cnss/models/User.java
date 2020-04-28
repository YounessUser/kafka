package ma.cdgk.cnss.models;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
    private int age;
    private String sexe;
    private String adresse;
    private String nationalite;
    
    public User() {
		super();
	}
    
	public User(String name, int age, String sexe, String adresse, String nationalite) {
		super();
		this.name = name;
		this.age = age;
		this.sexe = sexe;
		this.adresse = adresse;
		this.nationalite = nationalite;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", sexe=" + sexe + ", adresse=" + adresse + ", nationalite="
				+ nationalite + "]";
	}

}
