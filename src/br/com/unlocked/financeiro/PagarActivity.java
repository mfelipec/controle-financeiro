package br.com.unlocked.financeiro;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PagarActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pagar);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pagar, menu);
		return true;
	}

}
