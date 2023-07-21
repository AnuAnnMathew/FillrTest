package com.learnkotlin.fillrtest.model

import com.learnkotlin.fillrtest.model.Photo

data class Photos(
    val page: Int,
    val pages: Int,
    val perpage: Int,
    val photo: List<Photo>,
    val total: Int
)