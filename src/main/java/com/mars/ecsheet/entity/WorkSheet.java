package com.mars.ecsheet.entity;

import cn.hutool.json.JSONObject;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.io.Serializable;

/**
 * @author Mars
 * @date 2020/10/29
 * @description
 */
@Data
@Document(collection = "worksheet")
public class WorkSheet implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 工作表id
     */
    @Id
    @Field(value = "_id", targetType = FieldType.STRING)
    private String id;
    /**
     * 文档id
     */
    private String fileId;
    /**
     * sheet数据体
     *
     * @see SheetContent
     */
    private JSONObject data;
    /**
     * 删除标记 0是未删除，1是删除
     */
    private Integer deleteStatus;
}
