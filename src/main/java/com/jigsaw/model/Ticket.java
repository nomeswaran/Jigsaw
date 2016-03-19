package com.jigsaw.model;

import java.util.concurrent.atomic.AtomicLong;

import javax.xml.bind.annotation.XmlRootElement;


public class Ticket {
	
	private long ticketId;
	
	private String ticketDesc;
	
	private String ticketDetail;
	
	private TicketStatus ticketStatus;
	
	static AtomicLong atomicLong = new AtomicLong();
	
	public Ticket(String ticketDesc,String ticketDetail) {
		super();
		ticketId = atomicLong.getAndIncrement();
		this.ticketDesc = ticketDesc;
		this.ticketDetail = ticketDetail;
		this.ticketStatus = TicketStatus.Assigned;
	}

	public long getTicketId() {
		return ticketId;
	}

	public void setTicketId(long ticketId) {
		this.ticketId = ticketId;
	}

	public String getTicketDesc() {
		return ticketDesc;
	}

	public void setTicketDesc(String ticketDesc) {
		this.ticketDesc = ticketDesc;
	}

	public String getTicketDetail() {
		return ticketDetail;
	}

	public void setTicketDetail(String ticketDetail) {
		this.ticketDetail = ticketDetail;
	}

	public TicketStatus getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(TicketStatus ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", ticketDesc=" + ticketDesc + ", ticketDetail=" + ticketDetail
				+ ", ticketStatus=" + ticketStatus + ", atomicLong=" + atomicLong + "]";
	}
	
	
	
	

}
