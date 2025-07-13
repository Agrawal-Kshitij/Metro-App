// Source code is decompiled from a .class file using FernFlower decompiler.

import java.util.HashMap;

public class FirstCode {
    public static class Graph_M{
        public static class Vertex{
            HashMap<String , Integer> nbrs = new HashMap<>();
        }
        static HashMap<String, Vertex> MetroMap;
        public Graph_M(){
            MetroMap = new HashMap<>();
        }
    }

   public static void main(String[] var0) {
      System.out.println("Hii");
      Graph_M g = new Graph_M();
   }
}
