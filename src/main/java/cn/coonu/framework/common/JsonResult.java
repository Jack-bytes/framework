package cn.coonu.framework.common;

public class JsonResult<T> {

    private Integer code = JsonResultStatus.SUCCESS.getCode();

    private String message = JsonResultStatus.SUCCESS.getMessage();

    private T data;

    public JsonResult() {

    }

    public JsonResult(JsonResultStatus status) {
        this.code = status.getCode();
        this.message = status.getMessage();
    }

    public JsonResult(Throwable e) {
        this.code = 500;
        this.message = e.getMessage();
    }

}
