package com.anse.ex01.tobe;

/**
 * 소극장을 구현하는 클래스
 * 
 * 수정후에는 티켓오피스에 직접 접근하지 않는다.
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
