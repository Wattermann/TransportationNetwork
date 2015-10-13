/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routes;

import java.util.List;
import paths.Path;
import vehicles.*;

/**
 *
 * @author ianwa_000
 */
public class Road{
    MotorVehicle allowedTypes;
    List<Path> pathList;
    public Road () {
        Path path1 = new Path(1, allowedTypes);
        Path path2 = new Path(1, allowedTypes);
        pathList.add(path1);
        pathList.add(path2);
    }
}
