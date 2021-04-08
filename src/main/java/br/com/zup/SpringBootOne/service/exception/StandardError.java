package br.com.zup.SpringBootOne.service.exception;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StandardError implements Serializable {

    private Integer status;
    private List <String> msgs = new ArrayList<>();
    private Long timeStamp;
	
    public StandardError(Integer status, List<String> msgs, Long timeStamp) {
		super();
		this.status = status;
		this.msgs = msgs;
		this.timeStamp = timeStamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<String> getMsgs() {
		return msgs;
	}

	public void setMsgs(List<String> msgs) {
		this.msgs = msgs;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

 }
