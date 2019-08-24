package com.neuedu.java0816;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Test11 {
	public static void main(String[] args) {
		try {
			InputStream is=new FileInputStream(new File("ada"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
