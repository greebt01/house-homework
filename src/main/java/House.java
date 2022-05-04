import java.lang.reflect.Array;
import java.util.ArrayList;

public class House extends Building{
    private ArrayList<Room> rooms;

    public House(){
        this.rooms=new ArrayList<Room>();
    }
    public void addRoom(Room room){
        rooms.add(room);
    }
}
