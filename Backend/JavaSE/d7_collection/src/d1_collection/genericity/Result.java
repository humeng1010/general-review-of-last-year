package d1_collection.genericity;

public class Result<T> {
    private Boolean success;
    private T data;
    private String message;

    public Result(T data) {
        this.success = true;
        this.data = data;
        this.message = "success";
    }

    public Result( String message) {
        this.success = false;
        this.data = null;
        this.message = message;
    }

    public Result() {

    }

    public Result<T> ok(T data){
        return new Result<>(data);
    }
    public Result<T> fail(String message){
        return new Result<>(message);
    }

    @Override
    public String toString() {
        return "Result{" +
                "success=" + success +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
