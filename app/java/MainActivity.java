package net.albaneso.notifications;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView; 
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
 String url="http://dev.albaneso.net/development/app";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        WebView webView = (WebView)
        findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }
}
