package Exp6;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class Opening_Closing {
    public static void main(String[] args) {
        try {
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            String file = "C:\\Users\\Vaibhav\\IdeaProjects\\Image Processing\\src\\Exp6\\input.png";
            Mat src = Imgcodecs.imread(file);
            Mat dst = new Mat(src.rows(), src.cols(), src.type());
            Mat dst1 = new Mat(src.rows(), src.cols(), src.type());
            Mat kernel = Mat.ones(5, 5, CvType.CV_32F);
            Imgproc.morphologyEx(src, dst, Imgproc.MORPH_OPEN, kernel);
            Imgproc.morphologyEx(src,dst1,Imgproc.MORPH_CLOSE,kernel);
            Imgcodecs.imwrite("C:\\Users\\Vaibhav\\IdeaProjects\\Image Processing\\src\\Exp6\\opening.png", dst);
            Imgcodecs.imwrite("C:\\Users\\Vaibhav\\IdeaProjects\\Image Processing\\src\\Exp6\\closing.png", dst1);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
