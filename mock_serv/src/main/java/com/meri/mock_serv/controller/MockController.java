package com.meri.mock_serv.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController("/")
public class MockController {

    @PostMapping(value = "/first", produces = MediaType.APPLICATION_XML_VALUE)
    public String first(@RequestBody String filter){

        //parse the filter
        //find data elsewhere
        //return the xml result;

        String result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<pricing>\n" +
                "    <quote term=\"12\">\n" +
                "        <location address=\"Pushkin st. 59\" city=\"Odessa\" country=\"Ukraine\"/>\n" +
                "        <price mrc=\"12.5\" nrc=\"150.0\"/>\n" +
                "    </quote>\n" +
                "    <quote term=\"24\">\n" +
                "        <location address=\"Pushkin st. 59\" city=\"Odessa\" country=\"Ukraine\"/>\n" +
                "        <price mrc=\"10.5\" nrc=\"130.0\"/>\n" +
                "    </quote>\n" +
                "</pricing>\n";



        return result;
    }


    @PostMapping(value = "/second", produces = MediaType.APPLICATION_JSON_VALUE)
    public String second(@RequestBody String filter){

        //parse the filter
        //find data elsewhere
        //return the json result;

        String result = "[\n" +
                "  {\n" +
                "    \"street\": \"Pushkin st. 59\",\n" +
                "    \"city\": \"Odessa\",\n" +
                "    \"country\": \"Ukraine\",\n" +
                "    \"term\": \"1yr\",\n" +
                "    \"mrc\": 300,\n" +
                "    \"nrc\": null\n" +
                "  }\n" +
                "]\n";


        return result;
    }


}
