package allEnum;

public enum ReasonOfReleaseRealtion {
	EndTimeReached("合同期满", 1),					//合同期满
	ResignationForPersonalReason("个人原因辞职", 2),	//因个人原因辞职
	ResignationForCompanyReason("单位原因辞职", 3),	//因单位原因辞职
	Dismiss("辞退", 4),						//辞退
	Consensus("协商一致离职", 5);						//协商一致
	
	String name;
	int index;
	
	private ReasonOfReleaseRealtion(String name, int index) {  
        this.name = name;  
        this.index = index;  
    }
}
