package com.anse.ex01.tobe;

/**
 * 판매원 클래스
 * 티켓을 교환해주거나 티켓을 판매하는 역할
 * 자신이 일하는 매표소를 알고 있어야 한다.
 */
public class TicketSeller {
	private TicketOffice ticketOffice;
	
	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}
	
	public void sellTo(Audience audience) {
		ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
	}
}
