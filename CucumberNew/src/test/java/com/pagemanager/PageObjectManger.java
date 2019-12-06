package com.pagemanager;

import com.pages.Order;
import com.pages.Page;
import com.pages.PageBook;
import com.pages.PageSelect;
import com.pages.PaseSearch;

public class PageObjectManger {
	
	private Page loginpage;
	private PaseSearch SearchPg;
	private PageSelect third;
	private PageBook fourth;
	private Order last;
	
	public Page getPage() {
		return (loginpage==null)?loginpage = new Page():loginpage;
		
	}
	public PaseSearch getPaseSearch() {
		return (SearchPg==null)?SearchPg=new PaseSearch():SearchPg;
		
	}
	public PageSelect getPageSelect() {
		return (third==null)?third = new PageSelect():third;
		
	}
	public PageBook getPageBook() {
		return (fourth==null)?fourth=new PageBook():fourth;
	}
	public Order getOrder() {
		return (last==null)?last=new Order():last;
	}
	
}
