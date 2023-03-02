package com.example.swaggerinit.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.time.LocalDateTime

@Configuration
class OpenAPIConfig {
    @Bean
    fun openAPI(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("Post Server")
                    .description(
                        """
                        Post Server 입니다.
                        """.trimIndent()
                    )
                    .version(LocalDateTime.now().toString())
            )
    }
}
