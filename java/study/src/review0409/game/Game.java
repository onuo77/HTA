package review0409.game;

public class Game {

	/*﻿Game class*/
	//은닉화 멤버변수 name,win 생성
	//매개변수가 있는 생성자
	//getter 생성
	
	private String name;
	private int win;
	
	public Game(String name, int win) {
		super();
		this.name = name;
		this.win = win;
	}

	public String getName() {
		return name;
	}

	public int getWin() {
		return win;
	}
	
	
}
