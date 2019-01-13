package ink.teamwork.common.domain;


import lombok.Builder;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@Builder
public class Result implements Serializable {

    private String code;
    private boolean success;
    private String msg;
    private Object data;
    private List list;

    private Integer currentPage;
    private Integer pageSize;
    private Long total;

    public static Result of(int currentPage, int pageSize, long total, List list) {
        return Result.builder()
                .currentPage(currentPage)
                .pageSize(pageSize)
                .total(total)
                .list(list)
                .build();
    }

    public static Result emptyList() {
        return Result.builder()
                .currentPage(0)
                .pageSize(0)
                .total(0l)
                .list(Collections.emptyList())
                .build();
    }

    public static Result of(boolean success) {
        return Result.builder()
                .success(success)
                .build();
    }

    public static Result of(String msg) {
        return Result.builder()
                .success(false)
                .msg(msg)
                .build();
    }

    public static Result of(Object data) {
        return Result.builder()
                .success(true)
                .data(data)
                .build();
    }

    public static Result of(boolean success, String msg) {
        return Result.builder()
                .success(success)
                .msg(msg)
                .build();
    }

    public static Result of(boolean success,String code,String msg){
        return Result.builder()
                .success(success)
                .code(code)
                .msg(msg)
                .build();
    }

    public static Result of(boolean success,Object data){
        return Result.builder()
                .success(success)
                .data(data)
                .build();
    }


}
