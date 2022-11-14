package com.inti.model;

public class Avis {
	private long idAvis;
	private String commentaire;

	
	public Avis(long idAvis, String commentaire) {
		this.idAvis = idAvis;
		this.commentaire = commentaire;
	}


	public long getIdAvis() {
		return idAvis;
	}


	public void setIdAvis(long idAvis) {
		this.idAvis = idAvis;
	}


	public String getCommentaire() {
		return commentaire;
	}


	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}


	@Override
	public String toString() {
		return "Avis [idAvis=" + idAvis + ", commentaire=" + commentaire + "]";
	}
	
	

}
