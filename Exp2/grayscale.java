package Exp2;

import java.awt.*;

import java.awt.image.BufferedImage;

import java.io.*;

import javax.imageio.ImageIO;


public class grayscale {



    BufferedImage  image;

    int width;

    int height;



    public grayscale() {



        try {

            File input = new File("C:\\Users\\Vaibhav\\IdeaProjects\\Image Processing\\src\\Exp2\\image.jpg");

            image = ImageIO.read(input);

            width = image.getWidth();

            height = image.getHeight();

            System.out.println(width);

            System.out.println(height);



            for(int i=0; i<height; i++) {



                for(int j=0; j<width; j++) {



                    Color c = new Color(image.getRGB(j, i));

                    int red = (int)(c.getRed() * 0.6);

                    int green = (int)(c.getGreen() * 0);

                    int blue = (int)(c.getBlue() * 0.5);

                    Color newColor = new Color(red+green+blue,



                            red+green+blue,red+green+blue);



                    image.setRGB(j,i,newColor.getRGB());

                }

            }



            File ouptut = new File("C:\\Users\\Vaibhav\\IdeaProjects\\Image Processing\\src\\Exp2\\greyscale.jpg");

            ImageIO.write(image, "jpg", ouptut);



        } catch (Exception e) {}

    }

    static public void main(String args[]) throws Exception {

        grayscale obj = new grayscale();

    }

}