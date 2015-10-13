/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routes;

import java.util.List;
import paths.Node;
import paths.Path;
import vehicles.*;

/**
 *
 * @author ianwa_000
 */
public class Road{
    MotorVehicle allowedTypes;
    List<Path> pathList;
    
    public Road (Node startNode, Node endNode) {
        Path path1 = new Path(1, allowedTypes, startNode, endNode);
        Path path2 = new Path(1, allowedTypes, endNode, startNode);
        pathList.add(path1);
        pathList.add(path2);
    }
}
