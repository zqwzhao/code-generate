package top.zhaoqw.codegenerate.entity.vo;

import java.util.List;

/**
 * 公共代码VO类
 *
 * @author zhaoqw
 * @date 2022/10/25
 */
public class CommonCodeVO {
    public static final CommonCodeVO ROOT = new CommonCodeVO();
    static {
        // 顶级节点
        ROOT.id = "root";
        ROOT.parentId = null;
        ROOT.parent = true;
        ROOT.original = true;
        ROOT.code = "root";
        ROOT.name = "公共代码";
        ROOT.instructions = "公共代码顶级节点";
    }
    /**
     * 编号
     */
    private String id;
    /**
     * 编码
     */
    private String code;
    /**
     * 名称
     */
    private String name;
    /**
     * 是否是内置
     */
    private Boolean original;
    /**
     * 父节点编号
     */
    private String parentId;
    /**
     * 是否为父项，false:子项，true:父项
     */
    private Boolean parent;
    /**
     * 说明
     */
    private String instructions;

    /**
     * 子节点数据
     */
    List<CommonCodeVO> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOriginal() {
        return original;
    }

    public void setOriginal(Boolean original) {
        this.original = original;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Boolean getParent() {
        return parent;
    }

    public void setParent(Boolean parent) {
        this.parent = parent;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public List<CommonCodeVO> getChildren() {
        return children;
    }

    public void setChildren(List<CommonCodeVO> children) {
        this.children = children;
    }
}
