package com.anse.ex01.asis;

/**
 * �ұ����� �����ϴ� Ŭ����
 * 
 * �������� ������ Ȯ���ϰ�, �Ǹſ����� Ƽ���� �޾Ƽ� ����ȿ� �־��ش�.
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
