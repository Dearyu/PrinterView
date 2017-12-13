package com.example.junweiliu.printertextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    /**
     * 打印view
     */
    private PrinterTextView mPrinterTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPrinterTextView = (PrinterTextView) findViewById(R.id.pt_my);
    }

    /**
     * 开始打印
     *
     * @param view
     */
    public void startPrint(View view) {
        mPrinterTextView.setPrintText("草原上有对狮子母子。小狮子问母狮子：“妈，幸福在哪里?”母狮子说：“幸福就在你的尾巴上。”\n" +
                "　　于是小狮子不断追着尾巴跑，但始终咬不到。母狮子笑道：“傻瓜!幸福不是这样得到的!只要你昂首向前走，幸福就会一直跟随着你!”。", 100, "|");
        mPrinterTextView.startPrint();

    }
}
