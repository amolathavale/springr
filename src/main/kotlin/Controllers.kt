/**
 * Created by amol on 8/22/17.
 */
package com.ngco.springr.controllers

import com.ngco.springr.models.Person
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BlogController {

    @RequestMapping("/hello")
    fun greet() = "Hello World"

    @GetMapping("/person")
    fun getPerson() = Person("iuy3e832euhed", "Amol")

    @GetMapping("/alpha")
    fun getAlpha() = "Alpha"

    @GetMapping("/gamma")
    fun getGamma() = "Gamma"

    @GetMapping("/delta")
    fun getDelta() = "Delta"

}