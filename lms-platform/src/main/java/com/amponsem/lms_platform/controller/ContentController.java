package com.amponsem.lms_platform.controller;

import com.amponsem.lms_platform.entity.Content;
import com.amponsem.lms_platform.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/content")
public class ContentController {

    @Autowired
    private ContentService contentService;

    @PostMapping
    public Content createContent(@RequestBody Content content) {
        return contentService.save(content);
    }

    @GetMapping("/{id}")
    public Content getContentById(@PathVariable String id) {
        return contentService.findById(id);
    }

    @PutMapping("/{id}")
    public Content updateContent(@PathVariable String id, @RequestBody Content content) {
        content.setId(id);
        return contentService.save(content);
    }

    @DeleteMapping("/{id}")
    public void deleteContent(@PathVariable String id) {
        contentService.deleteById(id);
    }
}

