package com.clip.web.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Hint {
    private String id;

    private String name;

    private String color;
}
