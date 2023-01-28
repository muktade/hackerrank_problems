package test.hacker.math.findpoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindPoint {
    public static List<Integer> print(int px, int py, int qx, int qy) {
        List<Integer> poList=new ArrayList<>();
        int x,y;
        if(px>qx){
            x=2*px-qx;
            y=2*py-qy;
            poList.add(x);
            poList.add(y);
        }else {
            x=2*qx-px;
            y=2*qy-py;
            poList.add(x);
            poList.add(y);
        }
        return poList;
    }
}
