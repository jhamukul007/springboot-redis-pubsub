package com.messaging.springbootredispubsub.configs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RedisData {
    private String type;
    private String data;
}
