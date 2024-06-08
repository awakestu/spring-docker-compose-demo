package com.awake.spring.docker.compose.demo

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(properties = [
    // NOTE: important to enable docker-compose for tests
    "spring.docker.compose.skip.in-tests=false",
    // NOTE: if compose file is not in default location
    "spring.docker.compose.file=docker/test-compose.yaml",
])
class SpringDockerComposeDemoApplicationTests {

    @Test
    fun contextLoads() {
    }

}
