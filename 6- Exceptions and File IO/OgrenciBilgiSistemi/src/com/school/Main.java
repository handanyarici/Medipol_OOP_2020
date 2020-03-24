package com.school;

import com.school.util.FileUtil;

import java.io.File;

/**
 * Created by TCHYARICI on 03/24/2020
 */
public class Main {
	public static void main(String args[]){
		File file = new File("D:\\medipol\\java oop\\w7\\OgrenciBilgiSistemi\\src\\com\\school\\ogrenciler.csv");
		String icerik = FileUtil.readFile(file);
		System.out.println(icerik);
	}
}
