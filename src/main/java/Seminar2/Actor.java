package Seminar2;

public abstract class Actor implements ActorBehaviour {

    private final String name;
    private final String sex;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }
    public Actor(String name) {
        this.name = name;
        this.sex = "";
    }

    public String getName(){
        return this.name;
    }

    public String getSex() {
        return sex;
    }
}
