package br.com.senai.guiVitoriano.application.bean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

import br.com.senai.guiVitoriano.application.model.Despesas;

@SuppressWarnings("serial")
@Named("tabela")
@SessionScoped

public class TabelaBean implements Serializable{
	
	//Manipula a lista e fornece para a p�gina a ListDataModel
	private List<Despesas> despesasList = new ArrayList<>();
	private ListDataModel<Despesas> despesas = new ListDataModel<>(despesasList);
	//ListDataModel -> classe do java que tem m�todos especiais que permitem a edi��o, precisa de um ArrayList
	
	public String inserir() {
		
		Despesas d = new Despesas();
		despesasList.add(d);
		
		return null;
		
	}
	
	public String excluir(Despesas despesa) {
		
		//Deleta um objeto da lista usando o pr�prio objeto como par�metro
		despesasList.remove(despesas);
		
		return null;
		
	}
	
}
