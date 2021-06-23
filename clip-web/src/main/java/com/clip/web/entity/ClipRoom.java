package com.clip.web.entity;

import lombok.Data;

import java.util.List;

@Data
public class ClipRoom {
    private String id;

    private List<String> hintWords;

    private ClipContent content;

    private Long lastResetTime;

    private Long nextResetTime;
}
