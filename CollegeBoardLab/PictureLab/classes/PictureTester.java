package CollegeBoardLab.PictureLab.classes;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("/Users/ivanzhivaga/OneDrive/Documents/12th Grade/CompSci/IntelliJTest/src/CollegeBoardLab/PictureLab/images/Beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  public static void testZeroGreen()
  {
    Picture beach = new Picture("/Users/ivanzhivaga/OneDrive/Documents/12th Grade/CompSci/IntelliJTest/src/CollegeBoardLab/PictureLab/images/Beach.jpg");
    beach.explore();
    beach.zeroGreen();
    beach.explore();
  }

  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("/Users/ivanzhivaga/OneDrive/Documents/12th Grade/CompSci/IntelliJTest/src/CollegeBoardLab/PictureLab/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  public static void testMirrorDiagonal(){
    Picture temple = new Picture("/Users/ivanzhivaga/OneDrive/Documents/12th Grade/CompSci/IntelliJTest/src/CollegeBoardLab/PictureLab/images/Swan.jpg");
    temple.explore();
    temple.mirrorDiagonal();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("/Users/ivanzhivaga/OneDrive/Documents/12th Grade/CompSci/IntelliJTest/src/CollegeBoardLab/PictureLab/images/7inX95in.jpg");
    canvas.explore();
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("/Users/ivanzhivaga/OneDrive/Documents/12th Grade/CompSci/IntelliJTest/src/CollegeBoardLab/PictureLab/images/swan.jpg");
    swan.edgeDetect();
    swan.explore();
  }

//  public static void testCopy(){
//    Picture passthrough = new Picture("/Users/ivanzhivaga/OneDrive/Documents/12th Grade/CompSci/IntelliJTest/src/CollegeBoardLab/PictureLab/images/KatieFancy.jpg");
//    Picture katie = new Picture("/Users/ivanzhivaga/OneDrive/Documents/12th Grade/CompSci/IntelliJTest/src/CollegeBoardLab/PictureLab/images/7inX95in.jpg");
//    katie.copy(passthrough, 0, 0, 200, 200, 200, 200);
//  }

  public static void testCopyPartial(){
    Picture katie = new Picture("/Users/ivanzhivaga/OneDrive/Documents/12th Grade/CompSci/IntelliJTest/src/CollegeBoardLab/PictureLab/images/KatieFancy.jpg");
    Picture passthrough = new Picture("/Users/ivanzhivaga/OneDrive/Documents/12th Grade/CompSci/IntelliJTest/src/CollegeBoardLab/PictureLab/images/7inX95in.jpg");

    katie.explore();
    katie.copyPartial(passthrough, 0, 0, 200, 200, 400, 400);
    katie.explore();
  }

  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
//    testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
//    testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
//    testMirrorDiagonal();
    testCollage();
//    testCopy();
//    testCopyPartial();
//    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}