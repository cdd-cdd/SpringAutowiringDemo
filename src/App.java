 import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.able.beans.Offer;
import com.able.beans.OffersDAO;
import com.able.beans.Robot;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		
		OffersDAO offersDao = context.getBean(OffersDAO.class);
		//Offer offer3 = offersDao.getOffer(3);
		//Offer offer4 = new Offer("Jim","jim@anything.com","don't hurt me");
		//offersDao.delete(3);

		//Offer offer6 = new Offer(6,"Kate","kate@anything.com","don't hurt me");
		//offersDao.update(offer6);
		//System.out.println("success :" + offersDao.create(offer4));
		List<Offer> createOffers = new ArrayList<>();
		
		createOffers.add(new Offer(16,"Lurn","lurn@anything.com","don't hurt me"));
		createOffers.add(new Offer(10,"Klas","klas@anything.com","don't hurt me"));
		try {
			System.out.println("success :" + offersDao.create(createOffers));
		}catch(DataAccessException e){
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
		
		
		List<Offer> offers = offersDao.getOffers();
		
		Offer offer = offersDao.getOffer(1);
		

		
		for (Offer of : offers) {
			System.out.println(of);
		}
		
		System.out.println(offer);
		
		((ClassPathXmlApplicationContext) context).close();

	}

}
