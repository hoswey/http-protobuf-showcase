<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>

    <head>
        <title></title>
        <script src="assets/jquery-1.11.3.min.js"></script>
        <script src="assets/long.js"></script>
        <script src="assets/byteBuffer.js"></script>
        <script src="assets/ProtoBuf.js"></script>
    </head>

    <body>
        <script>
        $(document).ready(function() {

            var ProtoBuf = dcodeIO.ProtoBuf;
            var com = ProtoBuf.loadProtoFile("protobuf/echo.proto").build("com");
            Text = com.hoswey.showcase.protobuf.Text;

            var xhr = new XMLHttpRequest();
            xhr.open('post', '/echo', true);
            xhr.responseType = 'arraybuffer';

            xhr.onload = function(e) {
                // response is unsigned 8 bit integer
                var responseArray = new Uint8Array(this.response);
                var json = Text.decode(responseArray);
                document.writeln("Message: " + json.message);
                document.writeln("<br>")
                document.writeln("Body: " + json.body);
            };

            xhr.send();

        });
        </script>
    </body>

    </html>
