public class App {

    public int calculate(int blx1, int bly1, int trx1, int try1, int blx2, int bly2, int trx2, int try2){
        int left = Math.max(blx1, blx2);
        int right = Math.min(trx1, trx2);
        int bottom = Math.max(bly1, bly2);
        int top = Math.min(try1, try2);

        if (left < right && bottom < top) {
            int overlappingArea = (right - left) * (top - bottom);
            return overlappingArea;
        }
        return 0;
    }
}
