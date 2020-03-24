package com.school.util;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by TCHYARICI on 03/24/2020
 */
public class FileUtil {

	public static String readFile(File file) {
		String line="";
		String icerik="";
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null)
				icerik += "\\n" + line;
		} catch (Exception ex){
			ex.printStackTrace();
		}
		return icerik;
	}

}
