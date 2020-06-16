package com.anse.ex01.tobe;

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
	
	public void sellTo(Audience audience) {
		ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
	}
}
