package com.consumer;

import java.util.function.Consumer;

class Movie{
	String name;

	public Movie(String name) {
		super();
		this.name = name;
	}
}
public class Ex_03 {

	public static void main(String[] args) {
		
		Consumer<Movie> c1 = m->System.out.println(m.name+" ready to release");
		Consumer<Movie> c2 = m->System.out.println(m.name+" released but it is bigger flop");
		Consumer<Movie> c3 = m->System.out.println(m.name+" storing information in database");
		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);
	    Movie mov = new Movie("Spider");
	    //c3.accept(mov);
	    cc.accept(mov);

	}

}
