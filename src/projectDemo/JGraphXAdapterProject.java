package projectDemo;

import com.mxgraph.layout.mxCircleLayout;
import com.mxgraph.swing.mxGraphComponent;
import org.jgrapht.ListenableGraph;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.ext.JGraphXAdapter;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultListenableGraph;
import org.jgrapht.graph.DirectedMultigraph;

import javax.swing.*;
import java.awt.*;


/**
 * An applet to display an application of graphs to mapping different
 * connections
 *
 */
@SuppressWarnings("deprecation")
public class JGraphXAdapterProject extends JApplet {

    private static final long serialVersionUID = -8312166864582873921L;

    private static final Dimension DEFAULT_SIZE = new Dimension(800, 800);


    /**
     * Main method, where processes are initialized.
     * @param args command line arguments for main
     */
    public static void main(String[] args) {

        JGraphXAdapterProject applet = new JGraphXAdapterProject();
        applet.init();

        /* Creating a new Swing frame (window) and specifying some properties. */
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

    /**
     * init: inherited from JApplet and
     * overridden by my class. Major processes
     * take place here.
     */
    @Override
    public void init() {
        /*sample data that will be used as vertices for graph*/
        //Years
        String year1 = "Year One";
        String year2 = "Year Two";
        String year3 = "Year Three";
        String year4 = "Year Four";

        /* Modelling LinkedIn connections using a graph.
        * Creating the connections that will serve as vertices.
        */
        String connection1 = "Excel Chukwu";
        String connection2 = "Sean Ofori-Addo";
        String connection3 = "Emmanuel Ainoo";
        String connection4 = "David Ebo";
        String connection5 = "Miriam Duke";
        String connection6 = "Elijah Boateng";
        String connection7 = "Faddal Ibrahim";
        String connection8 = "Ibrahim Kassim";
        String connection9 = "Clement Ngosong";
        String connection10 = "Petra Abosi";
        String connection11 = "Elizabeth Ejereonye";
        String connection12 = "Kekeli Mensah";
        String connection13 = "Eyram Bleboo";
        String connection14 = "Derryck Dowuona";
        String connection15 = "Chantel Owusu";
        String connection16 = "Hannah Lormenyo";
        String connection17 = "Oswald Gyabaah";
        String connection18 = "Isioma Ekejiuba";
        String connection19 = "Ngong Oliver";
        String connection20 = "Tochukwu Anyaegbunam";



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
                new DefaultListenableGraph<>(new DirectedMultigraph<>(DefaultEdge.class));

        // create a visualization using JGraph, via an adapter
        JGraphXAdapter<String, DefaultEdge> jgxAdapter = new JGraphXAdapter<>(g);

        setPreferredSize(DEFAULT_SIZE);
        mxGraphComponent component = new mxGraphComponent(jgxAdapter);
        component.setConnectable(false);
        component.getGraph().setAllowDanglingEdges(false);
        getContentPane().add(component);
        resize(DEFAULT_SIZE);



        /* Adding the vertices to the graph.*/
        g.addVertex(connection1);
        g.addVertex(connection2);
        g.addVertex(connection3);
        g.addVertex(connection4);
        g.addVertex(connection5);
        g.addVertex(connection6);
        g.addVertex(connection7);
        g.addVertex(connection8);
        g.addVertex(connection9);
        g.addVertex(connection10);
        g.addVertex(connection11);
        g.addVertex(connection12);
        g.addVertex(connection13);
        g.addVertex(connection14);
        g.addVertex(connection15);
        g.addVertex(connection16);
        g.addVertex(connection17);
        g.addVertex(connection18);
        g.addVertex(connection19);
        g.addVertex(connection20);

        /* Creating edges between the vertices. */
        g.addEdge(connection1, connection2);
        g.addEdge(connection1, connection5);
        g.addEdge(connection1, connection6);
        g.addEdge(connection1, connection7);
        g.addEdge(connection1, connection8);
        g.addEdge(connection1, connection9);
        g.addEdge(connection1, connection10);
        g.addEdge(connection1, connection13);
        g.addEdge(connection1, connection16);
        g.addEdge(connection1, connection17);
        g.addEdge(connection1, connection18);
        g.addEdge(connection1, connection19);
        g.addEdge(connection1, connection20);
        g.addEdge(connection2, connection5);
        g.addEdge(connection2, connection6);
        g.addEdge(connection2, connection11);
        g.addEdge(connection2, connection12);
        g.addEdge(connection2, connection13);
        g.addEdge(connection2, connection14);
        g.addEdge(connection2, connection15);
        g.addEdge(connection2, connection18);
        g.addEdge(connection2, connection19);
        g.addEdge(connection2, connection20);
        g.addEdge(connection2, connection16);
        g.addEdge(connection3, connection4);
        g.addEdge(connection3, connection17);
        g.addEdge(connection3, connection14);
        g.addEdge(connection3, connection16);
        g.addEdge(connection6, connection7);
        g.addEdge(connection6, connection8);
        g.addEdge(connection6, connection3);
        g.addEdge(connection6, connection9);
        g.addEdge(connection8, connection7);
        g.addEdge(connection6, connection16);
        g.addEdge(connection14, connection16);
        g.addEdge(connection9, connection19);
        g.addEdge(connection16, connection17);



        // positioning via jgraphx layouts
        mxCircleLayout layout = new mxCircleLayout(jgxAdapter);

        // center the circle
        int radius = 100;
        layout.setX0((DEFAULT_SIZE.width / 4.0) - radius);
        layout.setY0((DEFAULT_SIZE.height / 4.0) - radius);
        layout.setRadius(radius);
        layout.setMoveCircle(true);

        layout.execute(jgxAdapter.getDefaultParent());


        /* Using the Dijkstra's shortest path algorithm to find the shortest
        path from connection 1 to connection 4.
         */
        System.out.println("Shortest path from connection1 to connection4:");
        DijkstraShortestPath<String, DefaultEdge> dijkstraAlg =
                new DijkstraShortestPath<>(g);
        ShortestPathAlgorithm.SingleSourcePaths<String, DefaultEdge> iPaths = dijkstraAlg.getPaths(connection1);
        System.out.println(iPaths.getPath(connection4) + "\n");
    }


}
