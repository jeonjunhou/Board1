package com.board.dto;

public class BoardDTO {

	private int seq;
	private String title;
	private String content;
	private String writedate;
	private String updatedate;
	private int del;
	
	public BoardDTO() {}
	
	public BoardDTO(int seq, String title, String content, String writedate, String updatedate, int del) {
		super();
		this.seq = seq;
		this.title = title;
		this.content = content;
		this.writedate = writedate;
		this.updatedate = updatedate;
		this.del = del;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWritedate() {
		return writedate;
	}

	public void setWritedate(String writedate) {
		this.writedate = writedate;
	}

	public String getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	@Override
	public String toString() {
		return "BoardDTO [seq=" + seq + ", title=" + title + ", content=" + content + ", writedate=" + writedate
				+ ", updatedate=" + updatedate + ", del=" + del + "]";
	}
	
	
	
	
}
