package exception_practice;

public class MyException extends Throwable{
    private int code;
    private String msg;

    public MyException() {
        code = -1;
        msg = "Unknown";
    }
    public MyException(int c, String s){
        code = c;
        msg = s;
    }
    public int getCode(){
        return code;
    }
    public String getMessage() {
        return msg;
    }
    public void setCode(int c){
        code = c;
    }
    public void setMessage(String m){
        msg = m;
    }
    public String toString() {
        return "code: " + code + "  msg: " + msg;
    }

}
