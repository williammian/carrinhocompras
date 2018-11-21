package br.com.carrinhocompras.loja.managedbeans.site;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.carrinhocompras.loja.daos.BookDAO;
import br.com.carrinhocompras.loja.models.Book;

@Model
public class HomeBean {
	
	@Inject
	private BookDAO bookDao;

	public List<Book> lastReleases(){
		return bookDao.lastReleases();
	}
	
	public List<Book> olderBooks(){
		return bookDao.last(20);
	}	
	
}
