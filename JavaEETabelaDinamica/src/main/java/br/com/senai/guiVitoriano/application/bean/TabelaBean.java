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
	
	//Manipula a lista e fornece para a página a ListDataModel
	private List<Despesas> despesasList = new ArrayList<>();
	private ListDataModel<Despesas> despesas = new ListDataModel<>(despesasList);
	//ListDataModel -> Lista usada pelo JSF para construir a lista na tela
	
	public String inserir() {
		
		//Cria um novo objeto despesas e adiciona
		Despesas d = new Despesas();
		d.setEdit(true);
		despesasList.add(d);
		
		return null;
		
	}
	
	public String excluir(Despesas despesa) {
		
		//Deleta um objeto da lista usando o próprio objeto como parâmetro
		despesasList.remove(despesa);
		
		return null;
		
	}
	
	//Muda a forma de manipular a tabela, ao clicar em editar ou em gravar através da variável Edit
	
	public String editar(Despesas despesa) {
		
		despesa.setEdit(true);
		return null;
		
	}
	
	public String gravar(Despesas despesa) {
		
		despesa.setEdit(false);
		return null;
		
	}
	
	public ListDataModel<Despesas> getDespesas(){
		
		//passa toda a lista para o JSF
		return despesas;
		
	}
	
}
