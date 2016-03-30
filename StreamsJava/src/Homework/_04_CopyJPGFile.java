package Homework;

import com.sun.xml.internal.ws.encoding.MtomCodec;
import com.sun.xml.internal.ws.util.ByteArrayBuffer;
import jdk.nashorn.internal.ir.WhileNode;
import sun.misc.IOUtils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by xxx on 3/24/2016.
 */
public class _04_CopyJPGFile {
    public static void main(String[] args) throws IOException {

        try {

            BufferedImage originalImage = ImageIO.read(new File(
                    "D:\\Coding\\JAVA\\Homework\\StreamsJava\\src\\Homework\\picture.jpg"));

            ImageIO.write(originalImage, "jpg", new File(
                    "D:\\Coding\\JAVA\\Homework\\StreamsJava\\src\\Homework\\my-copied-picture.jpg"));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }


}

