package com.anse.ex01.asis;

/**
 * 관람객의 가방
 * 
 * 초대장,티켓, 현금 보유
 * 
 */
public class Bag {
	private Long amount;
	private Invitation invitation;
	private Ticket ticket;
	
	// 초대장 보유여부
	public boolean hasInvitation() {
		return invitation != null;
	}
	// 티켓을 소유 여부
	public boolean hasTicket() {
		return ticket != null;
	}
	// 초대장을 티켓으로 교환
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	// 현금 감소
	public void minusAmount(Long amount) {
		this.amount -= amount;
	}
	// 현금증가
	public void plusAmount(Long amount) {
		this.amount += amount;
	}
	
	// 초대장없이 현금만 보유한 경우 생성자
	public Bag(long amount){
		this(null, amount);
	}
	// 초대장,현금 함께 보유한 생성자
	public Bag(Invitation invitation, long amount) {
		this.invitation = invitation;
		this.amount = amount;
	}
	
	
	
}
