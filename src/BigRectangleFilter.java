import java.awt.*;

public class BigRectangleFilter implements Filter {

    @Override
    public boolean accept(Object x) {
        Rectangle rect = new Rectangle();
        rect = (Rectangle) x;
        double perimeter = rect.getHeight()*2 + rect.getWidth()*2;
        if (perimeter>10) {
            return true;
        } else { return false; }
    }
}
