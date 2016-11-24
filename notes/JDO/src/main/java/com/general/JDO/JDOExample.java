package src.main.java.com.general.JDO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.jdo.JDOHelper;
//import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
//import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

import com.general.JDO.Book;

public class JDOExample {

	
	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		
		Properties properties = new Properties();
		InputStream stream = new FileInputStream("datastore.properties");
		properties.load(stream);
		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory(new File("datastore.properties"));
		//PersistenceManagerFactory pmf =  JDOHelper.getPersistenceManagerFactory(properties);

		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();
			Book b = new Book();
			b.setAuthor("Sagar");
			b.setName("Success of life");
			pm.makePersistent(b);
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}

	}

}

