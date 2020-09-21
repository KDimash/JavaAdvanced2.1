package kz.aitu.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "group_s")
public class Group {
    @Id
    private long gId;
    private String gName;
}
