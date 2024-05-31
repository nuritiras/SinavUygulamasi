package tr.com.nuritiras.sinavuygulamasi;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import tr.com.nuritiras.sinavuygulamasi.databinding.ActivityUrunBinding;

public class UrunActivity extends AppCompatActivity {

    ActivityUrunBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityUrunBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}