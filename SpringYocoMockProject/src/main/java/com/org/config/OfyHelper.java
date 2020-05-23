package com.org.config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;
import com.org.model.UserAccountDetail;
import com.org.model.UserAccounts;

//..Omit..

public class OfyHelper implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		ObjectifyService.register(UserAccounts.class);
		ObjectifyService.register(UserAccountDetail.class);
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
	}

}

	
	
//public static void register() {
//  ObjectifyService.register(UserAccounts.class);
//  ObjectifyService.register(UserAccountDetail.class);
//}
//
//@Override
//public void contextInitialized(ServletContextEvent event) {
//  // This will be invoked as part of a warmup request, or the first user
//  // request if no warmup request was invoked.
//  register();
//}
//
//@Override
//public void contextDestroyed(ServletContextEvent event) {
//  // App Engine does not currently invoke this method.
//}
//}
	
  /*  @Override
    public void contextInitialized(ServletContextEvent sce) {
        ObjectifyFactory factory= ObjectifyService.factory();
        factory.register(UserAccounts.class);
        factory.register(UserAccountDetail.class);
    }

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}
}

*/