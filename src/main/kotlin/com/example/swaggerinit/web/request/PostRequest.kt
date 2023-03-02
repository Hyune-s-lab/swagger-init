package com.example.swaggerinit.web.request

import io.swagger.v3.oas.annotations.media.Schema

data class PostRequest(
    @Schema(title = "글 제목")
    val title: String
)
