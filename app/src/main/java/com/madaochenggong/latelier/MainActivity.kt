package com.madaochenggong.latelier

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Our website
        val myWebView: WebView = findViewById(R.id.myURL)
        myWebView.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        myWebView.loadUrl("https://ideal.ac-lyon.fr/latelier/")
        myWebView.settings.javaScriptEnabled=true
        myWebView.settings.allowContentAccess=true
        myWebView.settings.domStorageEnabled=true
        myWebView.settings.useWideViewPort=true
        myWebView.settings.setAppCacheEnabled(true)
    }
}
