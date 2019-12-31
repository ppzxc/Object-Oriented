package personal.oop.practice2.factorypattern.intf;

public abstract class Door {
    private DoorStatus doorStatus;
    public Door(){ doorStatus = DoorStatus.CLOSED ;}
    public DoorStatus getDoorStatus() { return doorStatus ;}

    protected abstract  void doClose();

    public void close(){

        if(doorStatus == DoorStatus.CLOSED ){
            return;
        }
        doClose();
        doorStatus = DoorStatus.CLOSED;
    }

    protected abstract void doOpen();

    public void open(){

        if(doorStatus == DoorStatus.OPEN) {
            return;
        }
        doOpen();
        doorStatus = DoorStatus.OPEN;
    }

}