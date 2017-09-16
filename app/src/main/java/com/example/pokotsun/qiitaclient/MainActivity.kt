package com.example.pokotsun.qiitaclient

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.pokotsun.qiitaclient.model.Article
import com.example.pokotsun.qiitaclient.model.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // mainアクティビティをセット

        val listAdapter = ArticleListAdapter(applicationContext)
        listAdapter.articles = listOf(dummyArticle("Kotlin入門", "ひろき"),
                dummyArticle("Java入門", "まなみ"))

        val listView: ListView = findViewById(R.id.list_view) as ListView

        listView.adapter = listAdapter
        listView.setOnItemClickListener { adapterView, view, position, id ->
            val article = listAdapter.articles[position]
            // intent(this, article) まででArticleActivityのintentを設定、生成
            ArticleActivity.intent(this, article).let {startActivity(it)}
        }


    }

    private fun dummyArticle(title: String, userName: String): Article =
            Article(id = "",
                    title = title,
                    url = "https://kotlinlang.org/",
                    user = User(id = "", name = userName, profileImageUrl = ""))

}
