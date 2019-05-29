public abstract class Stage {
    protected int length;
    protected String description;
    protected static volatile boolean isWinner = false;
    protected boolean lastStage;

    public String getDescription() {
        return description;
    }

    public Stage setLastStage(boolean lastStage){
        this.lastStage = lastStage;

        return this;
    }

    public synchronized void setWinner(Car car){
        if (!isWinner && lastStage) {
            System.out.println(car.getName() + " WIN!!!");
            isWinner = true;
        }
    }

    public abstract void go(Car c);
}