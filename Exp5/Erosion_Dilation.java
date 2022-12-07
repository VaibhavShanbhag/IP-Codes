package Exp5;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class Erosion_Dilation {
    public static void main(String[] args) {
        try{
            System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
            Mat source = Imgcodecs.imread("C:\\Users\\Vaibhav\\IdeaProjects\\Image Processing\\src\\Exp5\\input.png",  Imgcodecs.IMREAD_ANYCOLOR);
            System.out.println(source);
            Mat destination = new Mat(source.rows(),source.cols(),source.type());

            destination = source;

            int erosion_size = 2;
            int dilation_size = 2;

            Mat element = Imgproc.getStructuringElement(Imgproc.MORPH_RECT, new  Size(2*erosion_size + 1, 2*erosion_size+1));
            Imgproc.erode(source, destination, element);
            Imgcodecs.imwrite("C:\\Users\\Vaibhav\\IdeaProjects\\Image Processing\\src\\Exp5\\erosion.jpg", destination);

            source = Imgcodecs.imread("C:\\Users\\Vaibhav\\IdeaProjects\\Image Processing\\src\\Exp5\\input.png",  Imgcodecs.IMREAD_ANYCOLOR);

            destination = source;

            Mat element1 = Imgproc.getStructuringElement(Imgproc.MORPH_RECT, new Size(2*dilation_size + 1, 2*dilation_size+1));
            Imgproc.dilate(source, destination, element1);
            Imgcodecs.imwrite("C:\\Users\\Vaibhav\\IdeaProjects\\Image Processing\\src\\Exp5\\dilation.jpg", destination);

        } catch (Exception e) {
            System.out.println("error:" + e.getMessage());
        }


    }
}
