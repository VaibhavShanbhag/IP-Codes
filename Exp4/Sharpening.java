package Exp4;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class Sharpening {
    public static void main( String[] args ) {
        try {
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            Mat source = Imgcodecs.imread(
                    "C:\\Users\\Vaibhav\\IdeaProjects\\Image Processing\\src\\Exp4\\input.png", Imgcodecs.IMREAD_ANYCOLOR);

            Mat destination = new Mat(source.rows(), source.cols(), source.type());
            Imgproc.GaussianBlur(source, destination, new Size(0, 0), 10);
            Core.addWeighted(source, 1.5, destination, -0.5, 0, destination);
            Imgcodecs.imwrite("C:\\Users\\Vaibhav\\IdeaProjects\\Image Processing\\src\\Exp4\\output.jpg", destination);
        }
        catch (Exception e) {
            System.out.print("Exception/s Occurred");
        }
    }
}
