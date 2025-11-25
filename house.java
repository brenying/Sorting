package week.pkg8.sorting;

public class house implements style,Comparable<house>
{
    private Integer width, length, floors;
    private String type, color;
    
    public Integer getWidth() { return width; }
    public Integer getLength() { return length; }
    public Integer getFloors() { return floors; }
    public Integer getSqft() { return getWidth() * getLength() * getFloors(); }
    public String getType() { return type; }
    public String getColor() { return color; }
    
    public void setWidth(Integer w) { width = w; }
    public void setLength(Integer l) { length = l; }
    public void setFloors(Integer f) { floors = f; }
    public void setType(String t) { type = t; }
    public void setColor(String c) { color = c; }
    
    @Override
    public int compareTo(house h)
    {
        if(getSqft() > h.getSqft()) { return 1; }
        else if (getSqft() < h.getSqft()) { return -1; }
        else {return 0; }
    }
    
    @Override
    public String toString() { return getStyle() + " " + getSqft() + "ft^2"; }
    
    @Override
    public String getStyle() { return getColor() + " " + getType(); }
    
    public house(Integer w, Integer l, Integer f, String t, String c)
    {
        setWidth(w);
        setLength(l);
        setFloors(f);
        setType(t);
        setColor(c);
    }
}
