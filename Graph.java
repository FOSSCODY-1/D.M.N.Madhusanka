
import java.util.LinkedList;
import java.util.LinkedHashMap;

public class Graph{
    
    private LinkedHashMap<String,LinkedList<Node>> hm=new LinkedHashMap<String,LinkedList<Node>>(); 
    
    public static void main(String []args){
        Graph g=new Graph();
        g.init();
    }
    
    private void init(){
        
        LinkedList<Node> l1=new LinkedList<Node>();//create linked list
        Node node2=new Node("2",4);//create node
        Node node3=new Node("3",5);//create node
        l1.add(node2);//first child node to 1
        l1.add(node3);//second child node to 1
        hm.put("1",l1);//addes this linked list to "1"
        //System.out.println(hm);
        
        LinkedList<Node> l2=new LinkedList<Node>();
        Node node4=new Node("3",2);
        Node node5=new Node("4",3);
        l2.add(node4);
        l2.add(node5);
        hm.put("2",l2);
        //System.out.print(hm);
        
        LinkedList<Node> l3=new LinkedList<Node>();
        Node node6=new Node("4",2);
        //Node node5=new Node("5",3);
        l2.add(node6);
        //l2.add(node5);
        hm.put("3",l2);
        //System.out.print(hm);
        
        print();//print the graph
    }
    private class Node{
        private String name;
        private int cost;
        
        public Node(String name,int cost){
            this.name=name;
            this.cost=cost;
        }
        
        public String toString(){
            return "Node:"+ name + " cost:" + cost;
        }
    }
    
    private void print(){
         hm.forEach((key, value) -> System.out.println(key + " ==> " + value));

    }
}