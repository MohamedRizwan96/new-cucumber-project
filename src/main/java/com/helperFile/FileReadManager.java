package com.helperFile;

import java.io.IOException;

public class FileReadManager {

	private FileReadManager() {

	}

	public static FileReadManager getinstance_FRM() {
		FileReadManager frm = new FileReadManager();
		return frm;

	}

	public Config_Reader getinstanc_CR() throws IOException {
		Config_Reader reader = new Config_Reader();
		return reader;
	}

}
