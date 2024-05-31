package tr.com.nuritiras.sinavuygulamasi;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import tr.com.nuritiras.sinavuygulamasi.databinding.ActivityGirisBinding;

public class GirisActivity extends AppCompatActivity {

    ActivityGirisBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityGirisBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}