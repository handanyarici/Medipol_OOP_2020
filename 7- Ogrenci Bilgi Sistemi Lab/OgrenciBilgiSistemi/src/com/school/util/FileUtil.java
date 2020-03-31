package com.school.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by TCHYARICI on 03/24/2020
 */
public class FileUtil {

	public static String readFile(File file, boolean isHeader) {
		String line = "";
		StringBuilder icerik = new StringBuilder();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null) {
				if (!isHeader) {
					icerik.append(line);
					icerik.append(System.getProperty("line.separator"));
				} else {
					isHeader = false;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return icerik.toString();
	}

	public static void writeFile(File file, String content) throws IOException {
		PrintWriter outputStream = null;
		try {
			outputStream = new PrintWriter(new FileWriter(file));
			String[] satirlar = content.split(System.lineSeparator());
			for (int i = 0; i < satirlar.length; i++) {
				//dosyaya yazdırma
				outputStream.println(satirlar[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}

}
