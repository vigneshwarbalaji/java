/*package com.org.config;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;
import com.org.model.UserAccountDetail;
import com.org.model.UserAccounts;

public class OfyService {
    private static final Logger logger = Logger.getLogger(OfyService.class.getName());

    static {
        try {
            ObjectifyService.register(UserAccounts.class);
            ObjectifyService.register(UserAccountDetail.class);
            /* ... more entities ... */
  /*      } catch (Exception e) {
            logger.log(Level.SEVERE, e.toString());
        }
    }

    public static Objectify ofy() {
        return ObjectifyService.ofy();
    }

    public static ObjectifyFactory factory() {
        return ObjectifyService.factory();
    }
}*/