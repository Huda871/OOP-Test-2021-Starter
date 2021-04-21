package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	String score = "DEFGABcd";
	char result =score.charAt(0);
	system.out.println(result);
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
    string a = s.substring(0);
	string b = s.substring()
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	ArrayList<Note> notes = new ArrayList<Note>();
     
	private float topborder;
	private float border;

	public void printscore()
	{
		for(Score s:score)
		{
			println(s);
		}

	}

	public void displayScore()
	{
		strocke(0);
		fill(0);
		textAlign(Center, Center);
		for int i = 0; i <= size; i++)
		{
			float x = map(i, 0; topBorder, width - border);
			line(x,boder, x, height - border);
			line(x1, y1, x2, y2)
			text(i, x, border / 2)
		}

		for(int i = 0; i<string.length();i++){
			Ststem.out.print(string.charAt(i)+"");
		
		}

	}


	void loadScore()
	{

		int i = 0;
		while(i < score.length())
		{
			char c = score.charAt(i);
			Note n = new Note(c, 1);
			notes.add(n);
			i ++;

		}

	}

	public void setup() 
	{
		loadScore();
		printScore();
		topBorder =width *0.2f;
		border =width * 0.1f;

	}

	public void draw()
	{
		background(255);
		displayTasks();
		
	}

	void drawNotes()
	{
	}
}
