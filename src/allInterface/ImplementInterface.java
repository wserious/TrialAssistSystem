package allInterface;

import java.util.ArrayList;

import po.ActPo;
import po.CasePo;
import po.DocumentPo;

public interface ImplementInterface {
	DocumentPo documentEntry();
	ArrayList<ActPo> getActRecommend();
	ArrayList<CasePo> getCaseRecommend();
	String documentGeneration();
}
