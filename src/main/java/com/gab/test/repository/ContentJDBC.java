package com.gab.test.repository;

import org.springframework.jdbc.core.JdbcTemplate;

public class ContentJDBC {
    private final JdbcTemplate jdbcTemplate;

    public ContentJDBC(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


}
