package com.dolphinsmemory.exam.Controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dolphinsmemory.exam.domain.Students;

@RestController
public class StudentsController {

	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/student")
    public Students student(@RequestParam(value="name", defaultValue="World") String name) {
        return new Students(counter.incrementAndGet(),
                            String.format(template,name));
    }
	
}
