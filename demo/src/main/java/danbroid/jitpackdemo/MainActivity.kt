package danbroid.jitpackdemo

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity



import kotlinx.android.synthetic.main.activity_main.*


/**
 * The main activity
 */
class MainActivity : AppCompatActivity() {


  override fun onCreate(savedInstanceState: Bundle?) {
    log.info("onCreate()")
    super.onCreate(savedInstanceState)

    setContentView(R.layout.activity_main)
    setSupportActionBar(toolbar)



/*
    message1.text = Library1().message
    message2.text = Library2().message
*/


  }


  override fun onCreateOptionsMenu(menu: Menu): Boolean {
    // Inflate the menu; this adds items to the action bar if it is present.
    menuInflater.inflate(R.menu.menu_main, menu)
    return true
  }


  override fun onOptionsItemSelected(item: android.view.MenuItem): Boolean {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    return when (item.itemId) {
      R.id.action_settings -> true
      else -> super.onOptionsItemSelected(item)
    }
  }

}

private val log = org.slf4j.LoggerFactory.getLogger(MainActivity::class.java)


