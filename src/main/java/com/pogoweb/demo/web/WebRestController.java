package com.pogoweb.demo.web;

import com.pogoweb.demo.domain.posts.PostsRepository;
import com.pogoweb.demo.dto.posts.PostsSaveRequestDto;
import com.pogoweb.demo.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import org.springframework.core.env.Environment;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsRepository postsRepository;
    private PostsService postsService;
    private Environment env;
    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

//    @PostMapping("/posts")
//    public void savePosts(@RequestBody PostsSaveRequestDto dto){
//        postsRepository.save(dto.toEntity());
//    }
    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto){
        return postsService.save(dto);
    }

    @GetMapping("/profile")
    public String getProfile () {
        return Arrays.stream(env.getActiveProfiles())
                .findFirst()
                .orElse("");
    }

}