package Exp1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class crop {

    public static void main(String[] args)
    {

        try {

            BufferedImage originalImg = ImageIO.read(
                    new File("C:\\Users\\Vaibhav\\IdeaProjects\\Image Processing\\src\\Exp1\\image.jpg"));

            System.out.println("Original Image Dimension: "
                    + originalImg.getWidth()
                    + "x"
                    + originalImg.getHeight());
            BufferedImage SubImg
                    = originalImg.getSubimage(100, 50, 1000, 1000);

            System.out.println("Cropped Image Dimension: "
                    + SubImg.getWidth() + "x"
                    + SubImg.getHeight());
            File outputfile
                    = new File("C:\\Users\\Vaibhav\\IdeaProjects\\Image Processing\\src\\Exp1\\ImageCropped.jpg");

            ImageIO.write(SubImg, "png", outputfile);

            System.out.println(
                    "Cropped Image created successfully");
        }
        catch (IOException e) {

            e.printStackTrace();
        }
    }
}
