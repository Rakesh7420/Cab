package com.cab.Model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import lombok.Data;

@Entity
@Data
public class CurrentSessionUser {
  @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private Integer userId;
    private String uuid;
    private LocalDateTime localDateTime;

    public CurrentSessionUser(Integer userId, String uuid, LocalDateTime localDateTime) {
        super();
        this.userId = userId;
        this.uuid = uuid;
        this.localDateTime = localDateTime;
    }
}
