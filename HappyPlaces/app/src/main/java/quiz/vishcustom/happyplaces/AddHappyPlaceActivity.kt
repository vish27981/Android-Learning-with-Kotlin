package quiz.vishcustom.happyplaces

import android.Manifest
import android.app.AlertDialog
import android.app.DatePickerDialog
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class AddHappyPlaceActivity : AppCompatActivity(),View.OnClickListener{

    val et_date:EditText = findViewById(R.id.et_date)
    val tv_add_image: TextView = findViewById(R.id.tv_add_image)

    private val cal = Calendar.getInstance()
    private lateinit var dateSetListener: DatePickerDialog.OnDateSetListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_happy_place)

        val  toolbar_add_place: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar_add_place)

        setSupportActionBar(toolbar_add_place)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        toolbar_add_place.setNavigationOnClickListener{
            onBackPressed()
        }

        dateSetListener = DatePickerDialog.OnDateSetListener{
            view, year, month, dayOfMonth ->
            cal.set(Calendar.YEAR, year)
            cal.set(Calendar.MONTH, month)
            cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            updateDateInView()

        }
        et_date.setOnClickListener(this)
        tv_add_image.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.et_date ->{
                DatePickerDialog(this@AddHappyPlaceActivity,
                    dateSetListener,
                    cal.get(Calendar.YEAR),
                    cal.get(Calendar.MONTH),
                    cal.get(Calendar.DAY_OF_MONTH)).show()
            }
            R.id.iv_place_image->{
                val pictureDialog = AlertDialog.Builder(this)
                pictureDialog.setTitle("Select Action")
                val pictureDialogItems = arrayOf("Select photo from Gallery",
                    "Capture photo from camera")
                pictureDialog.setItems(pictureDialogItems){
                    dialog, which ->
                    when(which){
                        0 ->choosePhotoFromGallery()
                        1 -> Toast.makeText(this@AddHappyPlaceActivity,
                            "Camera selection coming soon...",Toast.LENGTH_SHORT).show()
                    }
                }
                pictureDialog.show()
            }

        }
    }

    private fun choosePhotoFromGallery(){
        Dexter.withActivity(this).withPermissions(
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
        ).withListener(object: MultiplePermissionsListener{
            override fun onPermissionsChecked(report: MultiplePermissionsReport?)
            {
                if(report!!.areAllPermissionsGranted())
                {
                Toast.makeText(this@AddHappyPlaceActivity,
                    "Storage READ/WRITE are granted. Now you can select an image from GALLERY",Toast.LENGTH_SHORT).show()
                }
            }
            override fun onPermissionRationaleShouldBeShown(permissions:MutableList<PermissionRequest>, token: PermissionToken)
            {
                showRationalDialogForPermissions()
            }

        }).onSameThread().check()

    }

    private fun showRationalDialogForPermissions(){
        AlertDialog.Builder(this).setMessage(""+"It Looks like you have turned off permission required "+
        "for this feature. It can be enabled under the" + "Applications Settings. ")
            .setPositiveButton("GO TO SETTINGS")
            {_, _ ->
                try{
                    val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
                    val uri = Uri.fromParts("package",packageName,null)
                    intent.data= uri
                    startActivity(intent)
                }catch(e: ActivityNotFoundException){
                    e.printStackTrace()

                }

            }.setNegativeButton("Cancel"){dialog, _ ->
                dialog.dismiss()
            }.show()

    }

    private fun updateDateInView(){
        val myFormat ="dd.MM.yyyy"
        val sdf = SimpleDateFormat(myFormat, Locale.getDefault())
        et_date.setText(sdf.format(cal.time).toString())
    }
}