package com.anse.ex01.tobe;

/**
 * �������� ����
 * 
 * �ʴ���,Ƽ��, ���� ����
 * 
 */
public class Bag {
	private Long amount;
	private Ticket ticket;
	private Invitation invitation;

	public Long hold(Ticket ticket) {
		if(hasInvitation()) {
			setTicket(ticket);
			return 0L;
		} else {
			setTicket(ticket);
			minusAmount(ticket.getFee());
			return ticket.getFee();
		}
	}
	
	// �ʴ��� ��������
	public boolean hasInvitation() {
		return invitation != null;
	}
	// Ƽ���� ���� ����
	public boolean hasTicket() {
		return ticket != null;
	}
	// �ʴ����� Ƽ������ ��ȯ
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	// ���� ����
	public void minusAmount(Long amount) {
		this.amount -= amount;
	}
	// ��������
	public void plusAmount(Long amount) {
		this.amount += amount;
	}
	
	// �ʴ������ ���ݸ� ������ ��� ������
	public Bag(long amount){
		this(null, amount);
	}
	// �ʴ���,���� �Բ� ������ ������
	public Bag(Invitation invitation, long amount) {
		this.invitation = invitation;
		this.amount = amount;
	}
	
	
	
}
