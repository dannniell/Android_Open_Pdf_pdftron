package com.example.testingopenpdf;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.testingopenpdf.databinding.ActivityMainBinding;
import com.pdftron.pdf.config.ViewerConfig;
import com.pdftron.pdf.controls.DocumentActivity;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        ViewerConfig config = new ViewerConfig.Builder().openUrlCachePath(this.getCacheDir().getAbsolutePath()).useStandardLibrary(true).build();
        final Uri fileLink = Uri.parse("https://pdftron.s3.amazonaws.com/downloads/pl/PDFTRON_mobile_about.pdf");

        DocumentActivity.openDocument(this, fileLink, config);
    }
}