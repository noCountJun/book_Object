package com.anse.ex01.asis;

/**
 * �������� ����
 * 
 * �ʴ���,Ƽ��, ���� ����
 * 
 */
public class Bag {
	private Long amount;
	private Invitation invitation;
	private Ticket ticket;
	
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
