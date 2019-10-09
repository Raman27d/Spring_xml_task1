package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie mov1 = (Movie) context.getBean("movie1");
        mov1.getActor().displayDetails();
        Movie mov2 = (Movie) context.getBean("movie2");
        // returns true; and false when scope =  prototype
        System.out.println(mov1 == mov2);
    }
}