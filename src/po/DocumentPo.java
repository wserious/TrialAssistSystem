package po;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DocumentPo {
	String documentType;
	ArrayList<ElementPo> elements = new ArrayList<ElementPo>();

	public DocumentPo(String documentType) {
		this.documentType = documentType;
		this.init();
		// TODO
	}

	private void init() {
		try {
			String pathname = "";
			if (documentType.equals("IndustryInjury")) {
				pathname = ".\\config\\IndusryInjuryElements.txt";
			}
			File f = new File(pathname);
			InputStreamReader reader = new InputStreamReader(new FileInputStream(f), "UTF-8");
			BufferedReader br = new BufferedReader(reader);
			String line = "";

			line = br.readLine();
			while (line != null) {
				this.analysis(line);
				line = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void analysis(String line) {
		if (line.charAt(0) == '#') {
			return;
		}
		String[] str = line.split(";");
		ElementPo tempE = new ElementPo();
		tempE.id = str[0];
		tempE.question = str[1];
		if (str.length >= 3 &&str[2].length() > 0) {
			tempE.answerToChoose = str[2].split("、");
		}
		this.elements.add(tempE);
	}
}
