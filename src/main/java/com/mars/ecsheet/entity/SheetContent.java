package com.mars.ecsheet.entity;

import cn.hutool.json.JSONObject;
import lombok.Data;

import java.util.List;

/**
 * sheet内容
 *
 * @author Administrator
 */
@Data
public class SheetContent {

    /**
     * 工作表名称
     */
    private String name;
    /**
     * 工作表颜色
     */
    private String color;
    /**
     * 工作表索引
     */
    private String index;
    /**
     * 激活状态 是否当前sheet页  1、是 0、否
     */
    private String status;
    /**
     * 工作表的顺序 排序位置 从0升序排序
     */
    private String order;
    /**
     * 是否隐藏
     */
    private Integer hide;
    /**
     * 行数
     */
    private Integer row;
    /**
     * 列数
     */
    private Integer column;
    /**
     * 文档配置
     */
    private JSONObject config;
    /**
     * 左右滚动条位置
     */
    private Integer scrollLeft;
    /**
     * 上下滚动条位置
     */
    private Integer scrollTop;
    /**
     * 条件格式
     */
    private JSONObject luckySheetConditionFormatSave;
    /**
     * 是否数据透视表
     */
    private boolean isPivotTable;
    /**
     * 数据透视表设置
     */
    private JSONObject pivotTable;
    /**
     * 筛选范围
     */
    private JSONObject filter_select;
    /**
     * 筛选配置
     */
    private JSONObject filter;
    /**
     * 冻结行列
     */
    private JSONObject freezen;
    /**
     * 工作表区域的宽度
     */
    private Integer chWidth;
    /**
     * 工作表区域的高度
     */
    private Integer rhHeight;
    /**
     * 已加载过此sheet的标识
     */
    private String load;
    /**
     * 自定义行高
     */
    private Integer defaultRowHeight;
    /**
     * 自定义列宽
     */
    private Integer defaultColWidth;
    /**
     * 缩放比例
     */
    private Integer zoomRatio;
    /**
     * 是否显示网格线
     */
    private Integer showGridLines;
    /**
     * 数据验证配置
     */
    private JSONObject dataVerification;
    /**
     * 初始化使用的单元格数据
     */
    private List<JSONObject> cellData;
    /**
     * 更新和存储使用的单元格数据
     */
    private List<JSONObject> data;
    /**
     * 选中的区域
     */
    private List<JSONObject> luckySheetSelectSave;
    /**
     * 公式链
     */
    private List<JSONObject> calcChain;
    /**
     * 交替颜色
     */
    private List<JSONObject> luckySheetAlternateFormatSave;
    /**
     * 自定义交替颜色
     */
    private List<JSONObject> luckySheetAlternateFormatSaveModelCustom;
    /**
     * 图表配置
     */
    private List<JSONObject> chart;
    /**
     * 所有行的位置
     */
    private List<JSONObject> visibleDataRow;
    /**
     * 所有列的位置
     */
    private List<JSONObject> visibleDataColumn;
    /**
     * 图片
     */
    private List<JSONObject> image;
}
