package com.devfun.vo;

//db테이블 인수를 멤버 변수로 설정하기 {movie_name, director, types}
public class MovieVO {
	private String movie_name;
	private String director;
	private String types;
	
	//getter, setter 작성
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	
}
