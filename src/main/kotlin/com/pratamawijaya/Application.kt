package com.pratamawijaya

import org.jsoup.Jsoup

fun main(args: Array<String>) {
    val doc = Jsoup.connect("http://google.co.id/").get()
    val title = doc.title()
    println("hello $title")
}