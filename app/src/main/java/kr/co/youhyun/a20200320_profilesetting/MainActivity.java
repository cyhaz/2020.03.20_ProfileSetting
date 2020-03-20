package kr.co.youhyun.a20200320_profilesetting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;

import kr.co.youhyun.a20200320_profilesetting.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("화면 재등장", "다시 나타날때마다 실행");
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }
}
