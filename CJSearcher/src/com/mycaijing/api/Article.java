/**
 * 
 */
package com.mycaijing.api;

/**
 * @author CJ
 * 文章实体类
 *
 */
public class Article {
	private int _articleId;
	private int _sourceId;
	private String _title;
	private String _description;
	private String _author;
	private String _keyword;
	private String _content;
	private int _issueId;
	private int _ctime;
	public int get_articleId() {
		return _articleId;
	}
	public void set_articleId(int _articleId) {
		this._articleId = _articleId;
	}
	public int get_sourceId() {
		return _sourceId;
	}
	public void set_sourceId(int _sourceId) {
		this._sourceId = _sourceId;
	}
	public String get_title() {
		return _title;
	}
	public void set_title(String _title) {
		this._title = _title;
	}
	public String get_description() {
		return _description;
	}
	public void set_description(String _description) {
		this._description = _description;
	}
	public String get_author() {
		return _author;
	}
	public void set_author(String _author) {
		this._author = _author;
	}
	public String get_keyword() {
		return _keyword;
	}
	public void set_keyword(String _keyword) {
		this._keyword = _keyword;
	}
	public String get_content() {
		return _content;
	}
	public void set_content(String _content) {
		this._content = _content;
	}
	public int get_issueId() {
		return _issueId;
	}
	public void set_issueId(int _issueId) {
		this._issueId = _issueId;
	}
	public int get_ctime() {
		return _ctime;
	}
	public void set_ctime(int _ctime) {
		this._ctime = _ctime;
	}
}
