package com.anse.ex01.asis;

/**
 * �Ǹſ� Ŭ����
 * Ƽ���� ��ȯ���ְų� Ƽ���� �Ǹ��ϴ� ����
 * �ڽ��� ���ϴ� ��ǥ�Ҹ� �˰� �־�� �Ѵ�.
 */
public class TicketSeller {
	private TicketOffice ticketOffice;
	
	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}
	
	public TicketOffice getTicketOffice() {
		return ticketOffice;
	}
	
	public void sellTo(Audience audience) {
		if(audience.getBag().hasInvitation()) {
			Ticket ticket = ticketOffice.getTicket();
			audience.getBag().minusAmount(ticket.getFee());
		} else {
			Ticket ticket = ticketOffice.getTicket();
			audience.getBag().minusAmount(ticket.getFee());
			ticketOffice.plusAmount(ticket.getFee());
			audience.getBag().setTicket(ticket);
		}
	}
}
