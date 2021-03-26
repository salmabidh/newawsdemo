package com.engine.staysmart.sss.DAO;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.engine.staysmart.sss.entity.User;

@Repository
public class Usersimpl implements Usersinf {
	
	@Autowired
	private EntityManager entity;
	@Autowired
	private User users;

	@Override
	@Transactional
	public List<User> getuserdetails() {
      Session session=entity.unwrap(Session.class);
      String sql="Select * from user";
      SQLQuery thequery=session.createSQLQuery(sql);
      List li=thequery.list();
      Iterator it=li.iterator();
      if(li.size()>0) {
    	 // Object[]ob=(Object[]) it.next();
    	  //System.out.println(ob[0]);
    	//  System.out.println(ob[1]);
    	//  System.out.println(ob[2]);
      }
      else {
    	  System.out.println("no records");
      }

		return li;
	}

}
