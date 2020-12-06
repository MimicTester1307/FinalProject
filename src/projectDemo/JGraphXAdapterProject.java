package projectDemo;

import com.mxgraph.layout.mxCircleLayout;
import com.mxgraph.swing.mxGraphComponent;
import org.jgrapht.ListenableGraph;
import org.jgrapht.ext.JGraphXAdapter;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultListenableGraph;
import org.jgrapht.graph.DefaultUndirectedGraph;

import javax.swing.*;
import java.awt.*;


/**
 * An applet to display an application of graphs to mapping the connection of different
 * courses at Ashesi
 *
 */
@SuppressWarnings("deprecation")
public class JGraphXAdapterProject extends JApplet {

    private static final long serialVersionUID = -8312166864582873921L;

    private static final Dimension DEFAULT_SIZE = new Dimension(800, 800);


    public static void main(String[] args) {

        JGraphXAdapterProject applet = new JGraphXAdapterProject();
        applet.init();

        JFrame frame = new JFrame();
        frame.getContentPane().add(applet);
        frame.setTitle("JGraphT Adapter Graph Visualization");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



    /*
    We have created a number of graphs to be displayed.
    But the init method can display only one graph at a time
    Uncomment the different graphs to view them.
     */
    @Override
    public void init() {
        // sample data that will be used as vertices for graph
        String year1 = "Year One";
        String year2 = "Year Two";
        String year3 = "Year Three";
        String year4 = "Year Four";
        String semester1 = "Semester 1";
        String course1 = "FDE I";


      /*  *//*
         * First graph: displays the natural progression of students through
         * university, using Ashesi University as a case study.
         *//*
        ListenableGraph<String, DefaultEdge> graph1 =
                new DefaultListenableGraph<>(new SimpleDirectedGraph<>(DefaultEdge.class));

        JGraphXAdapter<String, DefaultEdge> jgxAdapter1 = new JGraphXAdapter<>(graph1);

        setPreferredSize(new Dimension(350, 350));
        mxGraphComponent component1 = new mxGraphComponent(jgxAdapter1);
        component1.setConnectable(false);
        component1.getGraph().setAllowDanglingEdges(false);
        getContentPane().add(component1);
        resize(DEFAULT_SIZE);

        graph1.addVertex(year1);
        graph1.addVertex(year2);
        graph1.addVertex(year3);
        graph1.addVertex(year4);
        graph1.addEdge(year1, year2);
        graph1.addEdge(year2, year3);
        graph1.addEdge(year3, year4);

        // positioning via jgraphx layouts
        mxCircleLayout layout1 = new mxCircleLayout(jgxAdapter1);

        // center the circle
        int radius1 = 100;
        layout1.setX0((DEFAULT_SIZE.width / 5.0) - radius1);
        layout1.setY0((DEFAULT_SIZE.height / 5.0) - radius1);
        layout1.setRadius(radius1);
        layout1.setMoveCircle(true);

        layout1.execute(jgxAdapter1.getDefaultParent());*/



        /*
        Second graph: displays a visualization of courses at Ashesi University
         */

        // create a JGraphT graph
        ListenableGraph<String, DefaultEdge> g =
                new DefaultListenableGraph<>(new DefaultUndirectedGraph<>(DefaultEdge.class));

        // create a visualization using JGraph, via an adapter
        JGraphXAdapter<String, DefaultEdge> jgxAdapter = new JGraphXAdapter<>(g);

        setPreferredSize(DEFAULT_SIZE);
        mxGraphComponent component = new mxGraphComponent(jgxAdapter);
        component.setConnectable(false);
        component.getGraph().setAllowDanglingEdges(false);
        getContentPane().add(component);
        resize(DEFAULT_SIZE);


        g.addVertex(year1);
        g.addVertex(semester1);
        g.addVertex(course1);

        g.addEdge(year1, semester1);
        g.addEdge(semester1, course1);
       

        // positioning via jgraphx layouts
        mxCircleLayout layout = new mxCircleLayout(jgxAdapter);

        // center the circle
        int radius = 100;
        layout.setX0((DEFAULT_SIZE.width / 4.0) - radius);
        layout.setY0((DEFAULT_SIZE.height / 4.0) - radius);
        layout.setRadius(radius);
        layout.setMoveCircle(true);

        layout.execute(jgxAdapter.getDefaultParent());


    }


}
