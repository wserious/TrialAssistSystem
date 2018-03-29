package po;

public class ElementPo {
	String id;
	String question;
	String[] answerToChoose;
	String[] answerWritten;
	
	//已选择的要素选项
	int[] answerChosen;
	
	//劳动者的证据及用人单位的确认及证据
	boolean workerEvidence;
	boolean companyComfirm;
	boolean companyEvidence;
}
