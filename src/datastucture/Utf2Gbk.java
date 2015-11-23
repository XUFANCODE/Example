package datastucture;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Utf2Gbk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t = "Äã»¹ºÃÂð£¿";
		String utf8;
		try {
			utf8 = new String(t.getBytes("GBK"));
			System.out.println(utf8);
			String unicode = new String(utf8.getBytes(), "GBK");
			System.out.println(unicode);
			String gbk = new String(unicode.getBytes("UTF-8"));
			System.out.println(gbk);
			File f = new File(".\\utf.txt");
			try {
				FileWriter fw = new FileWriter(f);
				BufferedWriter br = new BufferedWriter(fw);
				br.write(t);
				// while (br.write(gbk) != -1) {
				//
				// }
				br.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}
}
