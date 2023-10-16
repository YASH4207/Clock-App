import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{
	
//	Calendar calendar;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String Time;
	String Day;
	String Date;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Clock Program");
		this.setLayout(new FlowLayout());
		this.setSize(350, 200);
		this.setResizable(false);
		this.setVisible(true);
		
		timeLabel = new JLabel();		
		timeFormat = new SimpleDateFormat("HH:mm:ss " );
		timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
		timeLabel.setForeground(new Color(0x00FF00));
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);
		
		dayLabel = new JLabel();
		dayFormat = new SimpleDateFormat("EEEE" );
		dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 30));
		
		dateLabel = new JLabel();
		dateFormat= new SimpleDateFormat("dd MMMMM yyyy");
		dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 20));
		
		this.add(timeLabel); 
		this.add(dayLabel);
		this.add(dateLabel);
		
		setTime();
	}
	
	public void setTime() {
		while (true) {
		Time = timeFormat.format(Calendar.getInstance().getTime());
		timeLabel.setText(Time);
		
		Day = dayFormat.format(Calendar.getInstance().getTime());
		dayLabel.setText(Day);
		
		Date = dateFormat.format(Calendar.getInstance().getTime());
		dateLabel.setText(Date);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
