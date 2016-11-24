package com.general.JDO;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

public class BookDaoImpl {
	private PersistenceManagerFactory pmf;

	public void insert(Book b) { 
        PersistenceManager pm = this.pmf.getPersistenceManager(); 
        try { 
            pm.makePersistent(b); 
        } finally { 
            pm.close(); 
        } 
    } 
}
