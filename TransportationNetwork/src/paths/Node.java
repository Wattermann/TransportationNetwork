/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paths;
import java.util.List;

/**
 *
 * @author ianwa_000
 */
public class Node {
    public float x,y,z;
    public List<Path> pathList;
    
    public Node(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
