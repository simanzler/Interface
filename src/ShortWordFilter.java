public class ShortWordFilter implements Filter{

    @Override
    public boolean accept(Object x) {
        if (x.toString().length()<5){
            return true;
        } else { return false; }
    }
}