package com.helperFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader {

	public static Properties p;

	public Config_Reader() throws IOException {

		File f = new File(
				"C:\\Users\\Shakir\\eclipse-workspace\\Don\\src\\main\\java\\com\\helperFile\\confiuration.properties");
		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);
	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

	public String get_uname() {
		String uname = p.getProperty("username");
		return uname;
	}

	public String get_pass() {
		String pass = p.getProperty("password");
		return pass;
	}

}
