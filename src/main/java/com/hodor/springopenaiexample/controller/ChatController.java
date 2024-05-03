package com.hodor.springopenaiexample.controller;

import com.hodor.springopenaiexample.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/chat")
public class ChatController {

    private final ChatService chatService;

    @GetMapping()
    public ResponseEntity<String> chat(@RequestParam("prompt") String prompt) {
        return ResponseEntity.ok(chatService.chat(prompt));
    }
}
