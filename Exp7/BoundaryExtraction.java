package Exp7;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class BoundaryExtraction {
    public static void main(String[] args) {
        try{
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            Mat source = Imgcodecs.imread("C:\\Users\\Vaibhav\\IdeaProjects\\Image Processing\\src\\Exp7\\input.png", Imgcodecs.IMREAD_GRAYSCALE);
            Mat kernel = Imgproc.getStructuringElement(Imgproc.MORPH_RECT, new Size(5, 5));
            Mat destination = new Mat(source.rows(), source.cols(), source.type());
            Imgproc.erode(source,destination, kernel);

            Mat boundary = new Mat(source.rows(), source.cols(), source.type());

            Core.absdiff(destination,source, boundary);

            Imgcodecs.imwrite("C:\\Users\\Vaibhav\\IdeaProjects\\Image Processing\\src\\Exp7\\output.png", boundary);
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
