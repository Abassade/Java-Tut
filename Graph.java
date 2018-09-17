
package A;

import javax.swing.JFrame;

 public class Graph
 {
 public static void main( String[] args )
 {
 GraphTest panel = new GraphTest();
 JFrame application = new JFrame();

 application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
 application.add( panel );
 application.setSize( 250,280 );
 application.setVisible( true );

 } 
 }