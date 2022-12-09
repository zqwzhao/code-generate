package top.zhaoqw.codegenerate.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zhaoqw.codegenerate.entity.vo.CommonCodeVO;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 * @author zhaoqw
 * @date 2022/11/23
 */
@RestController
@RequestMapping("/okhttp-demo")
public class OkHttpController {
    private final Logger logger = LoggerFactory.getLogger(OkHttpController.class);

    /**
     * 查询公共代码树
     *
     * @return 公共代码树结构
     */
    @GetMapping(value = "/commonCodeTree")
    public JSONObject commonCodeTree() throws Exception {
        // 拿到OkHttpClient对象
        OkHttpClient client = new OkHttpClient();
        // 构造requests
        Request request = new Request.Builder()
                .get()
                .url("http://localhost:30003/cable-lean-common-app/common/commonCode/commonCodeTree")
                .build();
        // Request封装为Call
        Call call = client.newCall(request);


        //同步调用,返回Response,会抛出IO异常
        Response response = call.execute();
        ResponseBody body = response.body();
        String string = body.string();
        JSONObject jsonObject = JSON.parseObject(string);

        return jsonObject;
    }
}
