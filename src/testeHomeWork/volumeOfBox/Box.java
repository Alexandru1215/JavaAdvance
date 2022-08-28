package testeHomeWork.volumeOfBox;

import java.util.Scanner;

public class Box {
    public static int volumeOfBox(int[] sizes) {
        int vol = 1;
		for(int i =0; i< sizes.length;i++){
			vol *=sizes[i];
		}
        return vol;
    }
} 