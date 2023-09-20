import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args){
        ArrayList<Rectangle> RectList = new ArrayList<>();
        RectList.add(new Rectangle(2,3));
        RectList.add(new Rectangle(4,3));
        RectList.add(new Rectangle(2,6));
        RectList.add(new Rectangle(2,1));
        RectList.add(new Rectangle(1,1));
        RectList.add(new Rectangle(2,4));
        RectList.add(new Rectangle(2,2));
        RectList.add(new Rectangle(2,0));
        RectList.add(new Rectangle(3,3));
        RectList.add(new Rectangle(8,3));

        BigRectangleFilter filter = new BigRectangleFilter();

        for (Rectangle rect:
             RectList) {
            if(filter.accept(rect)==true){
                System.out.println("Height: " + rect.getHeight() + "  Width: " + rect.getWidth());
            }

        }
    }
}
