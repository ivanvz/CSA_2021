package Ch10_Ch11.labs.TransRowCol;

public class My2dArrFlipityFlip {
    public static void main(String[] args) {
        int[][] MyArrToFlip = {
                {4, 5, 6},
                {42, 52, 6}
        };

        System.out.print("OG Array:\n");
        FlipFlip.PrintArr(MyArrToFlip);

        System.out.print("\n");

        System.out.print("FlipFlip:\n");
        FlipFlip.SwitchArr(MyArrToFlip);


//        everything below is useless
        System.out.print("\nI got bored.\n");
        Smile.picard();
    }
}