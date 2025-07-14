// Source code is decompiled from a .class file using FernFlower decompiler.

import java.util.*;
import java.io.*;
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
       
        public void displayMap() 
		{
			System.out.println("\t Delhi Metro Map");
			System.out.println("\t------------------");
			System.out.println("----------------------------------------------------\n");
			ArrayList<String> keys = new ArrayList<>(MetroMap.keySet());
            Collections.sort(keys);

			for (String key : keys) 
			{
				
                StringBuilder str = new StringBuilder();
                str.append(key).append(" =>\n");
                Vertex vtx = MetroMap.get(key);
                ArrayList<String> vtxnbrs = new ArrayList<>(vtx.nbrs.keySet());
                Collections.sort(vtxnbrs);
        
                for (String nbr : vtxnbrs) {
                    Integer distance = vtx.nbrs.get(nbr);
                    if (distance != null) {
                        str.append(String.format("\t%-30s %d km\n", nbr, distance));
                    }
                }
        
                System.out.println(str.toString());
			}
			System.out.println("\t------------------");
			System.out.println("---------------------------------------------------\n");

		}
        public String[] printCodelist() {
            System.out.println("List of all the stations along with their codes:\n");
            ArrayList<String> keys = new ArrayList<>(MetroMap.keySet());
            Collections.sort(keys);

            String[] codes = new String[keys.size()];
            Set<String> usedCodes = new HashSet<>();

            int i = 1, m = 1;
            for (int idx = 0; idx < keys.size(); idx++) {
                String key = keys.get(idx);
                String cleanName = key.split("~")[0]; // remove ~X suffix
                String[] words = cleanName.split("\\s+");
                StringBuilder code = new StringBuilder();

                // Generate initial code from initials of each word
                for (String word : words) {
                    if (!word.isEmpty() && Character.isLetterOrDigit(word.charAt(0))) {
                        code.append(Character.toUpperCase(word.charAt(0)));
                    }
                }

                // If code is too short, pad with second letter or number
                if (code.length() < 2 && cleanName.length() >= 2) {
                    code.append(Character.toUpperCase(cleanName.charAt(1)));
                }

                String originalCode = code.toString();
                int duplicateCount = 1;
                while (usedCodes.contains(code.toString())) {
                    code = new StringBuilder(originalCode + duplicateCount);
                    duplicateCount++;
                }

                usedCodes.add(code.toString());
                codes[idx] = code.toString();

                // Output formatting
                System.out.print(i + ". " + key + "\t");
                if (key.length() < (22 - m)) System.out.print("\t");
                if (key.length() < (14 - m)) System.out.print("\t");
                if (key.length() < (6 - m)) System.out.print("\t");
                System.out.println(codes[idx]);

                i++;
                if (i == (int) Math.pow(10, m)) m++;
            }

            return codes;
}

    }

   public static void main(String[] var0) {
      MetroGraph g = new MetroGraph();
      g.createMetroMap(g);
      System.out.println("\n\t\t\t****WELCOME TO THE DELHI METRO APP*****");
      BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
      ArrayList<String> keys = new ArrayList<>(g.MetroMap.keySet());
      Collections.sort(keys); // Ensure order matches with codes[]  
      while(true){
                System.out.println("\t\t\t\t~~LIST OF ACTIONS~~\n\n");
				System.out.println("1. LIST ALL THE METRO STATIONS IN THE MAP");
				System.out.println("2. SHOW THE DELHI METRO MAP");
				System.out.println("3. GET SHORTEST DISTANCE FROM A 'SOURCE' STATION TO 'DESTINATION' STATION");
				System.out.println("4. GET SHORTEST TIME TO REACH FROM A 'SOURCE' STATION TO 'DESTINATION' STATION");
				System.out.println("5. GET SHORTEST PATH (DISTANCE WISE) TO REACH FROM A 'SOURCE' STATION TO 'DESTINATION' STATION");
				System.out.println("6. GET SHORTEST PATH (TIME WISE) TO REACH FROM A 'SOURCE' STATION TO 'DESTINATION' STATION");
				System.out.println("7. EXIT THE MENU");
				System.out.print("\nENTER YOUR CHOICE FROM THE ABOVE LIST (1 to 7) : ");
                int choice = -1;
                try{
                    choice = Integer.parseInt(inp.readLine());
                }
                catch(Exception e){
                    System.out.println("⚠️ Invalid input! Please enter a number between 1 and 7.");
                    continue; // skip this iteration of the loop and ask again
                    
                }
                if (choice < 1 || choice > 7) {
                    System.out.println("❌ Please enter a number between 1 and 7.");
                    continue; // again, back to menu
                }
                System.out.println("\n***********************************************************\n");
				switch (choice) {
                    case 1:
                        g.displayStations();
                        break;
                    case 2:
                        g.displayMap();
                        break;
                    case 3:
                        
                        String [] codes = g.printCodelist();
                        System.out.println("\n1. TO ENTER SERIAL NO. OF STATIONS");
                        System.out.println("2. TO ENTER CODE OF STATIONS");
                        System.out.println("3. TO ENTER NAME OF STATIONS");
                        System.out.print("ENTER YOUR CHOICE: ");
                        int localChoice = -1;
                        try{
                            localChoice = Integer.parseInt(inp.readLine().trim());
                        }
                        catch(Exception e){
                            System.out.println("⚠️ INVALID INPUT ! Please enter a number from 1 to 3.");
                            break; // Exit the case block
                        }
                        String start = "";
                        String end = "";
                        System.out.println("ENTER THE SOURCE AND DESTINATION METRO STATIONS");
                        switch (localChoice) {
                            case 1:
                            int sourceIdx = -1;
                            int destIdx = -1;
                            try{
                                System.out.print("Enter SOURCE serial number: ");
                                sourceIdx = Integer.parseInt(inp.readLine().trim());
                                System.out.print("Enter DESTINATION serial number: ");
                                destIdx = Integer.parseInt(inp.readLine().trim());
                            }
                            catch(Exception e){
                                System.out.println("⚠️ Invalid input! Please enter a number from 1 to 3.");
                                break; // Exit the case block
                            }
                            
                                // Adjusting for 0-based index
                            if (sourceIdx < 1 || sourceIdx > codes.length || destIdx < 1 || destIdx > codes.length) {
                                System.out.println("❌ Invalid serial numbers entered.");
                                break;
                            }
                            if(sourceIdx == destIdx){
                                System.out.println("Source and Destination Stations can't be same ");
                                break;
                            }
                             // Get the corresponding station names from keys
                            
                            start = keys.get(sourceIdx - 1);
                            end = keys.get(destIdx - 1);
                            System.out.println("✅ Source: " + start);
                            System.out.println("✅ Destination: " + end);
                            break;
                                
                            case 2:
                                System.out.println("👉 You selected: Enter by CODE.");
                                try {
                                    System.out.print("Enter SOURCE station code: ");
                                    String sourceCode = inp.readLine().trim().toUpperCase();

                                    System.out.print("Enter DESTINATION station code: ");
                                    String destCode = inp.readLine().trim().toUpperCase();
                                    if (sourceCode.isEmpty() || destCode.isEmpty()) {
                                        System.out.println("⚠️ Station codes cannot be empty.");
                                        break;
                                    }
                                    

                                    int sourceIdx2 = -1, destIdx2 = -1;
                                    for (int i = 0; i < codes.length; i++) {
                                        if (codes[i].equals(sourceCode)) sourceIdx2 = i;
                                        if (codes[i].equals(destCode)) destIdx2 = i;
                                    }

                                    if (sourceIdx2 == -1 || destIdx2 == -1) {
                                        System.out.println("❌ One or both station codes are invalid.");
                                        break;
                                    }

                                    start = keys.get(sourceIdx2);
                                    end = keys.get(destIdx2);
                                    if(start.equals(end)){
                                        System.out.println("⚠️ Source and destination stations cannot be the same.");
                                        break;
                                    }

                                    
                                    System.out.println("✅ Source: " + start);
                                    System.out.println("✅ Destination: " + end);
                                    break;

                                    } catch (Exception e) {
                                        System.out.println("⚠️ Invalid input! Please enter valid codes like 'RC', 'ND', etc.");
                                        break;
                                    }
                            case 3:
                                System.out.println("👉 You selected: Enter by NAME.");
                                try {
                                    System.out.print("Enter SOURCE station name: ");
                                    String sourceName = inp.readLine().trim();

                                    System.out.print("Enter DESTINATION station name: ");
                                    String destName = inp.readLine().trim();

                                    if (sourceName.equalsIgnoreCase(destName)) {
                                        System.out.println("⚠️ Source and destination stations cannot be the same.");
                                        break;
                                    }

                                    String sourceFullKey = null, destFullKey = null;

                                    for (String key : keys) {
                                        if (key.split("~")[0].equalsIgnoreCase(sourceName)) {
                                            sourceFullKey = key;
                                        }
                                        if (key.split("~")[0].equalsIgnoreCase(destName)) {
                                            destFullKey = key;
                                        }
                                    }

                                    if (sourceFullKey == null || destFullKey == null) {
                                        System.out.println("❌ One or both station names are invalid.");
                                        break;
                                    }

                                    start = sourceFullKey;
                                    end = destFullKey;

                                    System.out.println("✅ Source: " + start);
                                    System.out.println("✅ Destination: " + end);

                                } catch (Exception e) {
                                    System.out.println("⚠️ Invalid input! Please enter proper station names like 'Rajiv Chowk'.");
                                }
                                break;

                            default:
                                System.out.println("❌ Invalid choice. Please enter 1, 2 or 3.");
                                break;
                        }
                        
				        

                        break;
                    case 4:
                        System.out.println("🚧 Feature: Shortest Time - Not yet implemented.");
                        break;
                    case 5:
                        System.out.println("🚧 Feature: Shortest Distance Path - Not yet implemented.");
                        break;
                    case 6:
                        System.out.println("🚧 Feature: Shortest Time Path - Not yet implemented.");
                        break;
                    case 7:
                        System.out.println("✅ Exiting the Delhi Metro App. Thank you for using it!");
                        return;
                }

                

      }

   }
}
