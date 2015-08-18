package com.mycaijing.api;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.cn.smart.SmartChineseAnalyzer;
import org.apache.lucene.analysis.util.CharArraySet;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

public class LuceneUtils {

	private static IndexWriter _indexWriter;
	private static Analyzer _analyzer;
	
	public static String toC(){
		return "this is a toC method";
	}
	
	/**
	 * 取得writer，单例方法
	 * @return
	 */
	public static IndexWriter getIndexWriter(){
		if(_indexWriter==null){
			
			File _indexPath = new File("E:\\test\\lucene\\index_path3");			
			if(!_indexPath.exists()){
				_indexPath.mkdirs();
			}
			
			try {
				Directory _directory=FSDirectory.open(_indexPath.toPath());
				IndexWriterConfig iwc=new IndexWriterConfig(_getAnalyzer());
				_indexWriter = new IndexWriter(_directory, iwc);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return _indexWriter;
	}
	
	public static Analyzer _getAnalyzer(){
		
		if(_analyzer==null){
			String[] self_stop_words = { "的", "在","了", "呢", "，", "0", "：", ",", "是", "流" };
			CharArraySet cas = new CharArraySet( 0, true);
			for (int i = 0; i < self_stop_words.length; i++) {
				cas.add(self_stop_words[i]);
			}

			// 加入系统默认停用词
			Iterator<Object> itor = SmartChineseAnalyzer.getDefaultStopSet().iterator();
			while (itor.hasNext()) {
				cas.add(itor.next());
			}
			SmartChineseAnalyzer sca = new SmartChineseAnalyzer( cas);
			_analyzer = sca;
		}
		return _analyzer;
	}
	
}
