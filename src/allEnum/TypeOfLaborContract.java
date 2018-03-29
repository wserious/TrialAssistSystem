package allEnum;

public enum TypeOfLaborContract {
	FixedTermContract("固定期限劳动合同",1),			//固定期限劳动合同
	UnfixedTermContract("无固定期限劳动合同",2),		//无固定期限劳动合同
	CompleteWorkContract("以完成一定工作为期限的劳动合同",3);		//以完成工作为结束的劳动合同
	
	private String name;
	private int index;
	
	private TypeOfLaborContract(String name, int index) {  
        this.name = name;  
        this.index = index;  
    }
	
	public String getName(Enum e) {
		return  e.name();
	}
}
