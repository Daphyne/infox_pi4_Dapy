package br.com.infox.entidades;

public class Aviso {
	
	private String nomeAviso;
	private int idAviso;
	private String horaPublicacao;
	private int idDisciplina;
	private String mensagemaviso;
	
	
	
	public String getMensagemaviso() {
		return mensagemaviso;
	}
	public void setMensagemaviso(String mensagemaviso) {
		this.mensagemaviso = mensagemaviso;
	}
	public String getNomeAviso() {
		return nomeAviso;
	}
	public void setNomeAviso(String nomeAviso) {
		this.nomeAviso = nomeAviso;
	}
	public int getIdAviso() {
		return idAviso;
	}
	public void setIdAviso(int idAviso) {
		this.idAviso = idAviso;
	}
	public String getHoraPublicacao() {
		return horaPublicacao;
	}
	public void setHoraPublicacao(String horaPublicacao) {
		this.horaPublicacao = horaPublicacao;
	}
	public int getIdDisciplina() {
		return idDisciplina;
	}
	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}
	
	

}
