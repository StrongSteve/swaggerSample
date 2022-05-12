package com.project.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Api("sampleApi")
public interface SampleAPI {

    String API_PREFIX = "/api/sample";

    /**
     * WORKING - @RequestParam with name
     * @param name
     * @return
     */
    @ApiOperation("TODO Description for method")
    @GetMapping(value = API_PREFIX + "/echo", produces = MediaType.APPLICATION_JSON_VALUE)
        //@RequestParam(name = "from") String from
    String echo(@RequestParam(name = "name") String name);

    /**
     * NOT WORKING - @RequestParam without name
     * @param name
     * @return
     */
    @ApiOperation("TODO Description for method")
    @GetMapping(value = API_PREFIX + "/noEcho", produces = MediaType.APPLICATION_JSON_VALUE)
    //@RequestParam(name = "from") String from
    String noEcho(@RequestParam() String name);

}
