package com.amponsem.lms_platform.service;

import com.amponsem.lms_platform.entity.Content;
import com.amponsem.lms_platform.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentService {

    @Autowired
    private ContentRepository contentRepository;

    public Content save(Content content) {
        return contentRepository.save(content);
    }

    public Content findById(String id) {
        return contentRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        contentRepository.deleteById(id);
    }
}
