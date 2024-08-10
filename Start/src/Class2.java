

/**
 * This class take length and width and displays it
 * width and calculate the area
 */
public class Class2 {
    private int length;
    private int width;
    private int Area;
    // The Methods to set parameters
    /**
     * This method is used to set length
     */
    public void setLength(int length){
        this.length = length;
    }
    /**
     * This method is used to set width
     */
    public void setWidth(int width){
        this.width = width;
    }
    //   The Methods to get length and width
    /**
     * This method is used to get length
     */
    public void setArea(int width,int length){
        Area = length*width;
    }
    public int getLength(){
        return length;
    }
    /**
     * This method is used to get length
     */
    public int getWidth(){
        return width;
    }
    public int getArea(){
        return length*width;
    }
}
