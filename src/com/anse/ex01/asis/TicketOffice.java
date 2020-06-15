package com.anse.ex01.asis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 매표소 (초대장을 티켓으로 교환하는 곳)
 * 
 * 판매할 티켓과, 티켓의 판매 금액
 */
public class TicketOffice {
	private Long amount;
	private List<Ticket> tickets = new ArrayList<>();
	
	public TicketOffice(Long amount, Ticket ...tickets ) {
		this.amount = amount;
		this.tickets.addAll(Arrays.asList(tickets));
	}
	public Ticket getTicket(){
		return tickets.remove(0);
	}
	public void minusAmount(Long amount) {
		this.amount -= amount;
	}
	public void plusAmount(Long amount) {
		this.amount += amount;
	}
}
