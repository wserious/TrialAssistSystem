package allInterface;

import java.util.ArrayList;

import po.ActPo;
import po.CasePo;
import po.DocumentPo;
import po.ElementPo;

public interface ImplementInterface {
	//通过案件分类获得初始化的DocumentPo，即要素表
	DocumentPo documentInit();
	
	//获得一个空的未填写的要素点
	ElementPo	elementInit();
	
	//写入一个要素
	void writeElement(ElementPo e);
	
	//得到基于DocumentPo即要素表的法条推送
	ArrayList<ActPo> getActRecommend();
	
	//得到基于DocumentPo的类案推送
	ArrayList<CasePo> getCaseRecommend();
	
	//对一个文件进行预处理，使之变为处理好的DocumentPo
	//现在不确定是否使用String作为传入参数
	DocumentPo autoParse(String url);
	
	//在指定位置生成文书模板
	void DocumentGeneration(String url);
}
