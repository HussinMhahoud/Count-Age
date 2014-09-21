package es.esy.abody.countage;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final EditText DATETEXT =(EditText)findViewById(R.id.dataText);
		final Button RUNPRG = (Button) findViewById(R.id.countButt);
		final TextView resultText = (TextView) findViewById(R.id.resultViwe);
//		Button z = new Button(this);
//		z.setText("goto");
//		LinearLayout lnr = (LinearLayout)findViewById(R.id.linear);
//		z.setWidth(50);
//		z.setHeight(50);
//		lnr.addView(z);
RUNPRG.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 
				String dateT = DATETEXT.getText().toString();
				String result = dateT ;
				
				try {
					GetCount getResult = new GetCount(result);
					result = getResult.getResult();
					
					
					
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
				
				Toast.makeText(MainActivity.this,result , Toast.LENGTH_LONG).show()    ;
				resultText.setText(result);
				
				
				
				
				
				
			}
		});
		
		
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
