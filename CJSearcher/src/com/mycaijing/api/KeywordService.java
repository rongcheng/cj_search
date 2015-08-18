package com.mycaijing.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;

/**
 * @author CJ
 * 关键词服务，中文分词、提取关键词
 *
 */
public class KeywordService {

	public static String toB(){
		//String s=LuceneUtils.toC();
		String s=Test2.toC();
		return s;
	}
	public static List<String> tokenizer(String content) {
		
		ArrayList<String> _list = new ArrayList<String>();
		_list.add("dddd");
		String text="暴跌是不正常的，但暴涨本身也是不正常的。从去年7月的两千点涨到今年6月初五千多点，速度惊人。对比这一波行业和07年那波行情，分别到达5100点和6124点的高位，走势图几乎一模一样。所以，断崖式暴跌是预料之中的。这次下跌，就是对前期暴涨的报复性下跌和修复，这是必然的。获利盘回吐、高管减持、杠杆资金平仓等，最终引起了散户的恐慌抛售，造成暴跌局面。而造成此次非正常暴跌的主要责任不在散户，而是证券监管部门监管不力和大的投资机构、大户过度投机造成的";
		Analyzer _analyzer=LuceneUtils._getAnalyzer();
		if(_analyzer==null){
			return _list;
		}
		TokenStream ts;
		try {
			ts = _analyzer.tokenStream("field", text);
			CharTermAttribute ch = ts.addAttribute(CharTermAttribute.class);  

	        ts.reset();  
	        while (ts.incrementToken()) {  
	            System.out.println(ch.toString());  
	            _list.add(ch.toString());
	        }  
	        ts.end();  
	        ts.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		catch(Exception e){
			e.printStackTrace();
		}
        
        System.out.println(_list.size());
		
		return _list;
	}
}
