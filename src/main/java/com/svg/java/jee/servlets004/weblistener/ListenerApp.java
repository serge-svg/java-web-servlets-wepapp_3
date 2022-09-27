package com.svg.java.jee.servlets004.weblistener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ListenerApp implements ServletContextListener {

    public ListenerApp() {
        // TODO Auto-generated constructor stub
    }

    public void contextDestroyed(ServletContextEvent arg0)  { 
         System.out.println("Application destroyed");
    }

    public void contextInitialized(ServletContextEvent arg0)  { 
         System.out.println("Application created");
    }
	
}
