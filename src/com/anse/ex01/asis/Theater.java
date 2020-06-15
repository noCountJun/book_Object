package com.anse.ex01.asis;

/**
 * 소극장을 구현하는 클래스
 * 
 * 관람객의 가방을 확인하고, 판매원한테 티켓을 받아서 가방안에 넣어준다.
 */
public class Theater {
	private TicketSeller ticketSeller;
	
	public Theater(TicketSeller ticketSeller) {
		this.ticketSeller = ticketSeller;
		
	} 
	
	public void enter(Audience audience) {
		if(audience.getBag().hasInvitation()) {
			Ticket ticket = ticketSeller.getTicketOffice().getTicket();
			audience.getBag().setTicket(ticket);
		} else {
			Ticket ticket = ticketSeller.getTicketOffice().getTicket();
			audience.getBag().minusAmount(ticket.getFee());
			ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
			audience.getBag().setTicket(ticket);
		}
	}
}
