package com.inti.model;

public class Hotel {
	private long idHotel;
	private String nom;
	private int nbEtoile;
	
	public Hotel(long idHotel, String nom, int nbEtoile) {
	
		this.idHotel = idHotel;
		this.nom = nom;
		this.nbEtoile = nbEtoile;
	}

	public long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(long idHotel) {
		this.idHotel = idHotel;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbEtoile() {
		return nbEtoile;
	}

	public void setNbEtoile(int nbEtoile) {
		this.nbEtoile = nbEtoile;
	}

	@Override
	public String toString() {
		return "Hotel [idHotel=" + idHotel + ", nom=" + nom + ", nbEtoile=" + nbEtoile + "]";
	}
	
	
	
}
