import greenfoot.*;

public class Snake extends Actor {
    public Snake(boolean head) {
        GreenfootImage image;
        if (head) {
            image = new GreenfootImage("snakehead.png");
        } else {
            image = new GreenfootImage("snakebody.png");
        }
        // Ubah ukuran gambar menjadi setengah dari ukuran aslinya
        image.scale(image.getWidth()/6, image.getHeight()/6);
        setImage(image);
    }
}
