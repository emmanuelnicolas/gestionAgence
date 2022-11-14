package com.inti.model;

import java.time.LocalDate;

public class Reservation {
	private long idVoyageur;
	private LocalDate dateReservation;
	private int nbJours;
	
	public Reservation(long idVoyageur, LocalDate dateReservation, int nbJours) {
		this.idVoyageur = idVoyageur;
		this.dateReservation = dateReservation;
		this.nbJours = nbJours;
	}

	public long getIdVoyageur() {
		return idVoyageur;
	}

	public void setIdVoyageur(long idVoyageur) {
		this.idVoyageur = idVoyageur;
	}

	public LocalDate getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(LocalDate dateReservation) {
		this.dateReservation = dateReservation;
	}

	public int getNbJours() {
		return nbJours;
	}

	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}

	@Override
	public String toString() {
		return "Reservation [idVoyageur=" + idVoyageur + ", dateReservation=" + dateReservation + ", nbJours=" + nbJours
				+ "]";
	}
	
	
	
	

}
