package image;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import javax.imageio.ImageIO;



/**
 * Classe de manipulation d'images
 *
 *
 * Exemple d'image 2D:
 *
 *                                                              width = number of columns
 *           -------------------------- i ------------------------------>  width = 10
 *           0     1     2     3     4     5     6     7     8     9
 *        |-----------------------------------------------------------|
 *        |     |     |     |     |     |     |     |     |     |     |
 *   | 0  |  0  |  0  |  2  | 23  | 67  | 86  | 54  |  7  |  0  |  0  |
 *   |    |     |     |     |     |     |     |     |     |     |     |
 *   |    |-----------------------------------------------------------|
 *   |    |     |     |     |     |     |     |     |     |     |     |
 *   | 1  |  0  |  0  | 29  | 69  | 108 | 139 | 177 | 144 |  8  |  0  |
 *   |    |     |     |     |     |     |     |     |     |     |     |
 *   |    |-----------------------------------------------------------|
 *   |    |     |     |     |     |     |     |     |     |     |     |
 *   | 2  |  0  |  2  |  36 | 68  | 107 | 138 | 177 | 207 | 74  |  0  |
 *   |    |     |     |     |     |     |     |     |     |     |     |
 *   |    |-----------------------------------------------------------|
 *   |    |     |     |     |     |     |     |     |     |     |     |
 *   | 3  |  0  |  2  | 36  | 67  | 106 | 137 | 119 | 186 | 146 |  0  |
 *   j    |     |     |     |     |     |     |     |     |     |     |
 *        |-----------------------------------------------------------|
 *   |    |     |     |     |     |     |     |     |     |     |     |
 *   | 4  |  0  |  2  |  34 | 65  | 105 | 136 |  3  | 143 | 146 |  0  |
 *   |    |     |     |     |     |     |     |     |     |     |     |
 *   |    |-----------------------------------------------------------|
 *   |    |     |     |     |     |     |     |     |     |     |     |
 *   | 5  |  0  |  1  |  33 | 65  | 103 | 134 | 173 | 204 | 73  |  0  |
 *   |    |     |     |     |     |     |     |     |     |     |     |
 *   |    |-----------------------------------------------------------|
 *   |    |     |     |     |     |     |     |     |     |     |     |
 *   | 6  |  0  |  0  |  25 | 63  | 102 | 133 | 171 | 140 |  8  |  0  |
 *   |    |     |     |     |     |     |     |     |     |     |     |
 *   |    |-----------------------------------------------------------|
 *   |    |     |     |     |     |     |     |     |     |     |     |
 *   | 7  |  0  |  0  |  2  |  21 |  62 |  81 |  51 |  7  |  0  |  0  |
 *   |    |     |     |     |     |     |     |     |     |     |     |
 *  \|/   |-----------------------------------------------------------|
 * height = number of lines
 * height = 8
 *
 * @author Celine Fouard
 *
 *
 **/

public class Image {

	private int width;
	private int height;
	private char[][] image;

	public Image() {
		this.width = 10;
		this.height = 8;

		char[][] tmp = { {  0,  0,  2, 23, 67, 86, 54,  7,  0,  0 },
						 {  0,  0, 29, 69,108,139,177,144,  8,  0 },
						 {  0,  2, 36, 68,107,138,177,207, 74,  0 },
						 {  0,  2, 36, 67,106,137,119,186,146,  0 },
						 {  0,  2, 34, 65,105,136,  3,143,146,  0 },
						 {  0,  1, 33, 65,103,134,173,204, 73,  0 },
						 {  0,  0, 25, 63,102,133,171,140,  8,  0 },
						 {  0,  0,  2, 21, 62, 81,  51, 7,  0,  0 } };
		this.image = tmp;
	}

	public Image(int width, int height) {
		this.width = width;
		this.height = height;
		this.image = new char[height][width];
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	/* ************************************************************************* */
	/*                                                                           */
	/* Méthodes d'entrée / sortie */
	/*                                                                           */
	/* ************************************************************************* */
	public static Image open(String filename) {
		Image result;
		File f;
		int width, height;

		// Initializations
		result = null;
		f = new File(filename);

		try {
			BufferedImage img = ImageIO.read(f);
			width = img.getWidth();
			height = img.getHeight();
			result = new Image(width, height);
			DataBuffer buff = img.getRaster().getDataBuffer();
			for (int j = 0; j < height; j++) {
				for (int i = 0; i < width; i++) {
					result.image[j][i] = (char) buff.getElem(i + width * j);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return result;
	}

	public void save(String filename) {
		File f;

		f = new File(filename);
		BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
		// Copy the image in the buffer
		DataBuffer buff = (img.getRaster()).getDataBuffer();
		for (int j = 0; j < height; j++) {
			for (int i = 0; i < width; i++) {
				int k = i + width * j;
				buff.setElem(k, image[j][i]);
			}
		}
		try {
			ImageIO.write(img, "png", f);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


	/* ************************************************************************* */
	/*                                                                           */
	/* Méthodes à compléter                                                      */
	/*                                                                           */
	/* ************************************************************************* */

	public char getMin() {
		char min; 
		min= 255;
		for(int i=0; i<=height-1 ;i++){
			for(int j =0; j<=width-1; j++ ){	
				if(image[i][j] < min){
					min =image[i][j];
				}
			}

		}
		return min;
	}

	public char getMax() {
		char max; 
		max= 0;
		for(int i=0; i<=height-1 ;i++){
			for(int j =0; j<=width-1; j++ ){	
				if(image[i][j] > max){
					max =image[i][j];
				}
			}

		}
		return max;
	}

	public int[] getHistogramme() {
		int[] histo;
		histo = new int[256];
		for (int k= 0; k <= 255; k++){
			histo[k] = 0;
		}


		for(int i=0; i<=height-1 ;i++){
			for(int j =0; j<=width-1; j++ ){		 
				histo[image[i][j]] +=1;
			}
		}
		
		return histo;
	}

    public void etireContraste() {
		int min =getMin();
		int max=getMax();
		int div =max - min;
		for(int i=0; i<=height-1 ;i++){
			for(int j =0; j<=width-1; j++ ){		 
				image[i][j] = (char) (((image[i][j] - min)*255)/div);
			}
		}
	}

}
