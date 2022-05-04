public class Main {
    public static void main(String[] args) {
        var house=new House();
        var room=new Room(12.5, 12.75, 15.5, 5);
        var room2=new Room(10.5, 11.75, 14.5, 2);
        var room3=new Room(13.5, 16.75, 20.5, 7);
        house.addRoom(room);
        house.addRoom(room2);
        house.addRoom(room3);
    }
}
