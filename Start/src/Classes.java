
public class Classes {
    public static void main(String[] args) {
        Class2 desk = new Class2();
        desk.setLength(3);
        desk.setWidth(4);
        int newWidth = desk.getWidth();
        int newLength = desk.getLength();
        int newArea = desk.getArea();
        System.out.println("Length = " + newLength + "\n"
                           + "Width = " + newWidth + "\nNew Area = " + newArea
        );
    }
}












