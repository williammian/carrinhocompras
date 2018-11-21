package br.com.carrinhocompras.loja.managedbeans.admin;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.carrinhocompras.loja.models.Book;
import br.com.carrinhocompras.loja.models.Sale;
import br.com.carrinhocompras.loja.websockets.ConnectedUsers;

@Model
public class AdminSalesBean {

	private Sale sale = new Sale();
	@Inject
	private ConnectedUsers connectedUsers;

	@PostConstruct
	private void configure() {
		this.sale.setBook(new Book());
	}

	public String save() {
		connectedUsers.send(sale.toJson());
		return "/admin/promocoes/form.xhtml?faces-redirect=true";
	}

	public Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

}
