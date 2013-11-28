package br.ufpb.exercicio_widgets1;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ToggleButton;


public class MainActivity extends Activity{

	private View mColorRegion;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mColorRegion = findViewById(R.id.color_region);
		ImageButton imageButton1 = (ImageButton)findViewById(R.id.button1);
		ImageButton imageButton2 = (ImageButton)findViewById(R.id.button2);
		RadioButton radioButton1 = (RadioButton)findViewById(R.id.radioButton1);
		RadioButton radioButton2 = (RadioButton)findViewById(R.id.radioButton2);
		RadioButton radioButton3 = (RadioButton)findViewById(R.id.radioButton3);
		ToggleButton toggleButton1 = (ToggleButton)findViewById(R.id.toggle_button1);
		ToggleButton toggleButton2 = (ToggleButton)findViewById(R.id.toggle_button2);
		ToggleButton toggleButton3 = (ToggleButton)findViewById(R.id.toggle_button3);
		imageButton1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				setColorRegion(Color.BLUE);
			}
		});
		imageButton2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				setColorRegion(Color.RED);	
			}
		});
		
		final RadioGroup rg = (RadioGroup)findViewById(R.id.rgopcoes);
		Button button = (Button)findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				int op = rg.getCheckedRadioButtonId();
				switch (op) {
				case R.id.radioButton1:
					setColorRegion(Color.BLUE);
					break;
				case R.id.radioButton2:
					setColorRegion(Color.RED);
					break;
				case R.id.radioButton3:
					setColorRegion(Color.YELLOW);
					break;
				default: 
					setColorRegion(Color.BLACK);
					break;
				}		
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void setColorRegion(int color){
		mColorRegion.setBackgroundColor(color);
	}
	
	
	public void showToggleButton1(View clickedToggleButton) {
		ToggleButton toggleButton = (ToggleButton)clickedToggleButton;
		if(toggleButton.isChecked()) {
			setColorRegion(Color.BLUE);
		} else {
			setColorRegion(Color.BLACK);
		}
	} 
	public void showToggleButton2(View clickedToggleButton) {
		ToggleButton toggleButton = (ToggleButton)clickedToggleButton;
		if(toggleButton.isChecked()) {
			setColorRegion(Color.RED);
		} else {
			setColorRegion(Color.BLACK);
		}
	} 
	public void showToggleButton3(View clickedToggleButton) {
		ToggleButton toggleButton = (ToggleButton)clickedToggleButton;
		if(toggleButton.isChecked()) {
			setColorRegion(Color.YELLOW);
		} else {
			setColorRegion(Color.BLACK);
		}
	} 


	
}
