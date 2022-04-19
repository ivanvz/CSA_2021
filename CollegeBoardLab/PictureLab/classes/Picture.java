package CollegeBoardLab.PictureLab.classes;

import java.awt.image.BufferedImage;

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }

  public void zeroGreen()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(0);
      }
    }
  }

  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }

  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
    for (int col = 0; col < pixels.length; col++)
    {
      for (int row = 0; row < width / 2; row++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[row][width - 1 - col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
  }

  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }

  public void mirrorDiagonal() // mirrors from top right to bottom left
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topRightPixel = null;
    Pixel bottomLeftPixel = null;
    int fullLength;
    if (pixels.length < pixels[0].length) { fullLength = pixels.length; }
    else {
      fullLength = pixels[0].length; }

    for (int row = 0; row < fullLength; row++)
    {
      for (int col = row; col < fullLength; col++)
      {
        topRightPixel = pixels[row][col];
        bottomLeftPixel = pixels[col][row];
        bottomLeftPixel.setColor(topRightPixel.getColor());
      }
    }
  }

  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
//    * @param startRow the start row to copy to
//    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic,
                 int fromStartRow, int fromStartCol, int fromEndRow, int fromEndCol, int toStartRow, int toStartCol) {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();

    for (int fromRow = 0, toRow = fromStartRow;
         fromRow < fromPixels.length &&
                 toRow < toPixels.length;
         fromRow++, toRow++) {
      for (int fromCol = 0, toCol = fromStartCol;
           fromCol < fromPixels[0].length &&
                   toCol < toPixels[0].length;
           fromCol++, toCol++) {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }
  }

  public void copyPartial(Picture fromPic, int startRow, int startCol,
                          int fromRowStart, int fromColStart, int fromRowEnd, int fromColEnd)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    if (fromRowStart < 0 || fromRowStart > fromPixels.length) {
      fromRowStart = 0;
    }
    if (fromColStart < 0 || fromColStart > fromPixels[0].length) {
      fromColStart = 0;
    }
    if (fromRowEnd < 0 || fromRowEnd > fromPixels.length) {
      fromRowEnd = fromPixels.length;
    }
    if (fromColEnd < 0 || fromColEnd > fromPixels[0].length) {
      fromColEnd = fromPixels[0].length;
    }
    for (int fromRow = fromRowStart, toRow = startRow; fromRow < fromRowEnd
            && toRow < toPixels.length; fromRow++, toRow++)
    {
      for (int fromCol = fromColStart, toCol = startCol; fromCol < fromColEnd
              && toCol < toPixels[0].length; fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }
  }

  public void copy(Picture fromPic,
                   int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow;
         fromRow < fromPixels.length &&
                 toRow < toPixels.length;
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol;
           fromCol < fromPixels[0].length &&
                   toCol < toPixels[0].length;
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("/Users/ivanzhivaga/OneDrive/Documents/12th Grade/CompSci/IntelliJTest/src/CollegeBoardLab/PictureLab/images/flower1.jpg");
    Picture flower2 = new Picture("/Users/ivanzhivaga/OneDrive/Documents/12th Grade/CompSci/IntelliJTest/src/CollegeBoardLab/PictureLab/images/flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    this.copy(flower2,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);

    this.copy(flower2, 0, 100);
    this.copy(flower1, 0, 200);
    this.copy(flower2, 0, 300);
    this.copy(flower1, 0, 400);

    this.copy(flower2, 500, 100);
    this.copy(flower1, 500, 200);
    this.copy(flower2, 500, 300);
    this.copy(flower1, 500, 400);
    this.mirrorVertical();
    this.write("collage.jpg");
  }


  /** Method to show large changes in color 
//    * @param edgeDist the distance for finding edges
    */

  public void edgeDetect()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; col < pixels[0].length; col++)
      {
        if(Math.abs(pixels[row+1][col].getAverage() - pixels[row][col].getAverage()) >= 20)
        {
          pixels[row][col].setBlue(0);
          pixels[row][col].setGreen(0);
          pixels[row][col].setRed(0);
        }
        else
        {
          pixels[row][col].setBlue(255);
          pixels[row][col].setGreen(255);
          pixels[row][col].setRed(255);
        }
      }
    }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
//    Picture beach = new Picture("beach.jpg");
    //beach.explore();
    //beach.zeroBlue();
//    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
