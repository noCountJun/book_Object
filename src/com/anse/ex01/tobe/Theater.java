package com.anse.ex01.tobe;

/**
 * �ұ����� �����ϴ� Ŭ����
 * 
 * �����Ŀ��� Ƽ�Ͽ��ǽ��� ���� �������� �ʴ´�.
 */
public class Theater {
	private TicketSeller ticketSeller;
	
	public Theater(TicketSeller ticketSeller) {
		this.ticketSeller = ticketSeller;
		
	} 
	
	public void enter(Audience audience) {
		ticketSeller.sellTo(audience);
	}
}
