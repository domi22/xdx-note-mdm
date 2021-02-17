package xdx.note.mdm.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import xdx.note.framework.common.param.Info;
import xdx.note.framework.common.param.ResultUtil;


@RestControllerAdvice
public class GlobalExceptionHandler {

    Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 未知异常兜底
     * @param ex
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public Info handleUnknownException(Exception ex) {
        logger.error(ex.getMessage(), ex);
        return ResultUtil.fail(Code.FAIL);
    }





}
