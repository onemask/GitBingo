package com.project.gitbingo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.jsoup.Connection
import org.jsoup.Jsoup
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupJsoup()
    }

    private fun setupJsoup() {
        val docu = Jsoup.connect(GITHUB_URL).get()

        val response = Jsoup.connect(GITHUB_URL)
            .method(Connection.Method.GET)
            .execute()
            .parse()

        Timber.d("docu $docu")
        Timber.d("response $response")
    }

    companion object {
        //TODO("Github 하드 코딩된 github 계정 말고 유저 데이터로 수정  ")
        const val GITHUB_URL = "https://github.com/users/onemask/contributions"
    }

}
