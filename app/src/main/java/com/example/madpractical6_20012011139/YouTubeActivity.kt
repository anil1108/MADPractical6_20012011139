package com.example.madpractical6_20012011139

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class YouTubeActivity : AppCompatActivity() {
    private val youtubeId="MN8p-Vrn6G0"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val mywebview=findViewById<WebView>(R.id.web)
        val settings=mywebview.settings
        settings.javaScriptEnabled=true
        settings.loadWithOverviewMode=true
        settings.useWideViewPort=true

        mywebview.loadUrl("https://www.youtube.com/embed/$youtubeId")
    }
}