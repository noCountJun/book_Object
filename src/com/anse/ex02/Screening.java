package com.anse.ex02;

import java.time.LocalDateTime;

/**
 * 상영
 */
public class Screening {
	private Movie movie;				// 영화
	private int sequence;				// 순번
	private LocalDateTime whenScreened;	// 상영시작시간

	public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
		this.movie = movie;
		this.sequence = sequence;
		this.whenScreened = whenScreened;
	}
	
	// 상영시작시간을 반환
	public LocalDateTime getWhenScreened() {
		return whenScreened;
	}
	
	// 순번의 일치여부 
	public boolean isSequence(int sequence) {
		return this.sequence == sequence;
	}

	// 기본요금을 반환
	public Money getMovieFee() {
		return movie.getFee();
	}
}
