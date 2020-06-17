package com.anse.ex02;

import java.time.LocalDateTime;

/**
 * ��
 */
public class Screening {
	private Movie movie;				// ��ȭ
	private int sequence;				// ����
	private LocalDateTime whenScreened;	// �󿵽��۽ð�

	public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
		this.movie = movie;
		this.sequence = sequence;
		this.whenScreened = whenScreened;
	}
	
	// �󿵽��۽ð��� ��ȯ
	public LocalDateTime getWhenScreened() {
		return whenScreened;
	}
	
	// ������ ��ġ���� 
	public boolean isSequence(int sequence) {
		return this.sequence == sequence;
	}

	// �⺻����� ��ȯ
	public Money getMovieFee() {
		return movie.getFee();
	}
}
