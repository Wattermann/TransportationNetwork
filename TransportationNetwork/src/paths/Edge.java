/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paths;

/**
 *
 * @author ianwa_000
 */
public class Edge {
    private int weight;
    public Node startNode,endNode;
    
    public Edge(Node start, Node end) {
        this.startNode = start;
        this.endNode = end;
    }
    
    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
