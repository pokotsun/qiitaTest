package com.example.pokotsun.qiitaclient

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.pokotsun.qiitaclient.model.Article
import com.example.pokotsun.qiitaclient.model.User
import com.example.pokotsun.qiitaclient.view.ArticleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main) // mainアクティビティをセット

        // ArticleViewオブジェクトを生成
        val articleView = ArticleView(applicationContext)

        // Articleオブジェクトを生成して、ArticleViewオブジェクトにセット
        articleView.setArticle(
                Article(
                        id = "123",
                        title = "kotlin入門",
                        url = "http://www.example.com/articles/123",
                        user  = User(id = "456", name = "太郎", profileImageUrl="")
                )
        )

        // このアクティビティにArticleViewオブジェクトをセット
        setContentView(articleView)


    }
}
