package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Date;

public class main_misc {
    
	
	public static void main(String[] args) {
	  
	Graph_1 g = new Graph_1();
	g.add(0);
	g.add(1);
	g.add(2);
	g.add(3);
	g.add(4);
	g.add(5);
	g.add(6);
	
	g.link(0, 3);
	g.link(5, 1);
	g.link(1, 3);
	g.link(5, 0);
	g.link(3, 2);
	g.link(6, 5);
	
	System.out.println(g.build_order());
	//g.show_dep();
	
	
	
	
	}
		
	
	
		
	}
	
	
		
	
		

	
  
	
    
	
		

	

	
		
		
	

	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	


	
	
	

	


	
	

	
		
	
	


	

	
	

