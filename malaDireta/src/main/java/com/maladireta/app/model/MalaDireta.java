package com.maladireta.app.model;

import java.util.List;

public class MalaDireta {

	private Integer quantidadeEmailsEnviados;
	private List<Email> emails;

	public Integer getQuantidadeEmailsEnviados() {
		return quantidadeEmailsEnviados;
	}

	public void setQuantidadeEmailsEnviados(Integer quantidadeEmailsEnviados) {
		this.quantidadeEmailsEnviados = quantidadeEmailsEnviados;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

}
