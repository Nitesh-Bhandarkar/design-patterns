package behavioural.memento;

public class Creator {
    private int count;

    public Creator() {
        this.count = 0;
    }

    public Creator(int count) {
        this.count = count;
    }

    public void updateCounter(){
        count++;
    }

    public int getCount() {
        return count;
    }

    public Memento createMemento(){
        return new Memento(new Creator(this.count));
    }

    public void updateState(Memento memento){
        Creator creator = (Creator)memento.getSnapShot();
        this.count = creator.count;
    }
}
