public class Compostion {
    //house has rooms
    static class Room{
        void showRoom(){
            System.out.println("This is a room");
        }
    }

    static class House{
        Room room ;
        House(){       //object creation of room 
            room=new Room();
        }
        void showHouse(){
            System.out.println("This is a house");
            room.showRoom();     //house k andar room ka method call kar rahe hain
        }
    }

    public static void main(String[] args) {
        House h = new House();
        h.showHouse();
    }
}
