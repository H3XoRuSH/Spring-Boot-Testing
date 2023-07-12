package com.gab.test.repository;

import com.gab.test.model.Content;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentRepository {
    private final List<Content> contentList = new ArrayList<>();

    public ContentRepository() {

    }

    public List<Content> getContentList() {
        return contentList;
    }

    public Optional<Content> getContentById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    public void save(Content content) {
        contentList.removeIf(c -> c.id().equals(content.id()));
        contentList.add(content);
    }

    public boolean exists(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).count() == 1;
    }

    public void delete(Integer id) {
        contentList.removeIf(c -> c.id().equals(id));
    }

    @PostConstruct
    private void init() {
        Content c = new Content(
                1,
                "Gabriel Samonte",
                "202012459",
                LocalDateTime.now());
        contentList.add(c);
    }
}
