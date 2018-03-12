package Prototype;

public abstract class Shape implements Cloneable {

    protected String type;
    private String id;

    public abstract void draw();

    public String getType() {
        return this.type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
