package cn.com.lezz.framework.common;

public enum JsonResultStatus {

    SUCCESS(200, "成功!"),
    FAIL(500, "系统错误!"),
    EXPIRE(401, "token过期!");

    private final Integer code;
    private final String message;

    JsonResultStatus(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
    /*
    用枚举定义在JsonResult的构造中将导致程序中抛出的异常信息无法送达前端显示;
    如果加一个可以添加信息的构造,又违背了设计枚举的初衷(统一管理状态码和msg,在JsonResult中只能用枚举)
     */
}
