/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paths;

import vehicles.*;

/**
 *
 * @author ianwa_000
 */
public class Path<T> extends Edge{
    public T allowedTypes;
    private byte lanes;
    
    public Path(int numLanes, T allowed, Node startNode, Node endNode) {
        super(startNode,endNode);
        lanes = (byte)numLanes;
        allowedTypes = allowed;
    }
}
