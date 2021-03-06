package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable{

    private List<Movable> group = new ArrayList<Movable>();
    
    @Override
    public String toString(){
        String groupedCoordinates = "";
        for(Movable movable : group){
            groupedCoordinates += movable.toString() + "\n";
        }
        return groupedCoordinates;
    }
    
    public void addToGroup(Movable movable){
        group.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable movable : group){
            movable.move(dx, dy);
        }
    }
    
}
