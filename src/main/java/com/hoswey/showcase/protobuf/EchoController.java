/**
 * @(#)EchoController.java, Nov 30, 2015. 
 * 
 * Created by Hoswey
 * 
 * Copyright 2015 Feigong, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.hoswey.showcase.protobuf;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hoswey.showcase.protobuf.Echo.Text;

@Controller
public class EchoController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String echo() {

        return "echo";
    }

    @RequestMapping(value = "/echo", method = RequestMethod.POST)
    String doEcho(@RequestParam(name = "msg", required = false) String msg, HttpServletResponse reponse) throws IOException {

        if (msg == null || msg.trim().length() == 0) {
            msg = "Hello World";
        }

        Text text = Text.newBuilder().setMessage(msg).setBody("body").build();

        OutputStream outputSream = reponse.getOutputStream();
        //text.writeTo(reponse.getOutputStream());

        outputSream.write(text.toByteArray());
        outputSream.flush();
        return "ajax";
    }
}
