package hr.algebra.butterknife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import butterknife.ButterKnife
import butterknife.BindString
import butterknife.BindView
import butterknife.OnClick

class MainActivity : AppCompatActivity() {

    @BindView( R.id.etFirst )   lateinit var etFirst   : EditText
    @BindView( R.id.etSecond )  lateinit var etSecond  : EditText

    @BindString( R.string.error_message )   lateinit var errorMessage   : String
    @BindString( R.string.success_message ) lateinit var successMessage : String

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_main )

        ButterKnife.bind( this )
    }

    @OnClick( R.id.bLogin )
    fun login( ) {
        if( etFirst.text.toString( ).isEmpty( ) || etSecond.text.toString( ).isEmpty( ) )
            Toast
                .makeText( this, errorMessage, Toast.LENGTH_SHORT )
                .show( )
        else
            Toast
                .makeText( this, successMessage, Toast.LENGTH_SHORT )
                .show( )
    }

    @OnClick( R.id.bFragment )
    fun bFragmentClicked( ) {
        supportFragmentManager
            .beginTransaction( )
            .add( R.id.frameLayout, YellowFragment( ) )
            .commit( )
    }
}