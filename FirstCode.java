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
            g.addVertex("Chhatarpur~Y");
            g.addVertex("Qutub Minar~Y");
            g.addVertex("Malviya Nagar~Y");
            g.addVertex("INA~Y");
            g.addVertex("Jor Bagh~Y");
            g.addVertex("Kashmere Gate~Y");
            g.addVertex("Civil Lines~Y");
            g.addVertex("GTB Nagar~Y");
            g.addVertex("Rithala~R");
            g.addVertex("Pitampura~R");
            g.addVertex("Kohat Enclave~R");
            g.addVertex("Rohini West~R");
            g.addVertex("Rohini East~R");
            g.addVertex("Shastri Nagar~R");
            g.addVertex("Inderlok~R");
            g.addVertex("Lajpat Nagar~V");
            g.addVertex("Kalkaji Mandir~V");
            g.addVertex("Govindpuri~V");
            g.addVertex("Nehru Place~V");
            g.addVertex("Mandi House~V");
            g.addVertex("ITO~V");
            g.addVertex("Jama Masjid~V");
            g.addVertex("Dhaula Kuan~O");
            g.addVertex("Delhi Aerocity~O");
            g.addVertex("Shankar Vihar~O");
            g.addVertex("IGI Terminal 1~O");
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
            g.addVertex("Noida Sector 16~B");
            g.addVertex("Noida Sector 18~B");
            g.addVertex("Mayur Vihar Phase 1~B");
            g.addVertex("Akshardham~B");
            g.addVertex("Indraprastha~B");
            g.addVertex("Rajendra Place~B");
            g.addVertex("Karol Bagh~B");
            g.addVertex("Ramesh Nagar~B");
            g.addVertex("Tilak Nagar~B");
            g.addVertex("Dwarka~B");
        
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
            g.addEdge("DDS Campus~O", "Dhaula Kuan~O", 4);
            g.addEdge("Dhaula Kuan~O", "Delhi Aerocity~O", 6);
            g.addEdge("Delhi Aerocity~O", "Shankar Vihar~O", 3);
            g.addEdge("Shankar Vihar~O", "IGI Terminal 1~O", 2);
            g.addEdge("Lajpat Nagar~V", "Kalkaji Mandir~V", 3);
            g.addEdge("Kalkaji Mandir~V", "Govindpuri~V", 2);
            g.addEdge("Govindpuri~V", "Nehru Place~V", 2);
            g.addEdge("Nehru Place~V", "Mandi House~V", 4);
            g.addEdge("Mandi House~V", "ITO~V", 1);
            g.addEdge("ITO~V", "Jama Masjid~V", 2);
            g.addEdge("Rithala~R", "Rohini West~R", 3);
            g.addEdge("Rohini West~R", "Rohini East~R", 1);
            g.addEdge("Rohini East~R", "Pitampura~R", 2);
            g.addEdge("Pitampura~R", "Kohat Enclave~R", 2);
            g.addEdge("Kohat Enclave~R", "Shastri Nagar~R", 2);
            g.addEdge("Shastri Nagar~R", "Inderlok~R", 2);
            g.addEdge("Inderlok~R", "Netaji Subhash Place~PR", 1); // already added
            g.addEdge("Huda City Center~Y", "Chhatarpur~Y", 12);
            g.addEdge("Chhatarpur~Y", "Qutub Minar~Y", 2);
            g.addEdge("Qutub Minar~Y", "Malviya Nagar~Y", 3);
            g.addEdge("Malviya Nagar~Y", "Saket~Y", 2); // already added
            g.addEdge("AIIMS~Y", "INA~Y", 2);
            g.addEdge("INA~Y", "Jor Bagh~Y", 1);
            g.addEdge("Jor Bagh~Y", "Rajiv Chowk~BY", 5); // Central connect
            g.addEdge("Rajiv Chowk~BY", "Kashmere Gate~Y", 4);
            g.addEdge("Kashmere Gate~Y", "Civil Lines~Y", 2);
            g.addEdge("Civil Lines~Y", "GTB Nagar~Y", 2);
            g.addEdge("GTB Nagar~Y", "Vishwavidyalaya~Y", 1); // already added
            g.addEdge("Noida Sector 62~B", "Noida Sector 16~B", 5);
            g.addEdge("Noida Sector 16~B", "Noida Sector 18~B", 2);
            g.addEdge("Noida Sector 18~B", "Mayur Vihar Phase 1~B", 4);
            g.addEdge("Mayur Vihar Phase 1~B", "Akshardham~B", 3);
            g.addEdge("Akshardham~B", "Indraprastha~B", 4);
            g.addEdge("Indraprastha~B", "Yamuna Bank~B", 3); // already added
            g.addEdge("Rajiv Chowk~BY", "Rajendra Place~B", 3);
            g.addEdge("Rajendra Place~B", "Karol Bagh~B", 2);
            g.addEdge("Karol Bagh~B", "Ramesh Nagar~B", 3);
            g.addEdge("Ramesh Nagar~B", "Moti Nagar~B", 2); // already added
            g.addEdge("Janak Puri West~BO", "Tilak Nagar~B", 4);
            g.addEdge("Tilak Nagar~B", "Dwarka~B", 6);
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
