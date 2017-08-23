/**
 * Created by amol on 8/23/17.
 */
package com.ngco.springr.test

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.http.ResponseEntity
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.embedded.LocalServerPort
import org.springframework.boot.test.context.SpringBootTest
import java.net.URL

import org.hamcrest.Matchers.equalTo
import org.junit.Assert.assertThat

@RunWith(value=SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProjectTester {
    @LocalServerPort val port: Int = 9000
    var base : URL? = null
    @Autowired
    private val template: TestRestTemplate? = null



    @Before
    @Throws(Exception::class)
    fun setUp() {
        base = URL("http://localhost:$port/")
    }

    @Test
    @Throws(Exception::class)
    fun getHello() {
        val response = template!!.getForEntity(base.toString(),
                String::class.java)
        assertThat(response.getBody(), equalTo("Alpha"))
    }

}

