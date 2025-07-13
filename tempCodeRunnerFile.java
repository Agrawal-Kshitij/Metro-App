// Source code is decompiled from a .class file using FernFlower decompiler.

import java.util.*;

public class FirstCode {
    public static class MetroGraph{
        public static class Vertex{
            HashMap<String , Integer> nbrs = new HashMap<>();
        }
        HashMap<String, Vertex> MetroMap;
        public MetroGraph(){
            MetroMap = new HashMap<>();
        }
        public void addVertex(String vname) 
		{
			Vertex vtx = new Vertex();
			MetroMap.put(vname, vtx);
		}
        public void addEdge(String vname1, String vname2, int value) 
		{
			Vertex vtx1 = MetroMap.get(vname1); 
			Vertex vtx2 = MetroMap.get(vname2); 

			if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)) {
				return;
			}

			vtx1.nbrs.put(vname2, value);
			vtx2.nbrs.put(vname1, value);
		}
        public void createMetroMap(MetroGraph g)
		{
            //ADDTION OF ALL THE METRO STTATIONS IN THE GRAPH AS KEY;
			g.addVertex("Noida Sector 62~B");
			g.addVertex("Botanical Garden~B");
			g.addVertex("Yamuna Bank~B");
			g.addVertex("Rajiv Chowk~BY");
			g.addVertex("Vaishali~B");
			g.addVertex("Moti Nagar~B");
			g.addVertex("Janak Puri West~BO");
			g.addVertex("Dwarka Sector 21~B");
			g.addVertex("Huda City Center~Y");
			g.addVertex("Saket~Y");
			g.addVertex("Vishwavidyalaya~Y");
			g.addVertex("Chandni Chowk~Y");
			g.addVertex("New Delhi~YO");
			g.addVertex("AIIMS~Y");
			g.addVertex("Shivaji Stadium~O");
			g.addVertex("DDS Campus~O");
			g.addVertex("IGI Airport~O");
			g.addVertex("Rajouri Garden~BP");
			g.addVertex("Netaji Subhash Place~PR");
			g.addVertex("Punjabi Bagh West~P");

            //ADDITION OF NEIGHBOURS OF ALL METRO STATION;
            g.addEdge("Noida Sector 62~B", "Botanical Garden~B", 8);
			g.addEdge("Botanical Garden~B", "Yamuna Bank~B", 10);
			g.addEdge("Yamuna Bank~B", "Vaishali~B", 8);
			g.addEdge("Yamuna Bank~B", "Rajiv Chowk~BY", 6);
			g.addEdge("Rajiv Chowk~BY", "Moti Nagar~B", 9);
			g.addEdge("Moti Nagar~B", "Janak Puri West~BO", 7);
			g.addEdge("Janak Puri West~BO", "Dwarka Sector 21~B", 6);
			g.addEdge("Huda City Center~Y", "Saket~Y", 15);
			g.addEdge("Saket~Y", "AIIMS~Y", 6);
			g.addEdge("AIIMS~Y", "Rajiv Chowk~BY", 7);
			g.addEdge("Rajiv Chowk~BY", "New Delhi~YO", 1);
			g.addEdge("New Delhi~YO", "Chandni Chowk~Y", 2);
			g.addEdge("Chandni Chowk~Y", "Vishwavidyalaya~Y", 5);
			g.addEdge("New Delhi~YO", "Shivaji Stadium~O", 2);
			g.addEdge("Shivaji Stadium~O", "DDS Campus~O", 7);
			g.addEdge("DDS Campus~O", "IGI Airport~O", 8);
			g.addEdge("Moti Nagar~B", "Rajouri Garden~BP", 2);
			g.addEdge("Punjabi Bagh West~P", "Rajouri Garden~BP", 2);
			g.addEdge("Punjabi Bagh West~P", "Netaji Subhash Place~PR", 3);
        }
        public void displayStations() 
		{
			System.out.println("\n***********************************************************************\n");
			ArrayList<String> keys = new ArrayList<>(MetroMap.keySet());
            Collections.sort(keys);
			int i=1;
			for(String key : keys) 
			{
				System.out.println(i + ". " + key);
				i++;
			}
			System.out.println("\n***********************************************************************\n");
		}
       
        
    }

   public static void main(String[] var0) {
      System.out.println("Hii");
      MetroGraph g = new MetroGraph();
      g.createMetroMap(g);
      g.displayStations();
      


   }
}
