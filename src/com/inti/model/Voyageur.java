package com.inti.model;

public class Voyageur {	
	private long idVoyageur;
	private String nom;
	private String prenom;
	private int age;
	
	
	public Voyageur(long idVoyageur, String nom, String prenom, int age) {
		this.idVoyageur = idVoyageur;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}


	public long getIdVoyageur() {
		return idVoyageur;
	}


	public void setIdVoyageur(long idVoyageur) {
		this.idVoyageur = idVoyageur;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Voyageur [idVoyageur=" + idVoyageur + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	

}
